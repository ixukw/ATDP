import java.awt.Graphics;
import java.util.Random;
import javax.swing.JComponent;
import java.awt.Color;
public class OlympicComponent extends JComponent 
{  
   public void paintComponent(Graphics g)
   {
       // Type 1:
       /*
       for (int i = 0; i < 3; i++) {
           Random rand = new Random();
           int x = rand.nextInt(350);
           int y = rand.nextInt(400);
           
           if (x < 100) {
               x += 100;
           }
           
           if (y < 100) {
               y += 100;
           }
           Random rand3 = new Random();
           int radius = rand3.nextInt(100);
           if (radius < 30) {
               radius += 30;
           }
           OlympicLogo understand = new OlympicLogo(g);
           understand.createOlympicLogo(x, y, radius);
       }
       */
       // Type 2:
       
       int w = 80;
       int h = 80;
       for (int i = 0; i < 3; i++) {
           Random rand4 = new Random();
           
           if (i == 1) {
               w = 300;
           } else if (i == 2) {
               w = 150;
               h = 200;
           }
           int x = w + rand4.nextInt(100);
           int y = h + rand4.nextInt(200);
           
           if (x < 100) {
               x += 100;
           }
           
           if (y < 100) {
               y += 100;
           }
           Random rand2 = new Random();
           int radius = rand2.nextInt(70);
           if (radius < 30) {
               radius += 30;
           }
           OlympicLogo understand = new OlympicLogo(g);
           understand.createOlympicLogo(x, y, radius);
       }
       
   }
}
