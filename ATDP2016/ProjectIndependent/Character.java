
/**
 * Creates a character for the game.
 * 
 * @author Inan Xu
 * @version v1.1.0
 * NOTE: Level does not affect anything during this stage of the game.
 */
public class Character
{
    private int health;
    private int level;
    private int defense;
    private int attack;
    /**
     * Creates a character with an initial health and an initial level
     */
    public Character(int initHealth, int initLevel) {
        health = initHealth;
        level = initLevel;
    }
    
    /**
     *  Returns the current health to the user.
     */
    public int getHealth() {
        return health;
    }
    
    /**
      * CURRENTLY NONFUNCTIONAL.
      */
    public int getLevel() {
        return level;
    }
    
    /**
     * Adds an amount of health to the user to the current health.
     */
    public void addHealth(int healthAmount) {
        health += healthAmount;
    }
    
    /**
     * Sets the current character's health.
     */
    public void setHealth(int health1) {
        health = health1;
    }
    
    /**
     * Sets the current character's level.
     * CURRENTLY NONFUNCTIONING.
     */
    public void setLevel(int amount) {
        level = amount;
    }
    
    /**
     * Sets the current character's health.
     */
    public void addLevels(int amount) {
        level += amount;
    }
    
    public void kill() {
        health = 0;
    }
    
    public int getDefense() {
        return defense;
    }
   
    public void setDefense(int i) {
        defense = i;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public void setAttack(int i) {
        attack = i;
    }
    
    public void addToAttack(int i) {
        attack += i;
    }
    
    public boolean checkIfDead() {
        if (health > 0) {
            return false;
        } else {
            return true;
        }
    }
}
