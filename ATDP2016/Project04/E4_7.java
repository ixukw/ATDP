import java.util.Scanner;
/**
 * Write a description of class E4_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E4_7
{
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double amount = reader.nextInt();
        
        System.out.print("Circumference: " + amount * Math.PI * 2);
        System.out.print("\nArea: " + amount * amount * Math.PI);
    }
}
