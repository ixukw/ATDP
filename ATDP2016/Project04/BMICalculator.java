import java.util.Scanner;
/**
 * Write a description of class E4_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BMICalculator
{
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("First Name, NOW! ");
        String name = reader.next();
        
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Your age, NOW!");
        int age = reader.nextInt();
        
        Scanner reader3 = new Scanner(System.in);
        System.out.println("Enter your current weight, NOW! (in lbs)");
        int weight = reader.nextInt();
        
        Scanner reader4 = new Scanner(System.in);
        System.out.println("Enter your approx. height in inches, NOW!");
        double height = reader.nextDouble();
        
        double wt = weight * 0.453592;
        double ht = height * 0.0254;
        
        double BMI = wt / (ht * ht);
        
        System.out.println("\nBMI of " + name + ", age " + age + ", is " + BMI);
        System.out.println("\n\n\n\nPast results: ");
        System.out.println("    BMI of Bob, age 10 is 131.");
        System.out.println("    BMI of Bob, age 0 is NaN.");
        System.out.println("    BMI of User, age 0 is Infinity.");
    }
}