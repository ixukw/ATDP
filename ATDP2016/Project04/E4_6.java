import java.util.Scanner;
/**
 * Write a description of class E4_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E4_6
{
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a measurement in meters: ");
        double amount = reader.nextDouble();
        
        double feet = (amount * 3.28084);
        System.out.print("In feet: " + feet);
    }
}
