
/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    private int numberAnswer;
    
    public NumericQuestion() {
        numberAnswer = 0;
    }
    
    public void display() {
        super.display();
        
    }
    
    public void setNumericAnswer(int Answer) {
        numberAnswer = Answer;
    }
    
    public boolean checkNumericAnswer(int response) {
        if (response <= numberAnswer + 0.01 && response >= numberAnswer - 0.01) {
            return true;
        } else {
            return false;
        }
    }
}
