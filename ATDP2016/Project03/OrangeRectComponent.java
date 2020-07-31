import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws a few shapes.
 * @author Inan
 * @version 1.0.0
*/
public class OrangeRectComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      /* Rather than having the code to directly draw a car here
       * (by using Rectangle, Ellipse2D.Double, etc.), we take
       * the code & put it in a separate class called Car. This way, 
       * we can display as many cars as possible, by simply creating
       * "new" car, at various location (x, y).
       */

      // Draw a OrangeRect at the top-left corner
      int OrangeRectLen = 60;               // the length of the car
      OrangeRect OrangeRect1 = new OrangeRect(0, 0, OrangeRectLen);
      OrangeRect1.draw(g2);
      
      
      // Coordinates of bottom-right corner
      int right = getWidth(); // the width of the view
      int bot = getHeight();  // the height of the view
      
      // Draw a car randomly in the middle third (vertically)
      OrangeRectLen = 120;                  // the length of the car - note: do NOT declare again
      Random randGen = new Random(); // create object for random number generator
      
      int x = randGen.nextInt(right - OrangeRectLen);
      int y = randGen.nextInt(bot/3) + bot/3 - OrangeRectLen/2;

      OrangeRect OrangeRect2 = new OrangeRect(x, y, OrangeRectLen);
      OrangeRect2.draw(g2);      
      
      // Draw a car at the bottom-right corner
      OrangeRectLen = 200;               // the length of the car - note: do NOT declare again
      x = getWidth() - OrangeRectLen;    
      y = getHeight() - OrangeRectLen/2; 
      OrangeRect OrangeRect3 = new OrangeRect(x, y, OrangeRectLen);
      OrangeRect3.draw(g2);      

      
      
      // Draw other things here ...-----------------------------
      
    }
}
