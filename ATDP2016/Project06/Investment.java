
/**
 * Class Investment.
 * 
 * @author Inan Xu 
 * @version v1.0.0
 */
public class Investment
{
    // Fields
    private double initAmt;
    private double initRate;
    private int years;
    
    // Constructors
    public Investment(double begAmt, double rate) {
        initAmt = begAmt;
        initRate = rate;
    }
    
    // Methods
    public void waitForBalance(double targetAmt) {
        double amt = initAmt;
        years = 0;
        while (amt < targetAmt) {
            amt += amt * initRate;
            years++;
        }
    }
    
    public int getYears() {
        return years;
    }
}