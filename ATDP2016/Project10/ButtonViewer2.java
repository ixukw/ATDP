import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
   This program demonstrates how to install an action listener.
*/
public class ButtonViewer2
{  
   // Decide the dimension of the window
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 60;
   private static int x;
   private static int n;
   public static void main(String[] args)
   {
      // Prepare the window
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      
      JButton button = new JButton("Click ME!");
      panel.add(button);
      class ClickListener implements ActionListener { 
          public void actionPerformed(ActionEvent event) { 
             System.out.println("You clicked this button " + x + " times...");
             x++;
          }
        
      }
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);
      
      JButton button2 = new JButton("CLICK ME!");
      panel.add(button2);
      class ClickListener2 implements ActionListener {
          public void actionPerformed(ActionEvent event) {
             System.out.println("[Button 2] You clicked this button " + n + " times...");
             n++;
          }
      }
      ActionListener listener2 = new ClickListener();
      button2.addActionListener(listener2);
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);  
      frame.add(panel);
   }
}
