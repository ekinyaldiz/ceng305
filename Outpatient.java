import javax.swing.JOptionPane;
/**
 * Write a description of class Outpatient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Outpatient extends Patient
{ 
    /**
     * Constructor for objects of class Outpatient
     */
    public Outpatient(int id, String name, int age, String sex, String address, double balance )
    {
        super(id, name, age, sex, address, balance);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return ("Name: " + super.getName() +
                "Registration Id: " + super.getRegistrationId() +
                "Age: " + super.getAge() +
                "Sex: " + super.getSex() +
                "Address: " + super.getAddress() +
                "Balance: " + super.getBalance());
    }
}
