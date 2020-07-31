import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
   This program demonstrates how to install an action listener.
*/
public class ButtonViewer
{  
   // Decide the dimension of the window
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 60;
   private static int x;
   public static void main(String[] args)
   {
      // Prepare the window
      JFrame frame = new JFrame();
      
      // Prepare the button & add it to the window
      JButton button = new JButton("Click ME!");
      frame.add(button);

      // Prepare the response for when the user clicks the button

      class ClickListener implements ActionListener { // this is an inner class, i.e., inside main method
          public void actionPerformed(ActionEvent event) { // override this method to respond
             System.out.println("You clicked this button " + x + "times...");
             x++;
          }
        
      }

      // Link the listener to the button
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);      }
}
