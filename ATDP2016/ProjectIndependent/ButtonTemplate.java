import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
   This program demonstrates how to install an action listener.
*/
public class ButtonTemplate
{  
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 60;

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      
      JButton button = new JButton("Experimental");
      button.setSize(100,100);
      panel.add(button);
      class ClickListener implements ActionListener {
          public void actionPerformed(ActionEvent event) {
             
          }
      }
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);  
      
      
      JButton button2 = new JButton("Act");
      button2.setSize(100,100);
      panel.add(button2);
      class ClickListener2 implements ActionListener {
          public void actionPerformed(ActionEvent event) {
             
          }
      }
      frame.add(panel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true); 
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
