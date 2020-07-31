public class Numbers4
{
   /**
      Computes the number of even and odd values in a given array
      @param values an array of integer values
      @return an array of length 2 whose 0 entry contains the count
      of even elements and whose 1 entry contains the count of odd
      values
   */
   public int[] evenOdds(int[] values)
   {
       int oddCount = 0;
       int evenCount = 0;
       for (int i = 0; i < values.length; i++) {
           if ((values[i] % 2) == 0) {
               evenCount++;
           } else {
               oddCount++;
           }
       }
       int[] ratio = {evenCount, oddCount};
       return ratio;


   }
}
