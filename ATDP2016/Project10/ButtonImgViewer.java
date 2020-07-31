import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

/**
   This program demonstrates how to install an action listener.
*/
public class ButtonImgViewer
{  
   private static final int FRAME_WIDTH = 500;
   private static final int FRAME_HEIGHT = 300; ;

   public static void main(String[] args)
   {
      // Prepare the window
       JFrame frame = new JFrame();
      
      // Prepare the button
      ImageIcon bImg = new ImageIcon("round.gif");
      JButton button = new JButton("", bImg);
      button.setBackground(Color.RED); // note: the button dimension is larger than image
      frame.add(button);

      // Prepare the response when the user clicks the button
      final EasySound soundPiece = new EasySound("bells.wav"); // bell sound - must write final for Java version 7 & before
      class ClickListener implements ActionListener { 
          public void actionPerformed(ActionEvent event) {
              soundPiece.play();
            }
        }

      // Link the listener to the button
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
