
/**
 * Write a description of class Appointment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Appointment
{
    public static String description;
    public static String date = "";
    public Appointment() {
    }
    
    public static void setDescription(String descriptionInput)
    {
        description = descriptionInput;
    }
    
    public static String occursOn(String dateI) {
        if (dateI.indexOf(date) >= 0) {
            return description;
        } else {
            return "false";
        }
    }
    
    public static void newAppointment(String descriptionI, String dateI) {
        description = descriptionI;
        date = dateI;
        
    }
    
    public static void newDailyAppointment(String descriptionI) {
        description = descriptionI;
        date = date;
    }
    public abstract String toString();
}
