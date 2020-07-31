import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
/**
 * This class is for a simple Rectangle (including drawing) that can be positioned anywhere on the screen,
 * and of any size.
 * 
 * @author C. Horstmann, modified by A. Nguyen, modified by Inan?
 * @verion ALPHA1.0
*/
public class OrangeRect
{
   private int xLeft;
   private int yTop;
   private int delta;

   /**
      Constructs a OrangeRect with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param approxLen the approximate length of the OrangeRect; the OrangeRect's height if half of the length
   */
   public OrangeRect(int x, int y, int approxLen)
   {
      xLeft = x;
      yTop = y;
      delta = approxLen / 6;
   }

   /**
      Draws the OrangeRect.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      //Prepare some colors!
      Color colorRect2 = new Color(107, 53, 0); // Color for OrangeRect (OrangeRect)
      Color colorRect3 = new Color(224, 123, 0); // Color for Door OrangeRect (OrangeRect)
      
      Rectangle box2 = new Rectangle(xLeft, yTop + delta, delta*6, delta); //65 102 145 150
      Rectangle box3 = new Rectangle(xLeft, yTop + delta, delta*6, delta);
      
      // Draw & Fill OrangeRect (OrangeRect)
      g2.setColor(colorRect2);
      g2.draw(box2);
      g2.setColor(colorRect3);
      g2.draw(box3);
      g2.setColor(colorRect2); 
      g2.fill(box2);
      g2.setColor(colorRect3); 
      g2.fill(box3);
      
   }
}
