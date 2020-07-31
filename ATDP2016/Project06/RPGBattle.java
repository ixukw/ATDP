import java.util.Scanner;
import java.lang.Math;
/**
 * THIS IS AN RPG BATTLE FOR THE UNDERCHOMP BOSS!
 * 
 * @author IXCOMICX
 * @version v1.1.0 (See ixcomicx.weebly.com/projects/Java/rpgbattle for patch notes.
 */
public class RPGBattle
{
    public static void main (String[] args)
    {
        System.out.println("The Underchomp battle begins! What do you do?");
        
        String name = "TEMP";
        String mainMove = "";
        int validInput = 0;
        int chance = 0;
        int userHealth = 70;
        int bossHealth = 250;
        while (validInput == 1) {
            chance = (int)Math.random();
        }
        Scanner mainMenu = new Scanner(System.in);
        System.out.println("(Available options: [Attack] [Technique] [Pixl] [Item] [Flee])");
        System.out.println("---[ Current Stats ]---");
        System.out.println(name + " Health: " + userHealth);
        System.out.println("UNDERCHOMP Health: " + bossHealth);
        if (mainMenu.hasNext()) {
            mainMove = mainMenu.next();
            validInput = 1;
        } else {
            System.out.println(name + "dies. UNDERCHOMP wins.");
        }
        
        if (validInput == 1 && mainMove == "[Attack]") {
            Scanner attackMenu = new Scanner(System.in);
            System.out.println("You decide to attack. You go for a direct hit!");
            if (chance == 5) {
                System.out.println("A LUCKY hit! UNDERCHOMP deals 12 damage.");
            }
            validInput = 0;
        }
    }
}
