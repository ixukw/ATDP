import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.util.ArrayList;
/**
   This component displays a rectangle that can be moved. 
*/
public class RectangleComponent3 extends JComponent
{
   private static final int BOX_X = 100;
   private static final int BOX_Y = 100;
   private static final int BOX_WIDTH = 20;
   private static final int BOX_HEIGHT = 30;
   private static ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
   private Rectangle box;

   public RectangleComponent3()
   {  
      // The rectangle that the paintComponent method draws 
      ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();  
   }

   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      for (int i = 0; i < rectangleList.size(); i++) {
          g2.draw(rectangleList.get(i));
      }
   }

   /**
      Moves the rectangle to the given location.
      @param x the x-position of the new location
      @param y the y-position of the new location
   */
   public void createNewRectangle(int x, int y)
   {
      
      
      Rectangle rect = new Rectangle(x, y, 20, 30);
      rectangleList.add(rect);
      repaint();
   }
}
