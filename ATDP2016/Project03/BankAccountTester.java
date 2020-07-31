/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount();
      System.out.println("After new: " + harrysChecking.getBalance());
      System.out.println("... expected: 0"); 
      
      harrysChecking.deposit(1000);
      System.out.println("After deposit: " + harrysChecking.getBalance());
      System.out.println("... expected: 2000"); 
      
      harrysChecking.withdraw(500);
      System.out.println("After withdraw: " + harrysChecking.getBalance());
      System.out.println("... expected: 1500"); 
      
      harrysChecking.withdraw(400);
      System.out.println("After withdraw: " + harrysChecking.getBalance());
      System.out.println("...expected: 100");

      harrysChecking.addInterest(5);
      System.out.println("After interest: " + harrysChecking.getBalance());
      System.out.println("...expected: 105");
   }
}
