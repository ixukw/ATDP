public class Employee
{
   private double salary;
   private static final int OVERTIME_THRESHOLD = 40;

   /**
      Constructs an employee with a given salary
      @param anHourlySalary the hourly salary of this employee
   */
   public Employee(double anHourlySalary)
   {
      salary = anHourlySalary;
   }

   /**
      Computes the wage for a given week.
      @param hoursWorked the hours worked in the week
      @return the wage earned in that week, taking overtime into account
   */
   public double weeklyWage(int hoursWorked)
   {
      wage = (hoursWorked * anHourlySalary)

   }

   // this method is used to check your work

   public static double check(int hoursWorked)
   {
      Employee emily = new Employee(10); // $10/hour
      return emily.weeklyWage(hoursWorked);
   }
}
