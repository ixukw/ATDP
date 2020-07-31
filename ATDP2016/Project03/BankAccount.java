
/**
 * BankAccount represents a checking account.
 * 
 * @author Inan Xu
 * @version v1.1.4 (June 27, 2016)
 */
public class BankAccount
{
    // instance variables
    private double balance;
    
    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        balance = 0;
    }

    public BankAccount(double initBal)
    {
        // initialise instance variables
        balance = initBal;
    }
    
    /**
     * Returns the CURRENT BALANCE to the user.
     * 
     * @return the CURRENT BALANCE.
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Takes out money [WITHDRAW]
     * 
     * @param amount Amount to be withdrawn
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    /**
     * Puts in money [DEPOSIT]
     * 
     * @param amount Amount to be deposited
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }
    
    public void addInterest(double rate)
    {
        balance = balance + balance * (rate/100);
    }
}
