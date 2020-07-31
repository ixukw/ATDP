import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Font;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Scanner;

/**
   This component draws stars.
*/
public class ReportComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      double score = 93.18;
      String date = "7/8/16";
      /*
      Scanner kBoard = new Scanner(System.in);
      System.out.println("Enter the score of this student: ");
      double score = kBoard.nextDouble();
      
      Scanner kBoard2 = new Scanner(System.in);
      System.out.println("Enter the current date (PST): ");
      String date = kBoard2.next();
      
      g2.setColor(Color.LIGHT_GRAY);
      g2.draw(new Rectangle(0, 0, 480, 700)); // paper
      g2.draw(new Rectangle(0, 450, 480, 250)); // leave this area blank (for teacher)
      */
      
      // Show image at top-right area
      BufferedImage img = null; 
      try {

          img = ImageIO.read(new File("HouseShape.png")); // specify file name of the image here
        } 
        catch (IOException e) { 
        }

      int x = 215, y = 10;
      if (img != null && g2.drawImage(img, x, y, null));

      Color logoColor = new Color(0, 74, 178);
      // ATDP Logo in top left.
      g2.setColor(logoColor);
      // ATDP Letter A:
      g2.drawRect(40, 40, 5, 30);
      g2.fillRect(40, 40, 5, 30);
      g2.drawOval(20, 45, 20, 20);
      g2.fillOval(15, 40, 30, 30);
      g2.drawOval(15, 40, 30, 30);
      g2.setColor(Color.WHITE);
      g2.fillOval(20, 45, 20, 20);
      g2.setColor(logoColor);
      
      // ATDP Letter T:
      g2.drawRect(60, 20, 5, 50);
      g2.fillRect(60, 20, 5, 50);
      g2.drawRect(49, 35, 28, 5);
      g2.fillRect(49, 35, 28, 5);
      
      // ATDP Letter D:
      g2.drawRect(100, 20, 5, 50);
      g2.fillRect(100, 20, 5, 50);
      g2.drawOval(80, 45, 20, 20);
      g2.fillOval(75, 40, 30, 30);
      g2.drawOval(75, 40, 30, 30);
      g2.setColor(Color.WHITE);
      g2.fillOval(80, 45, 20, 20);
      g2.setColor(logoColor);
      
      // ATDP Letter P:
      g2.drawRect(115, 40, 5, 50);
      g2.fillRect(115, 40, 5, 50);
      g2.drawOval(120, 45, 20, 20);
      g2.fillOval(115, 40, 30, 30);
      g2.drawOval(115, 40, 30, 30);
      g2.setColor(Color.WHITE);
      g2.fillOval(120, 45, 20, 20);
      g2.setColor(logoColor);
      
      g2.setColor(logoColor);
      Font stringFont2 = new Font("SansSerif", Font.BOLD, 10);
      g2.setFont(stringFont2);
      
      g2.drawString("ACADEMIC TALENT", 15, 83);
      g2.drawString("DEVELOPMENT     PROGRAM", 32, 93);
      
      String letterGrade;
      if (score >= 97) {
          letterGrade = "A+";
      } else if (score >= 93 && score < 97) {
          letterGrade = "A";
      } else if (score >= 90 && score < 93) {
          letterGrade = "A-";
      } else if (score >= 87 && score < 90) {
          letterGrade = "B+";
      } else if (score >= 83 && score < 87) {
          letterGrade = "B";
      } else if (score >= 80 && score < 83) {
          letterGrade = "B-";
      } else if (score >= 65 && score < 80) {
          letterGrade = "PASS";
      } else {
          letterGrade = "NO PASS";
      }
      String grade = "Grade (A, B, PASS, NO PASS): " + score + "%, Letter Grade: " + letterGrade;
      String studentName = "Inan Xu";
      // ... HAVE YOUR CODE HERE
      g2.setColor(Color.BLACK);
      Font stringFont = new Font("TimesNewRoman", Font.PLAIN, 15);
      g2.setFont(stringFont);
      g2.drawString("Course: SD3635.1 -- Programming in Java", 10, 280);
      g2.drawString("Grade Report, Date: " + date, 10, 300);
      g2.drawString("Student: " + studentName, 10, 320);
      g2.setColor(Color.RED);
      
      g2.setColor(Color.BLACK);
      g2.drawString(grade, 10, 340);
      
      g2.draw(new Rectangle(5, 360, 450, 60));
      g2.drawString("Signature by Parent/Guardian: ", 10, 380);
      g2.drawString("Date: ", 10, 410);
      g2.drawString("Comments by Teacher: ", 5, 440);
      g2.draw(new Rectangle(5, 445, 450, 175));
      
      
   }
}
