import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 * Write a description of class Inpatient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Inpatient extends Patient
{
    // instance variables - replace the example below with your own
    private int roomNo;

    /**
     * Constructor for objects of class Inpatient
     */
    public Inpatient(int id, String name, int age, String sex, String address, double balance, int roomNo )
    {
        super(id, name, age, sex, address, balance);
        this.roomNo = roomNo;
    }
    /**
     * Getters and setters
     */
    public int getRoomNo()
    {
        return this.roomNo;
    }
    public void setRoomNo()
    {
        this.roomNo = Integer.parseInt(JOptionPane.showInputDialog("Set Room No: "));
    }
    //Prints inpatient details
    public String toString()
    {
        return "0";
    }
}
