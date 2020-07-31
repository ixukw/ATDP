public class Words
{
   private String middleword;
   
    /**
      Gets the middle character or character pair from this word 
      when possible.
      @param word a word
      @return the middle character (if the word length is odd) or
      middle two characters (if it is even), or the empty string if 
      the word is empty, or null if it is null.
   */
   
   public String getMiddle(String word)
   {
      int pos;
      int len;
      if ((word.length()%2) > 0) {
          pos = word.length() / 2;
          len = 1;
          String middleword = word.substring(pos, pos + len);
          return middleword;
      } else if (word == null) {
          return word;
      } else {
          pos = word.length() / 2 - 1;
          len = 2;
          String middleword = word.substring(pos, pos + len);
          return middleword;
      }
   }
}
