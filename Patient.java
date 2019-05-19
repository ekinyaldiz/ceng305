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
        super.getAddress();
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setBalance()
    {
        this.balance = Double.parseDouble(JOptionPane.showInputDialog("Set Address: "));
    }
    //Returns patient details
    public String toString()
    {
        return("Name: " + super.getName() +
               "Registration ID: " + registrationId +
               "Age: "  + super.getAge() +
               "Sex: "  + super.getSex() +
               "Balance: " + this.balance);
    }
    public double getMoneyAmountInCurrency(String currency)
    {
        if (currency == "USD")
            return this.balance/6.00;
        if (currency == "EUR")
            return this.balance/6.70;
        if (currency == "GBP")
            return this.balance/7.86;
        return this.balance;
    }
    public boolean findNameMatch(String key)
    {
        if(super.getName().contains(key))
            return true;
        return false;
    }
}
