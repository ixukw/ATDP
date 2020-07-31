public class Words
{
   /**
      Returns the nth short word (length <= 3) in an array.
      @param words an array of strings
      @param n an integer > 0
      @return the nth short word in words, or the empty string if there is
      no such word
   */
   public String nthShortWord(String[] words, int n)
   {
      String word = words[n];
      String invalid = "";
      if (n > 3) {
          return invalid;
      } else {
          return word;
      }
   }
}
