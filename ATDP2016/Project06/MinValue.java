import java.util.Scanner;
/**
 * Write a description of class MinValue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinValue
{
    public static void main (String[] args)
    {
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int inputNumber = kBoard.nextInt();
        int count = 0;
        int minNumber = 0;
        
        
        while (inputNumber == inputNumber / 1) {
            if (count == 0 || minNumber > inputNumber) {
                minNumber = inputNumber;
                count++;
                System.out.println("Number with an absolute value closest to zero: " + minNumber);
                System.out.println("Enter another number: ");
                inputNumber = kBoard.nextInt();
            }
            else if(minNumber <= inputNumber) {
                System.out.println("Number with an absolute value closest to zero: " + minNumber);
                System.out.println("Enter another number: ");

                
            } else {
                break;
            }
        }
    }
}
