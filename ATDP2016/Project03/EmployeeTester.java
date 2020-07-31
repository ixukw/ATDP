
/**
 * EmployeeTester tests the Employee class.
 * 
 * @author Inan 
 * @version June 28, 2016 v1.1.0
 */
public class EmployeeTester
{
    public static void main (String[] args)
    {
        Employee Bob = new Employee("Bob", 500);
        System.out.println("Name: " + Bob.getName());
        System.out.println("... Expected: Bob");
        
        System.out.print("Salary before raise: " + Bob.getSalary());
        System.out.print("\n... Expected: 500");
        
        Bob.raiseSalary(10);
        System.out.print("\nSalary after raise: " + Bob.getSalary());
        System.out.print("\n... Expected: 550");
        
        
        
        
    }
}
