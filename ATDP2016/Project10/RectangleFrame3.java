import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Rectangle;
/**                         
   This frame contains a moving rectangle.
*/
public class RectangleFrame3 extends JFrame {
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;
   private static Graphics g;
   private RectangleComponent3 scene;

   class MousePressListener implements MouseListener {  
      public void mousePressed(MouseEvent event) {  
         int x = event.getX();
         int y = event.getY();
          scene.createNewRectangle(x, y);
         
      }

      // Do-nothing methods
      public void mouseReleased(MouseEvent event) {}
      public void mouseClicked(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
   }
         
   public RectangleFrame3() {
      scene = new RectangleComponent3();
      add(scene);

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      // Prepare a listener & link to the scene
      MouseListener listener = new MousePressListener();
      scene.addMouseListener(listener);
   }
} 
