import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.Date;
                                        /** THIS IS EXERCISE 10.27 */
public class PrintTime extends JFrame {
    class TimerListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
          Date now = new Date();
          System.out.println(now);
      }
   }

   public PrintTime() {
        ActionListener listener = new TimerListener();
        final int DELAY = 1000; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();      
   }
   
   public static void main (String[] args) {
       Date now = new Date();
       System.out.println(now);
       PrintTime time = new PrintTime();
   }
}
