import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    private int staffId;
    private double salary;
    private ArrayList<Patient> patients = new ArrayList<Patient>();
    /**
     * Constructor for objects of class Doctor
     */
    public Doctor(int staffId, String name, int age, String sex, String address, double salary)
    {
        super(name, age, sex, address);
        this.staffId = staffId;
        this.salary = salary;
    }
    /**
     * Getters and setters
     */
    public String getName()
    {
        return super.getName();
    }
    public void setName()
    {
        super.setName();
    }
    public int getAge()
    {
        return super.getAge();
    }
    public void setAge()
    {
        super.setAge();
    }
    public int getStaffId()
    {
        return this.staffId;
    }
    public void setStaffId()
    {
        this.staffId = Integer.parseInt(JOptionPane.showInputDialog("Set Staff ID: "));
    }
    public String getSex()
    {
        return super.getSex();
    }
    public void setSex()
    {
        super.setSex();
    }
    public String getAddress()
    {
        return super.getAddress();
    }
    public void setAddress()
    {
        super.setAddress();
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void setSalary()
    {
        this.salary = Double.parseDouble(JOptionPane.showInputDialog("Set Address: "));
    }
    /**
     * Shows Doctor details.
     */
    public String toString()
    {
        return("Name: " + super.getName() +
               "Staff ID: " + staffId +
               "Age: "  + super.getAge() +
               "Sex: "  + super.getSex() +
               "Salary: " + salary);
    }
    public double getMoneyAmountInCurrency(String currency)
    {
        if(currency == "USD")
            return (this.salary/6.0);
        if(currency == "EUR")
            return (this.salary/6.7);
        if(currency == "GST")
            return(this.salary/8.0);
        return this.salary;
    }
    public void addPatient(Patient p)
    {
        patients.add(p);
    }
    public void removePatient(Patient p)
    {
        patients.remove(p);
    }
    /**
     * Gives the list of patients of doctor.
     */
    public ArrayList<Patient> getPatientList()
    {
        return patients;
    }
}
