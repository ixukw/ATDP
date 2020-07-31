
/**
 * The boss's code for the RPG battle!
 * 
 * @author Inan Xu 
 * @version v1.0.0
 */
public class Boss
{
    private int bossHealth;
    /**
     * Creats a boss for the player to battle.
     * FUTURE: Health will be randomized?
     */
    public Boss(int initHealth) {
        bossHealth = initHealth;
    }
    
    /**
     * Gets the boss's health.
     */
    public int getBossHealth() {
        return bossHealth;
    }
    
    /**
     * Set the boss's health to an amount.
     */
    public void setBossHealth(int amount) {
        bossHealth = amount;
    }
    
    /**
     * Adds to the boss's health.
     */
    public void addBossHealth(int amount) {
        bossHealth += amount;
    }
    
    /**
     * Checks whether the boss is still alive.
     */
    public boolean checkBossDead() {
        if (bossHealth <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
