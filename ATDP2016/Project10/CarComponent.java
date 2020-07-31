import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
   This component displays a rectangle that can be moved. 
*/
public class CarComponent extends JComponent
{  
   private int xLeft;
   private int yTop;
   private int delta;
   private Rectangle body;
   private Ellipse2D frontTire;
   private Ellipse2D rearTire;
   private Point2D r1;
   private Point2D r2;
   private Point2D r3;
   private Point2D r4;
   private Line2D frontWindshield;
   private Line2D roofTop;
   private Line2D rearWindshield;

   public CarComponent()
   {  
      // The car body
      Rectangle body = new Rectangle(xLeft, yTop + delta, delta*6, delta);      
      
      // The 2 tires
      Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + delta, yTop + delta*2, delta, delta);
      Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + delta*4, yTop + delta*2, delta, delta);

      // The point at the bottom of the front windshield
      Point2D.Double r1 = new Point2D.Double(xLeft + delta, yTop + delta);
      // The  point at the front of the roof
      Point2D.Double r2 = new Point2D.Double(xLeft + delta*2, yTop);
      // The  point at the rear of the roof
      Point2D.Double r3 = new Point2D.Double(xLeft + delta*4, yTop);
      // The  point at the bottom of the rear windshield
      Point2D.Double r4 = new Point2D.Double(xLeft + delta*5, yTop + delta);

      // The lines for front windshield, roof, & rear windshield
      Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
      Line2D.Double roofTop = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
   
             
   }

   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      // Draw the entire car
      g2.draw(body);
      g2.draw(frontTire);
      g2.draw(rearTire);
      g2.draw(frontWindshield);      
      g2.draw(roofTop);      
      g2.draw(rearWindshield);  
   }

   /**
      Moves the rectangle by a given amount. 
      @param dx the amount to move in the x-direction 
      @param dy the amount to move in the y-direction 
   */
   public void moveCarBy(int dx, int dy)
   {
      body.translate(dx, dy);
      Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + delta + dx, yTop + delta*2 + dy, delta, delta);
      Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + delta*4 + dx, yTop + delta*2 + dy, delta, delta);
      Point2D.Double r1 = new Point2D.Double(xLeft + delta + dx, yTop + delta + dy);
      Point2D.Double r2 = new Point2D.Double(xLeft + delta*2 + dx, yTop + dy);
      Point2D.Double r3 = new Point2D.Double(xLeft + delta*4 + dx, yTop + dy);
      Point2D.Double r4 = new Point2D.Double(xLeft + delta*5 + dx, yTop + delta + dy);

      Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
      Line2D.Double roofTop = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
      repaint();
   }
}
