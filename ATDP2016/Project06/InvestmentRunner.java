/**
   This program computes how long it takes for an investment
   to double.
*/
public class InvestmentRunner
{
   public static void main(String[] args)
   {
      final double INITIAL_BALANCE = 10000;
      final double RATE = 5;
      int multiple = (int) (Math.random() * 20 + 0);
      Investment invest = new Investment(INITIAL_BALANCE, RATE);
      double target = multiple * INITIAL_BALANCE;
      invest.waitForBalance(multiple * INITIAL_BALANCE);
      int years = invest.getYears();
      
      
      System.out.println("Initial Balance: " + INITIAL_BALANCE + ".");
      System.out.println("\nTarget Balance:: " + target + ".");
      if (multiple == 0) {
          System.out.println("\nAfter " + years + " year(s), at interest rate " + + RATE + ", the investment will be \n" + multiple + " times the initial amount. Well, that doesn't make too much sense.");
        } else {
          System.out.println("\nAfter " + years + " year(s), at interest rate " + + RATE
                        + ", the investment will be \n" 
                        +  multiple + " times the initial amount.");
                    }
   }   
}
