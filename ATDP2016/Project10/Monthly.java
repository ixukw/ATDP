
/**
 * Write a description of class Monthly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Monthly extends Appointment
{
    private String date;
    
    public void Monthly(String date1) {
        date = date1;
    }
    
    public void setDescriptionMonthly(String descriptionM) {
        description = descriptionM;
    }
    
    public boolean monthlyOccursOn(int month, int day) {
        if (date.indexOf(month) >= 0 && date.indexOf(day) >= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
