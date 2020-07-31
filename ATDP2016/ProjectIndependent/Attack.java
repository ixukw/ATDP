import java.util.Random;
/**
 * The attack function is the battle
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack
{
    /**  
     * Constructs an ability to attack for the player. 
     */
    public Attack() {
        
    }
    
    public int chance(int maxLvl) {
        Random rand = new Random();
        int chance = rand.nextInt(maxLvl);
        return chance;
    }
}
