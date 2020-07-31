
/**
 * This is a public test of the rectangle class.
 * 
 * @author Inan
 * @version v1.1.159 June 24, 2016
 */
import java.awt.Rectangle;
public class ClassTester
{
    public static void main (String[] args)
    {
        int x = 5, y = 10, w = 20, h = 30;
        
        Rectangle box = new Rectangle(x, y, w, h);
        
        System.out.println("------------------------------------------------------");
        
        double bW = box.getWidth();
        System.out.println("New width: " + bW);
        System.out.println("Expected width: " + 20);
        
        double bH = box.getHeight();
        System.out.println("\nNew Height: " + bH);
        System.out.println("Expected Height: " + 30);
        
        double bA = box.getHeight() * box.getWidth();
        System.out.println("\nNew Area: " + bA);
        System.out.println("Expected Area: " + 600);
        
        double bP = (box.getHeight() * 2) + (box.getWidth() * 2);
        System.out.println("\nNew Perimeter: " + bP);
        System.out.println("Expected Perimeter: " + 100);
    } 
}
