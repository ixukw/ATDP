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
      register.receivePayment(2, 0, 5, 0, 0);
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      System.out.println("Expected: 0.25");

      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
      register.receivePayment(23, 2, 0, 0, 0);
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      System.out.println("Expected: 2.0");
   }
}
