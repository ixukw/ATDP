import java.util.ArrayList;

public class Words
{
   /**
      Returns all short words (length <= 3) in an array of words
      @param words an array of strings
      @return an array list containing the short words in words
   */
   public ArrayList<String> shortWords(String[] words)
   {
      ArrayList<String> shortWords = new ArrayList<String>();
      
      String words2 = "";
      
      for (int i = 0; i < words.length; i++) {
          words2 = words[i];
          if (words2.length() <= 3) {
              shortWords.add(words[i]);
          }
      }
      return shortWords;
      
   }
}
