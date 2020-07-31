public class Numbers2
{
   /**
      Counts the number of digits with value 7 in a given number
      @param n any non-negative number
      @return the number of digits with value 7 in the decimal representation of n
   */
   public int countSevens(String n)
   {
       int count = 0;
       String invalid;
       int numCount = 0;
       while (count < n.length()) {
           if (n.indexOf("7") >= 0) {
               numCount++;
               count+=numCount;
           } else {
               count++;
           }
           
       
   
   
   
        }
       return numCount;
    }
}
