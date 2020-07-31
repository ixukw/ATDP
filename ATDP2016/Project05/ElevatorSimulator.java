import java.util.Scanner;
/**
 * Simulation of an elevator
 * 
 * @author Inan Xu
 * @version v1.0.0 July 5, 2016
 */
public class ElevatorSimulator
{
    public static void main (String[] args)
    {
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Push a floor button (1 - 20):");
        
        int userFloor, physFloor;
        
        if (kBoard.hasNextInt()) {
            userFloor = kBoard.nextInt();
            physFloor = userFloor;
            if (userFloor >= 1 && userFloor <= 12) {
                System.out.println("Will go to floor " + physFloor + ".");
            } else if (userFloor == 13) {
                System.out.println("Sorry! That floor is invalid.");
            } else if (userFloor >= 14 && userFloor <= 20) {
                physFloor--;
                System.out.println("Will go to floor " + physFloor + ".");
            } else {
                System.out.println("Floor " + userFloor + " apparently does not exist. How did you even push that button?");
            } 
        } else {
            if (kBoard.hasNext("Alarm")) {
                System.out.println("You sounded the alarm! But there's no emergency...");
            } else {
                
            }
        }
}
}
