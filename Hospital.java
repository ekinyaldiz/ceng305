import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * 
 */
public class Hospital
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList();

    /**
     * Constructor for objects of class Hospital
     */
    public Hospital(String name)
    {
        this.name = name;
    }
    //Getter and setter
    public String getName()
    {
        return this.name;
    }
    public void setName()
    {
        this.name = JOptionPane.showInputDialog("Set hospital name: ");
    }
    /**
     * Removes the dr with the matching staffId from the list: doctors.
     */
    public void removeDoctor(int staffId)
    {
        int i,size = 4;
        for(i=0;i<size;i++) {
            if(doctors.get(i).getStaffId() == staffId) {
                doctors.remove(doctors.get(i));
                break;
            }
        }
    }
    public void addDoctor(Doctor dr)
    {
        doctors.add(dr);
    }
    public void printHospitalDetails()
    {
        System.out.println("Hospital name: " + this.name);
        int i,j;
        for(i = 0; i<doctors.size(); i++) {
            System.out.println("Doctor " + (i+1) + "\n----------\n" +
                                doctors.get(i).toString());
            for(j = 0; j<doctors.get(i).getPatientList().size(); j++) {
               System.out.println("Patient " + (j+1) + "\n" +
                                    doctors.get(i).getPatientList().get(j).toString() + "\n\n");
            }
        }
        return;
    }
    public void findAndPrintPatients(String key)
    {
        int i, j,count = 0;
        for(j = 0; j<doctors.size(); j++) {
            for(i = 0; i<doctors.get(j).getPatientList().size(); i++) {
                if(doctors.get(j).getPatientList().get(i).findNameMatch(key)) {
                    count++;
                    System.out.println(doctors.get(j).getPatientList().get(i).toString());
                }
            }
        }
        if(count == 0)
            System.out.println("Search results: ------------\nNo patients found");
        return;
    }
}
