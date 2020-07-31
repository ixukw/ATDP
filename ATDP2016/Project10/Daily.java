
/**
 * Write a description of class Daily here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Daily extends Appointment
{
    public Daily() {
        
    }
    
    public void setDescriptionDaily(String descriptionD) {
        description = descriptionD;
    }
    
    public boolean OccursOn(int day, int month) {
        return true;
    }
}
