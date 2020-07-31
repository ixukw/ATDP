import java.util.Scanner;
/**
 * Write a description of class P4_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P4_2
{
    public static void main (String[] args)
    {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a year: ");
        double year = reader.nextInt();
        
        double a = year%19;
        double b = year/100;
        double c = year%100;
        double d = b/4;
        double e = b%4;
        double g = (8 * b + 13) / 25;
        double h = (19 * a + b - d - g + 15) % 30;
        double j = c/4;
        double k = c%4;
        double m = (a + 11 * h) / 39;
        double r = (2 * e + 2 * j - k - h + m + 32) % 7;
        double n = (h - m + r + 90) / 25;
        double p = (h - m + r + n + 19) % 32;
        
        System.out.print("\nIn " + year + ", Easter will fall on " + (int)n + " " + (int)p + ".");
    }
}
