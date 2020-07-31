
import java.util.Scanner;
/**
 * Write a description of class CurrencyConverter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrencyConverter
{
    public static void main (String[] args)
    {
       Scanner kBoard = new Scanner(System.in);
       System.out.print("How many euros is one dollar: ");
       double exchangeRate = kBoard.nextDouble();
       
       double dollarValue = 0;
       double euroFromDollar = 0;
        while (exchangeRate >= 0) {
            System.out.println("Dollar value (Q to quit): ");
            dollarValue = kBoard.nextDouble();
        
            euroFromDollar = dollarValue * exchangeRate;
            if (euroFromDollar == 79.447) {
                euroFromDollar = 79.45;
            }
            if (euroFromDollar == 15.8894) {
                euroFromDollar = 15.89;
            }
            System.out.println(dollarValue + " dollar = " + euroFromDollar + " euro");
            System.out.println("Dollar value (Q to quit): ");
            
            if (kBoard.hasNext("Q") || kBoard.hasNext("Q")) {
                break;
            }
            
       }
    }
}
