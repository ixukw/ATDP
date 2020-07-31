
/**
 * Employee Class, salary and name.
 * 
 * @author Inan Xu
 * @version June 28, 2016 v1.0.0
 */
public class Employee
{
    // instance variables 
    private double salary;
    private String name;
    /**
     * Constructor Employee
     * Allows you to construct an employee choosing its name and salary
     */
    public Employee(String employeeName, double currentSalary)
    {
        // initialise instance variables
        name = employeeName;
        salary = currentSalary;
    }
    
    /**
     * Returns the NAME to the user.
     * 
     * @return the NAME.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the CURRENT SALARY to the user.
     * 
     * @return the CURRENT BALANCE.
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * Raises the CURRENT SALARY byPercent.
     * 
     * 
     */
    public void raiseSalary(double byPercent)
    {
        salary = salary + salary * (byPercent/100);
    }
}
