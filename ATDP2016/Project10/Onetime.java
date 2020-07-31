
/**
 * Write a description of class Onetime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Onetime extends Appointment
{
    private int year;
    private int month;
    private int day;
    
    public void Onetime(int monthO, int dayO, int yearO) {
        day = dayO;
        month = monthO;
        year = yearO;
    }
    
    public static void setDescription(String info) {
        description = info;
    }
    
    public boolean occursOn(int monthO, int dayO, int yearO) {
        if (month == monthO && day == dayO && year == yearO) {
            return true;
        } else {
            return false;
        }
    }
}
