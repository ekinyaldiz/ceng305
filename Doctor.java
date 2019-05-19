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
        return this.name;
    }
    public void setName()
    {
        this.name = JOptionPane.showInputDialog("Set Name: ");
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge()
    {
        this.age = Integer.parseInt(JOptionPane.showInputDialog("Set age: "));
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
        return this.sex;
    }
    public void setSex()
    {
        this.sex = JOptionPane.showInputDialog("Set Sex: ");
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress()
    {
        this.address = JOptionPane.showInputDialog("Set Address: ");
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return("Name: " + name +
               "Staff ID: " + staffId +
               "Age: "  + age +
               "Sex: "  + sex +
               "Salary: " + salary);
    }
}
