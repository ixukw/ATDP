import java.util.Scanner;
/**
 * Tests the Question class.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionTester
{
    public static void main (String[] args)
    {
        Scanner kBoard = new Scanner(System.in);
        Question one = new Question();
        one.setText("Bob goes to the store and buys 6 apples. He decides that one apple for an apple is good enough. \nBut Joe has 305 coins to spend. Bob only can skydive.\nThose are the facts! NOW: What is the latest intel processor released to the public?");
        one.setAnswer("i7-6950X");
        one.display();
        String response = kBoard.next();
        
        if (one.checkAnswer(response)) {
            System.out.println("RIGHT!");
        } else {
            System.out.println("Wrong.");
        }
        
        System.out.println("\nNext Question!");
        
        ChoiceQuestion two = new ChoiceQuestion();
        two.setText("Which country was the inventor of JAVA born in?");
        two.addChoice("iPhone SE", true);
        two.addChoice("iPhone 7", false);
        two.addChoice("iPhone Infinity", false);
        two.setAnswer("iPhone SE");
        two.display();
        Scanner kBoard3 = new Scanner(System.in);
        String response2 = kBoard3.next();
        if (two.checkAnswer(response2)) {
            System.out.println("RIGHT!");
        } else {
            System.out.println("Wrong.");
        }
        
        System.out.println("\nNext Question!");
        
        NumericQuestion three = new NumericQuestion();
        three.setText("Your answer is a mile in feet.");
        three.setNumericAnswer(5280);
        three.display();
        Scanner kBoard2 = new Scanner(System.in);
        int response3 = kBoard2.nextInt();
        if (three.checkNumericAnswer(response3)) {
            System.out.println("RIGHT!");
        } else {
            System.out.println("Wrong.");
        }
        
        System.out.println("\nNext Question!");
        
        MultiChoiceQuestion four = new MultiChoiceQuestion();
        System.out.println("For this question, there are multiple answers. Type all of the answers in ONE LINE.\nWhich of the following describes Shanghai?");
        four.addMultiChoice("A: Contains an advanced subway metro.", true);
        four.addMultiChoice("B: Contains parks. Lot of dem parks.", true);
        four.addMultiChoice("C: Has no people.", false);
        four.addMultiChoice("D: Has a crazy rush hour traffic jam daily.", true);
        
        four.addMultiAnswer("A");
        four.addMultiAnswer("B");
        four.addMultiAnswer("D");
        
        System.out.println("[A: Contains a metro., B: Contains Parks., C: Has no people., D: Has a crazy rush hour traffic jam daily.]");
        Scanner kBoard4 = new Scanner(System.in);
        String response4 = kBoard4.next();
        if (four.checkMultiAnswer(response4)) {
            System.out.println("You got it all right!");
        } else {
            System.out.println("Sorry folk(s). Looks like you missed one or a few.");
        }
    }
}
