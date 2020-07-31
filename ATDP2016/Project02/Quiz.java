import java.awt.Rectangle;
/**
 * FRQ Chapter 2 Quiz
 * 
 * @author Inan Xu 
 * @version June 27, 2016 v1.0.0
 */
public class Quiz
{
    public static void main (String[] args)
    {
        
        // Create the rectangle
        Rectangle rect = new Rectangle(100, 100, 30, 10);
        
        // Assign some values to variables
        double area1 = (rect.getWidth()) * (rect.getHeight());
        double width2 = rect.getWidth() * 2;
        double height2 = rect.getHeight() * 2;
        
        // Original Width and Height, Area
        System.out.print("Original Width, Original Height: " + rect.getWidth() + ", " + rect.getHeight() + " Expected: 30, 10");
        System.out.print("\nArea: " + area1 + " Expected: 300");
        
        // Doubled Width, Original Height, Area
        System.out.print("\n\nDoubled Width, Original Height: " + width2 + ", " + rect.getHeight() + " Expected: 60, 10");
        System.out.print("\nArea: " + width2 * rect.getHeight() + " Expected: 600");
        
        // Original Width, Doubled Height, Area
        System.out.print("\n\nOriginal Width, Doubled Height: " + rect.getWidth() + ", " + height2 + " Expected: 30, 20");
        System.out.print("\nArea: " + rect.getWidth() * height2 + " Expected: 600");
        
        // Doubled Width and Height, Area
        System.out.print("\n\nDoubled Width, Doubled Height: " + width2 + ", " + height2 + " Expected: 60, 20");
        System.out.print("\nArea: " + width2 * height2 + " Expected: 1200");
    }
}
