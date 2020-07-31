import java.util.Scanner;
/**
 * Write a description of class AppointentTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AppointentTester
{
    public static void main (String[] args) {
        String menu = "";
        Scanner kBoard = new Scanner(System.in);
        int runtime = 1;
        while (runtime == 1) {
            if (menu.equals("Q") || menu.equals("q")) {
                break;
            } else {
                System.out.println("Appointments: (F)ind, (A)dd, (Q)uit:");
                menu = kBoard.next();
                
                
                if (menu.equals("A") || menu.equals("a")) {
                    Scanner kBoard2 = new Scanner(System.in);
                    System.out.println("Enter type: Daily, Monthly, Onetime (D, M, O):");
                    String type = kBoard2.next();
                    
                    if (type.equals("O") || type.equals("o")) {
                        System.out.println("Enter description for appointment:");
                        String description = kBoard2.next();
                        System.out.println("Enter date:");
                        String date = kBoard2.next();
                        Appointment.newAppointment(description, date);
                    }
                    
                    if (type.equals("M") || type.equals("m")) {
                        System.out.println("Enter description for appointment:");
                        String description2 = kBoard2.next();
                        System.out.println("Enter date:");
                        String date2 = kBoard2.next();
                        Appointment.newAppointment(description2, date2);
                    }
                    
                    if (type.equals("D") || type.equals("d")) {
                        System.out.println("Enter description for appointment:");
                        String description3 = kBoard2.next();
                        Appointment.newDailyAppointment(description3);
                    }
                }
                
                if (menu.equals("F") || menu.equals("f")) {
                    Scanner kBoard3 = new Scanner(System.in);
                    System.out.println("Enter a date (month day year (NO SLASHES)):");
                    String type2 = kBoard3.next();
                    String result = Appointment.occursOn(type2);
                    System.out.println("Your appointments on " + type2);
                    if (result == null) {
                        System.out.println("None.");
                    } else {
                        System.out.println(result);
                    }
                }
            }
        }
    }
}

