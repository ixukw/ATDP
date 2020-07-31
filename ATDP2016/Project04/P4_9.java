import java.util.Scanner;
/**
 * Write a description of class P4_9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P4_9
{
    public static void main (String[] args)
    {
        
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Amount Due (Enter in a value): ");
        double cost = reader.nextDouble();
        
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Amount Paid (Enter in another value, MUST be higher than Amount Due.): ");
        double payment = reader2.nextDouble();
        

        double change = (payment - cost) * 100;
        double quarters = change/25;
        double dimes = (change%25)/10;
        double nickels = (change%25%10)/5;
        double pennies = (change%25510%5)/1;
        double dollars = (int)quarters/4;
        double quarters2 = (int)quarters - ((int)dollars * 4);
        
        System.out.print("Change given: " + (change / 100));
        System.out.print("\nDollars: " + (int)dollars);
        System.out.print("\nQuarters: " + (int)quarters2);
        System.out.print("\nDimes: " + (int)dimes);
        System.out.print("\nNickels: " + (int)nickels);
        System.out.print("\nPennies: " + (int)pennies);
    }
}
