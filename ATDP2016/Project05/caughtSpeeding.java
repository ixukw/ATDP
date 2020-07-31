
/**
 * Write a description of class caughtSpeeding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class caughtSpeeding
{
        public int caughtSpeeding(int speed, boolean isBirthday) {
            int value = 0;
            if (isBirthday == true) {
                if (speed <= 65) {
                    return value;
                } else if (speed >= 66 && speed <= 85) {
                    return value + 1;
                } else {
                    return value + 2;
                }
            } else {
                if (speed <= 60) {
                    return value;
                } else if (speed >= 61 && speed <= 80) {
                    return value + 1;
                } else if (speed >= 85) {
                    return value + 2;
                } else {
                    return value;
                }
            } 
        }
}
