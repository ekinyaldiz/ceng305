import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient extends Person
{
    // instance variables - replace the example below with your own
    private int registrationId;
    private double balance;

    /**
     * Constructor for objects of class Patient
     */
    public Patient(int id, String name, int age, String sex, String address, double balance)
    {
        super(name, age, sex, address);
        this.registrationId = id;
        
    }
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
    public int getRegistrationId()
    {
        return this.registrationId;
    }
    public void setRegistrationId()
    {
        this.registrationId = Integer.parseInt(JOptionPane.showInputDialog("Set Staff ID: "));
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
        return this.balance;
    }
    public void setSalary()
    {
        this.balance = Double.parseDouble(JOptionPane.showInputDialog("Set Address: "));
    }
    //Returns patient details
    public String toString()
    {
        return("Name: " + name +
               "Registration ID: " + registrationId +
               "Age: "  + age +
               "Sex: "  + sex +
               "Balance: " + balance);
    }
    public double getMoneyAmountInCurrency(String currency)
    {
        //TODO: Actually fill it in.
        return 1.2;
    }
}
