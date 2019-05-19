import javax.swing.JOptionPane;
/**
 * Has attributes:
 * name
 * age
 * sex
 * address
 */
public abstract class Person
{
    // instance variables - replace the example below with your own
    private String name, sex, address;
    private int age;

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
    /**
     * Shows person details.
     */
    public String toString()
    {
        //TODO: Print details of person.
        return ("Name: " + this.name +
                "Age: " + this.age +
                "Sex: " + this.sex +
                "Address: " + this.address);
    }
    public abstract double getMoneyAmountInCurrency(String currency) ;
}
