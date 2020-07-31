
/**
 * Question Class represents a test with one answer per question.
 * 
 * @author Annoymous
 * @version v1.NO
 */
public class Question
{
    private String text;
    private String answer;
    /**
      * Creates a question.
      */
    public Question()
    {
       text = "";
       answer = "";
    }
   
    /**
     * Creates a question text for a question.
     * @param String 
     */
    public void setText(String questionText)
    {
        text = questionText;
    }
   
    /**
     * Creates an answer for a question.
     * @param String
     */
    public void setAnswer(String correctResponse)
    {
        answer = correctResponse;
    }
   
    /**
     * Checks that the answer is correct.
     * @return True if correct, false if incorrect.
     */
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }
   
    public void display()
    {
        System.out.println(text);
    }
   
}

