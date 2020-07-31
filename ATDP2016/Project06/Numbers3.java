public class Numbers3
{
   /**
      Computes a sum of even integers 
      @param a the lower bound (may be odd or even)
      @param b the upper bound (may be odd or even)
      @return the sum of even integers between a and b (inclusive).
   */
   public int evenSum(int a, int b)
   {
      int num = a;
      int sum = 0;
      
      if (num % 2 == 1) {
          num++;
      }
      
      while (num <= b) {
          sum += num;
          num += 2;
          
      }
      return sum;
   
   
   
   
   }
}
