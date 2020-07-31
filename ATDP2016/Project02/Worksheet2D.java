import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.Font;
/**
   Worksheet 2D
   Screen size: 480 X 400
   Version: June 27, 2016 v2.1.5
   
*/
public class Worksheet2D extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      // Prepare some colors from scratch (max=255): RGB, or RGB & alpha value
      Color colorbg1 = new Color(210, 235, 255); //200, 150, 180 is original
      Color colorPolygon2 = new Color(193, 58, 0); // Color for Polygon Line
      Color colorBlankOut = new Color(255, 255, 255, 255); // to blank out
      Color colorRect2 = new Color(107, 53, 0); // Color for Rectangle (House)
      Color colorRect3 = new Color(224, 123, 0); // Color for Door Rectangle (House)
      
      // Construct a few shapes
      Rectangle box1 = new Rectangle(5, 10, 470, 400); 
      Rectangle box2 = new Rectangle(65, 102, 145, 150);
      Rectangle box3 = new Rectangle(90, 172, 45, 80);
      Ellipse2D.Double oval1 = new Ellipse2D.Double(150, 250, 290, 70);
      Ellipse2D.Double oval2 = new Ellipse2D.Double(94, 212, 5, 5);
      Ellipse2D.Double oval3 = new Ellipse2D.Double(360, 50, 80, 80);
      
      // Construct a line
      Line2D.Double aLine = new Line2D.Double(50, 50, 100, 50);
      Line2D.Double aLine2 = new Line2D.Double(100, 70, 160, 70);
      Line2D.Double aLine3 = new Line2D.Double(150, 63, 190, 63);
      Line2D.Double aLine4 = new Line2D.Double(200, 50, 230, 50);
      Line2D.Double aLine5 = new Line2D.Double(240, 70, 270, 70);
      Line2D.Double aLine6 = new Line2D.Double(300, 80, 230, 80);
      Line2D.Double aLine7 = new Line2D.Double(370, 55, 300, 55);

      // Construct a polygon (HouseTop)
      int[] xCoords = {40, 70, 140, 205, 235};
      int[] yCoords = {140, 90, 90, 90, 140};
      Polygon aPoly = new Polygon(xCoords, yCoords, 5);
      
      
      // Draw rectangle (edge border)
      g2.setColor(Color.red);
      g2.draw(box1);
      
      // Fill rectangle
      box1.grow(-10, -10); // Shrink box, all 4 sides
      g2.setColor(colorbg1);
      g2.fill(box1);
      
      // Blank out some of the color inside the rectangle (background)
      box1.grow(-20, -20); // Shrink box, all 4 sides
      g2.setColor(colorBlankOut);
      g2.fill(box1);
      
      // Draw & Fill rectangle (house)
      g2.setColor(colorRect2);
      g2.draw(box2);
      g2.setColor(colorRect3);
      g2.draw(box3);
      g2.setColor(colorRect2); 
      g2.fill(box2);
      g2.setColor(colorRect3); 
      g2.fill(box3);
      
      // Fill oval
      Color colorobj1 = new Color(150, 150, 255);
      g2.setColor(colorobj1);    
      g2.fill(oval1);
      // Fill another oval
      g2.setColor(Color.BLACK);    
      g2.fill(oval2);
      
      g2.setColor(Color.YELLOW);    
      g2.fill(oval3);
      
      // Draw line
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.draw(aLine);
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.draw(aLine2);
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.draw(aLine3);
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.draw(aLine4);
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.draw(aLine5);
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.draw(aLine6);
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.BLUE); // use default color - see Color class in Java API    
      g2.draw(aLine7);
      
      // Draw & fill polygon
      g2.setColor(colorPolygon2);     
      g2.draw(aPoly);
      g2.setColor(Color.RED);  
      g2.fill(aPoly);
      
      // Write some text
      g2.setColor(Color.RED);
      Font stringFont = new Font("SansSerif", Font.ITALIC, 30 );
      g2.setFont(stringFont);
      g2.drawString("Welcome Home.", 120, 350);
   }
}
