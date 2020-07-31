public class Numbers
{
   /**
      Computes the length of the longest sequence that occurs in the
      start of the left half and the end of the right half of an
      array.
      @param values an array of integer values
      @return the length of the longest end sequence
   */
   public int sameEnds(int[] values)
   {
      int count = 0;
      for (int i = 0; i < values.length - 1; i++) {
          if (i == ((values.length - 1) / 2)) {
              break;
          }
          
          if (values[i] == values[(values.length - 1) - i]) {
              count++;
          }
         
          if (i != 0 && i == values[values.length - (values.length - 1)]) {
              count++;
          }
      }
      return count;

   }
}
