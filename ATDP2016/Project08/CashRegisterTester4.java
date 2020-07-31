/**
   This class tests the CashRegister class.
*/
public class CashRegisterTester4
{
   public static void main(String[] args)
   {
      CashRegister4 register = new CashRegister4();
      
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);

      Coin dollar = new Coin(1, "dollar");
      register.recordPayment(2, dollar);
      Coin quarter = new Coin(.25, "quarter");
      register.recordPayment(2, quarter);
      Coin dime = new Coin(.10, "dime");
      register.recordPayment(2, dime);
      Coin nickel = new Coin(.05, "nickel");
      register.recordPayment(2, nickel);
      Coin penny = new Coin(0.01, "penny"); 
      register.recordPayment(2, penny);
      
      
      //register.receivePayment(2, 0, 5, 0, 0);
      
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      System.out.println("Expected: 0.57");

      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
     
      register.recordPayment(21, dollar);

      register.recordPayment(2, quarter);

      register.recordPayment(2, dime);

      register.recordPayment(2, nickel);

      register.recordPayment(2, penny);
      
      //register.receivePayment(23, 2, 0, 0, 0);
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      System.out.println("Expected: 0.32");
   }
}
