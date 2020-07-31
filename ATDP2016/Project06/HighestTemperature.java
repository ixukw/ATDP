import java.util.Scanner;
public class HighestTemperature
{
    public static void main (String[] args)
    {
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Please enter twelve temperature values (Hitting ENTER after each one!):");
        double inputNumber = kBoard.nextDouble();
        
        double maxTemp = 0;
        int count = 1;
        while (kBoard.hasNextDouble()) {
            if (count == 1 || inputNumber > maxTemp) {
                maxTemp = inputNumber;
                System.out.println("Enter another value: ");
            } else {
                System.out.println("Enter another value: ");
            }
            inputNumber = kBoard.nextDouble();
            count++;
            
            if (count == 12) {
                System.out.println("That's 12 temperature values.");
                System.out.println("Highest Temperature out of the set: " + maxTemp);
                break;
            }
        }
    }
}