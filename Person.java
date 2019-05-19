import javax.swing.JOptionPane;
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    protected String name, sex, address;
    protected int age;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age, String sex, String address)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        //TODO: Print details of person.
        return "x + y";
    }
    public double getMoneyAmountInCurrency(String currency)
    {
        if (currency == "EUR")
            return 1.0;
        if (currency == "USD")
            return 2.0;
        if (currency == "GSD")
            return 3.0;
        //Because java doesn't give warnings,
        //  it says "What do you know, anyways... I'm correct."
        return 0.0;
    }
}
