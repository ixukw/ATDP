import java.util.ArrayList;
import java.util.Scanner;
/**
 * Tests the Question class.
 * 
 * @blank blank
 */
public class QuizToTakeWLst
{
    public static void presentQuestion(Question q1) {
        ArrayList<Question> q = new ArrayList<Question>();
        q.add(q1);
        Scanner kBoard = new Scanner(System.in);
        for (Question E: q) {
            q1.display();
            String response = kBoard.next();
            if (E.checkAnswer(response)) {
                System.out.println("Right.");
            } else {
                System.out.println("Wrong.");
            }
        }
        
    }
    
    public static void main (String[] args)
    {
        Scanner kBoard = new Scanner(System.in);
        Question one = new Question();
        one.setText("Bob goes to the store and buys 6 apples. He decides that one apple for an apple is good enough. \nBut Joe has 305 coins to spend. Bob only can skydive.\nThose are the facts! NOW: What is the latest intel processor released to the public?");
        one.setAnswer("i7-6950X");
        presentQuestion(one);
        
        ChoiceQuestion two = new ChoiceQuestion();
        two.setText("Which of these is of an invalid type?");
        two.addChoice("Tom Sawyer", false);
        two.addChoice("Tom Skellic", false);
        two.addChoice("Tom Berric", true);
        two.addChoice("Tom Lerric", false);
        presentQuestion(two);
        
       
    }
}
