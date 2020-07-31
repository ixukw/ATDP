
/**
 * Write a description of class E2_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
public class E2_4
{
    public static void main (String[] args)
    {
        Rectangle box = new Rectangle(10, 10, 6, 7);
        System.out.print("\nWidth: " + box.getWidth());
        System.out.print(" Height: " + box.getHeight());
        
        Rectangle box2 = new Rectangle(10, 10, 14, 7);
        System.out.println("\nWidth: " + box2.getWidth() + " Height: " + box2.getHeight());
    }
}
