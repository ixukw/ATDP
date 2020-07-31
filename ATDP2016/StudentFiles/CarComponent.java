import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws a few cars.
 * @author C. Horstmann, modified by A. Nguyen
 * @version 1.0
*/
public class CarComponent extends JComponent
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

      // Draw a car at the top-left corner
      int carLen = 60;               // the length of the car
      Car car1 = new Car(0, 0, carLen);
      car1.draw(g2);
      
      
      // Coordinates of bottom-right corner
      int right = getWidth(); // the width of the view
      int bot = getHeight();  // the height of the view
      
      // Draw a car randomly in the middle third (vertically)
      carLen = 120;                  // the length of the car - note: do NOT declare again
      Random randGen = new Random(); // create object for random number generator
      
      int x = randGen.nextInt(right - carLen);
      int y = randGen.nextInt(bot/3) + bot/3 - carLen/2;

      Car car2 = new Car(x, y, carLen);
      car2.draw(g2);      
      
      // Draw a car at the bottom-right corner
      carLen = 200;               // the length of the car - note: do NOT declare again
      x = getWidth() - carLen;    
      y = getHeight() - carLen/2; 
      Car car3 = new Car(x, y, carLen);
      car3.draw(g2);      

      
      
      // Draw other things here ...
   }
}
