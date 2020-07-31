import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
   This program demonstrates how to install an action listener.
*/
public class ButtonViewer3
{  
   // Decide the dimension of the window
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 60;
   private static String typeA = "A";
   private static String typeB = "B";
   private static int n;
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      JButton button = new JButton("Button A");
      JPanel panel = new JPanel();
      panel.add(button);
      

      class ClickListener implements ActionListener { 
          public void actionPerformed(ActionEvent event) { 
              System.out.println("Button " + typeA + " was clicked.");
             
          }
        
      }
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);
      
      
      JButton button2 = new JButton("Button B");
      panel.add(button2);
      
      class ClickListener2 implements ActionListener { 
          public void actionPerformed(ActionEvent event) { 
              System.out.println("Button " + typeB + " was clicked.");
              
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
