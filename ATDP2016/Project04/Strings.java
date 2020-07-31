public class Strings
{
   /**
      Gets the last n characters from a string.
      @param s a string
      @param n a nonnegative integer <= s.length()
      @return the string that contains the last n characters of s
   */
   public String last(String s, int n) {
   
      int charcount = s.length();
      String word = new String(s.substring(n, charcount));

      
      
      
      
    
        String months = new String("January February March April May June July August September October November December ");

        int blank1Loc = months.indexOf(" ");
        String word1 = months.substring(0, blank1Loc);
     
        
        int blank2Loc = months.indexOf(" ", blank1Loc + 1);
        String word2 = months.substring(blank1Loc + 1, blank2Loc);
    
        
        int blank3Loc = months.indexOf(" ", blank2Loc + 1);
        String word3 = months.substring(blank2Loc + 1, blank3Loc);
   
        
        int blank4Loc = months.indexOf(" ", blank3Loc + 1);
        String word4 = months.substring(blank3Loc + 1, blank4Loc);
    
        
        int blank5Loc = months.indexOf(" ", blank4Loc + 1);
        String word5 = months.substring(blank4Loc + 1, blank5Loc);
    
       
        int blank6Loc = months.indexOf(" ", blank5Loc + 1);
        String word6 = months.substring(blank5Loc + 1, blank6Loc);
     
        
        int blank7Loc = months.indexOf(" ", blank6Loc + 1);
        String word7 = months.substring(blank6Loc + 1, blank7Loc);
    
        
        int blank8Loc = months.indexOf(" ", blank7Loc + 1);
        String word8 = months.substring(blank7Loc + 1, blank8Loc);
        
        
        int blank9Loc = months.indexOf(" ", blank8Loc + 1);
        String word9 = months.substring(blank8Loc + 1, blank9Loc);
       
        
        int blank10Loc = months.indexOf(" ", blank9Loc + 1);
        String word10 = months.substring(blank9Loc + 1, blank10Loc);
        
        
        int blank11Loc = months.indexOf(" ", blank10Loc + 1);
        String word11 = months.substring(blank10Loc + 1, blank11Loc);
        
        
        int blank12Loc = months.indexOf(" ", blank11Loc + 1);
        String word12 = months.substring(blank11Loc + 1, blank12Loc);
        
      return months;
    }
}