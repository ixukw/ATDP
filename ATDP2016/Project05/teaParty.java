
/**
 * Write a description of class teaParty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teaParty
{
    
    public int teaParty(int tea, int candy) {
        int value = 0;
        if (tea < 5 || candy < 5) {
            return value;
        } else if ((tea / candy) >= 2 || (candy / tea) >= 2) {
            return value + 2;
        } else {
            return value + 1;
        }
    }
}
