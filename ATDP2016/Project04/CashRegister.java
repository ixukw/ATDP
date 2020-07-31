
/**
 * CashRegister Class 
 * 
 * @author Inan Xu 
 * @version June 29, 2016 v1.0.7
 */
public class CashRegister
{
    // Fields
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
    
    private double purchase;
    private double payment;
    
    // Constructors
    /**
     * Constructor CashRegister
     * 
     * 
     */
    
    public CashRegister()
    {
        purchase = 0.0;
        payment = 0.0;
    }
    
    // Methods
    public void recordPurchase(double itemCost)
    {
        purchase = purchase + itemCost;
    }
    
    public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies)
    {
        payment = dollars + 
                  quarters * QUARTER_VALUE + 
                  dimes * DIME_VALUE + 
                  nickels * NICKEL_VALUE + 
                  pennies * PENNY_VALUE;
    }
    
    public void receivePayment(double amount)
    {
        payment = amount;
    }
    
    public double giveChange()
    {
        double amount = payment - purchase;
        purchase = 0.0;
        payment = 0.0;
        return amount;
    }
    
    public String toString()
    {
        return "payment = " + payment + ", purchase = " + purchase;
    }
}



