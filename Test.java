public class Test{
    public static void main(String args[]){
        Hospital h = new Hospital("Medico"); //Hospital name is "Medico"
        
        Doctor d = new Doctor(111222, "ali", 50, "m", "ankara", 6000); //staffId, name, age, sex, address, salary 
        h.addDoctor(d);
        Inpatient in = new Inpatient(333444, "veli", 32, "m", "istanbul", 345.40, 410);
        d.addPatient(in); //Inpatient in is registered to Doctor d.
        Outpatient out = new Outpatient(555666, "helin", 28, "f", "izmir", 610.35); 
        d.addPatient(out); //Outpatient out is registered to Doctor d.
        System.out.println("Doctor Ali salary in USD: "+d.getMoneyAmountInCurrency("USD")); //prints doctor salary in USD as 6000/6.0=1000.0
        System.out.println("Inpatient Veli balance to be paid in EUR: "+in.getMoneyAmountInCurrency("EUR")); //prints Veli balance in EUR as 345.40/6.7=51.55223880597014
        System.out.println("Outpatient Ali balance to be paid in GBP: "+out.getMoneyAmountInCurrency("GBP")); //prints Ali balance in GBP as 610.35/7.86=77.6526717557252
        h.printHospitalDetails(); //prints details of Doctor d and his 2 patients: veli and helin.
        h.findAndPrintPatients("ve"); //finds patients whose names include "ve" as substring. finds and prints the details of 1 patient: "veli".
        h.findAndPrintPatients("deneme"); //cannot find any patient whose name include "deneme" as substring. 
        h.removeDoctor(111222); //remove the doctor with staffId 111222 from the hospital. 
        h.printHospitalDetails(); //prints hospital name and then nothing, as no doctors (so no patients) are left now. 
        h.findAndPrintPatients("helin"); //no doctors and patients are available in hospital. cannot find anyone.
}}