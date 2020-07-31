import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
   This program demonstrates how to install an action listener.
*/
public class InvestmentViewer3
{  
   // Decide the dimension of the window
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 200;
   private static final double INTEREST_RATE = 10;
   private static final double INITIAL_BALANCE = 1000;
   public static void main(String[] args)
   {
      // Prepare the window
      JFrame frame = new JFrame();
      

      JButton button = new JButton("Add Interest");
      
      final BankAccount account = new BankAccount(INITIAL_BALANCE);
      
      final JLabel balLabel = new JLabel("Balance:" + account.getBalance());
      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(balLabel);
      frame.add(panel);
      
      class AddInterestListener implements ActionListener { // this is an inner class, i.e., inside main method
          public void actionPerformed(ActionEvent event) { // override this method to respond
              double interest = account.getBalance() * INTEREST_RATE / 100;
              account.deposit(interest);
              balLabel.setText("Balance: " + account.getBalance());
          }
      }
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      ActionListener listener = new AddInterestListener();
      button.addActionListener(listener);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true); 

      
    }
}
