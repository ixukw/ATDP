import java.util.ArrayList;
/**
 * Write a description of class MultiChoiceQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiChoiceQuestion extends Question
{
    private ArrayList<String> choices;
    private ArrayList<String> answers;
    public MultiChoiceQuestion() {
        choices = new ArrayList<String>();
        answers = new ArrayList<String>();
    }
    
    public void addMultiChoice(String choice, boolean correct) {
        choices.add(choice);
    }
    
    public void addMultiAnswer(String answer) {
        answers.add(answer);
    }
    
    public void display() {
        System.out.println(choices.toString());
        System.out.println(answers.toString());
        super.display();
    }
    
    public boolean checkMultiAnswer(String response) {
        for (int i = 0; i < choices.size(); i++) {
            if (response.indexOf(choices.get(i)) >= 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
