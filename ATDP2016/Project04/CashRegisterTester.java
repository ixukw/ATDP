/**
 * This class tests the CashRegister class.
 * @author C. Horstmann
 * @version 1.0
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
 
      // TRANSACTION WITH CUSTOMER 1
      System.out.println("CUSTOMER 1 TRANSACTION:");
      
      // Customer buys the following:
      register.recordPurchase(0.75); 
      register.recordPurchase(1.50);
      
      System.out.println("Register = " + register);
      
      // Customer pays with the following:
      register.receivePayment(2, 0, 5, 0, 0); // dollars, quarters, dimes, nickels, pennies
      
      // Customer should receive the following:
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      System.out.println("...expected: 0.25");
      
      
      // TRANSACTION WITH CUSTOMER 2
      System.out.println("\nCUSTOMER 2 TRANSACTION:");
       
      // Customer buys the following:
      register.recordPurchase(2.25);
      register.recordPurchase(16.25);
      register.recordPurchase(3.00);
      
      // Customer pays with the following:
      register.receivePayment(23, 2, 0, 0, 0);
      
      // Customer should receive the following:
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      System.out.println("...expected: 2.0");
 
      int test = 0;
      
      while( test < 100) {
          System.out.print("\n[WHILE LOOP RUNNING]");
          test = test + 1;
 
      }
}
}
 