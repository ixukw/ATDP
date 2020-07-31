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
      int multiple = (int) (Math.random() * 20 + 1);
      Investment invest = new Investment(INITIAL_BALANCE, RATE);
      invest.waitForBalance(multiple * INITIAL_BALANCE);
      int years = invest.getYears();
      System.out.println("After " + years + " years, at interest rate " + + RATE
                        + ", the investment will be " 
                        +  multiple + " times the initial amount.");
   }   
}
