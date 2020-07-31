import java.util.Scanner;
import java.lang.Math;
/**
 * THIS IS AN RPG BATTLE FOR THE UNDERCHOMP BOSS!
 * 
 * @author IXCOMICX
 * @version v1.1.51 (See ixcomicx.weebly.com/projects/Java/rpgbattle for patch notes.)
 */
public class RPGBattle_IndevMain_Test
{
    public static void main (String[] args)
    {
        System.out.println("The Underchomp battle begins! What do you do?");
        
        String name = "TEMP";
        String mainMove = "";
        int validInput = 1;
        int chance = 5;
        int lv = 99;
        int userHealth = 999;
        int bossHealth = 250;
        boolean dashell = false;
        boolean boomer = false;
        boolean runtime = true; //TEMPERARILY TRUE
        
        while (userHealth > 0 && runtime) {
            while (validInput == 1) {
                Scanner mainMenu = new Scanner(System.in);
                System.out.println("(Available options: [Attack] [Technique] [Pixl] [Item] [Flee])");
                System.out.println("---[ Current Stats ]---");
                System.out.println(name + " Health: " + userHealth);
                System.out.println("UNDERCHOMP Health: " + bossHealth);
                if (mainMenu.hasNext()) {
                    mainMove = mainMenu.next();
                    
                    if (mainMove.equals("[Attack]")) {
                        Scanner attackMenu = new Scanner(System.in);
                        System.out.println("You decide to attack. You go for a direct hit!");
                        if (chance == 5) { //TEMPERARILY ALWAYS 5//
                            System.out.println("A LUCKY hit! UNDERCHOMP deals 12 damage.");
                        }
                        validInput = 0;
                    }
            
                    if (mainMove.equals("[Pixl]")) {
                        Scanner PixlMenu = new Scanner(System.in);
                        System.out.println("Which Pixl do you want to use?");
                        System.out.println("Current Options: [Dashell] [Boomer]");
                        String pixl = PixlMenu.next();
                        if (pixl == "[Dashell]") {
                            dashell = true;
                            System.out.println(name + " dashes away!");
                            System.out.println("Flee Successful.");
                            runtime = false;
                        }
                    }
                    
                    if (mainMove.equals("[Technique]")) {
                        Scanner TechniqueMenu = new Scanner(System.in);
                        System.out.println("Choose a technique.\n[Super Stomp]");
                        String technique = TechniqueMenu.next();
                        
                        if (technique.equals("[Super Stomp]")) {
                            System.out.println("You go for a stomp. UNDERCHOMP takes " + (lv * 2) + "damage.");
                        }
                    }
                } else {
                    System.out.println(name + " dies. UNDERCHOMP wins.");
                }
        
                
            }
            if (!runtime) {
                System.out.println(name + " dies. UNDERCHOMP wins.");
            }
        }
        
    }
}
