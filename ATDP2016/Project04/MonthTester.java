public class MonthTester
{
   public static void main(String[] args)
   {
      Month jan = new Month(1);
      System.out.println("Name: " + jan.getName());
      System.out.println("Expected: January");
      Month mar = new Month(3);
      System.out.println("Name: " + mar.getName());
      System.out.println("Expected: March");
      Month dec = new Month(12);
      System.out.println("Name: " + dec.getName());
      System.out.println("Expected: December");
   }
}
