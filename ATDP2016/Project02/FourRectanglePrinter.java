
/**
 * Write a description of class FourRectanglePrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
public class FourRectanglePrinter
{
    public static void main (String[] args)
    {
        Rectangle box = new Rectangle(0, 0, 4, 5);
        System.out.println("X Pos: " + box.getX() + " Y Pos: " + box.getY());
        
        box.translate(4, 0);
        System.out.println("X Pos: " + box.getX() + " Y Pos: " + box.getY());
        
        box.translate(0, 5);
        System.out.println("X Pos: " + box.getX() + " Y Pos: " + box.getY());
        
        box.translate(4, 5);
        System.out.println("X Pos: " + box.getX() + " Y Pos: " + box.getY());
    }
}
