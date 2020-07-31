public class Words2
{
   /**
      Computes a string that repeats every letter 't' in the original string.
      @param s any string
      @return a string with the same characters as s, except that every letter 't' is repeated
   */
   public String stutter(String s)
   {
      
      int index = s.indexOf("t");
      while (index >= 0) {
          index = s.indexOf("t", index + 1);
          
          s = s.substring(0, index) + "t" + s.substring(index, s.length());
      }
      return s;
    }
}