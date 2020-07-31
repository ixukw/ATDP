import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Thread;
/**
 * This is the viewer class for the Independent Project. It uses all of the classes made in this project.
 * 
 * 
 * @author Inan Xu
 * (c) Copyright 2016 Inan Xu
 * 
 * Work Borrowed:
 * - ASCII Art
 * - ButtonViewer
 * - ALL IMAGES FROM INTERNET
 * 
 * Check PATCH NOTES for more information on development.
 * 
 * @version Version 2.0.1
*/
public class BattleViewer
{  
   private static final int FRAME_WIDTH = 60;
   private static final int FRAME_HEIGHT = 800;
   
   private static Thread wait = new Thread(); 
   private static String description = "";
   private static String descriptionB = "";
   
   private static int intro = 1;
   private static int bossTurn = 0;
   private static int pointCount = 151823;
   private static int attackAmt = 2;
   private static int attackTime = 1;
   private static int bossAttack = 2;
   private static int bossDefense = 4;
   private static int playerTurnCount = 0;
   
   private static boolean usedLegend = true;
   private static boolean usedSpaceFood = true;
   private static boolean usedMeal = true;
   private static boolean usedApple = true;
   private static boolean usedWorksheet = true;
   
   private static Icon waveIcon = new ImageIcon("waveIcon.png");
   private static Icon defendIcon = new ImageIcon("defendIcon.png");
   private static Icon chargeIcon = new ImageIcon("chargeIcon.png");
   private static Icon fleeIcon = new ImageIcon("fleeIcon.png");
   private static Icon attackIcon = new ImageIcon("attackIcon.png");
   private static Icon startIcon = new ImageIcon("startIcon.png");
   private static Icon skillsIcon = new ImageIcon("skillsIcon.png");
   private static Icon ARCIcon = new ImageIcon("ARCIcon.png");
   private static Icon legendBoneCutIcon = new ImageIcon("boneCutIcon.png");
   private static Icon blueAppleIcon = new ImageIcon("blueAppleIcon.png");
   private static Icon dangerousMealIcon = new ImageIcon("dangerousMealIcon.png");
   private static Icon spaceFoodIcon = new ImageIcon("spaceFoodIcon.png");
   private static Icon worksheetIcon = new ImageIcon("worksheetIcon.jpg");
   private static Icon itemIcon = new ImageIcon("itemIcon.png");
   
   private static int userHealth = 0;
   private static int bossHealth = 0;
   
   private static JButton waveButton = new JButton("Wave     ", waveIcon);
   private static JButton chargeButton = new JButton("Charge Up", chargeIcon);
   private static JButton coverButton = new JButton("Defend   ", defendIcon);
   private static JButton button4 = new JButton("Skills", skillsIcon);
   private static JLabel skillLabel = new JLabel("Choose a skill.");
   private static JLabel points = new JLabel(" Points: " + pointCount);
   private static JLabel menuInfo = new JLabel(" What do you do?");
   private static JLabel attackLabel = new JLabel("+" + attackAmt + " Attack (" + attackTime + ")");
   
   private static Attack attackF = new Attack();
   private static Character user = new Character(100, 3);
   public static void main(String[] args)
   {
      JFrame introFrame = new JFrame();
      JLabel introName = new JLabel();
      JPanel introPanel = new JPanel();
      introName.setText("This is a turn based battle against one boss. You are currently playing on version 2.0.1");

      String name = "User";
      Boss boss = new Boss(100);
      JButton beginButton = new JButton("Start Battle", startIcon);
      introPanel.add(beginButton);
      introPanel.add(introName);
      introFrame.add(introPanel);
      Character user = new Character(100, 1);
      class Start implements ActionListener {
          public void actionPerformed(ActionEvent event) {
              introFrame.setVisible(false);
              System.out.println("The battle begins!");
              JFrame frame = new JFrame();
              JPanel panel = new JPanel();
              
              skillLabel.setVisible(false);
              JButton item = new JButton("Item  ", itemIcon);
              JButton button = new JButton("Attack", attackIcon);
              JButton buttonReturn = new JButton("Go Back");
              userHealth = user.getHealth();
              bossHealth = boss.getBossHealth();
              JLabel userHealthLabel = new JLabel("Player's Health: " + userHealth);
              JLabel bossHealthL = new JLabel("Boss Health: " + bossHealth);
              class Attack implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                      System.out.println("You go for a direct hit!");
                      int chance = attackF.chance(12);
                      if (chance == 11) {
                          description = "A DIRECT HIT! Boss takes " + ((12 * user.getAttack()) - bossDefense) + " damage.";
                          boss.addBossHealth(-1 * (12 - bossDefense));
                          userHealth = user.getHealth();
                          bossHealth = boss.getBossHealth();
                          userHealthLabel.setText("Player's Health: " + userHealth);
                          bossHealthL.setText("Boss Health: " + bossHealth);
                      } else if (chance == 10) {
                          description = "You barely hit it in your attack! Boss takes " + ((6 * user.getAttack()) - bossDefense) + " damage";
                          boss.addBossHealth(-1 * (6 - bossDefense));
                          userHealth = user.getHealth();
                          bossHealth = boss.getBossHealth();
                          userHealthLabel.setText("Player's Health: " + userHealth);
                          bossHealthL.setText("Boss Health: " + bossHealth);
                      } else if (chance <= 9 && chance >= 4 && chance != 8) {
                          description = "You barely hit it! Boss takes... 5 damage.";
                          boss.addBossHealth(-5);
                          userHealth = user.getHealth();
                          bossHealth = boss.getBossHealth();
                          userHealthLabel.setText("Player's Health: " + userHealth);
                          bossHealthL.setText("Boss Health: " + bossHealth);
                      } else if (chance == 8) {
                          description = "You hit it. Boss takes only 4 damage.";
                          boss.addBossHealth(-4);
                          userHealth = user.getHealth();
                          bossHealth = boss.getBossHealth();
                          userHealthLabel.setText("Player's Health: " + userHealth);
                          bossHealthL.setText("Boss Health: " + bossHealth);
                      } else if (chance == 3) {
                          description = "Boss dodges like a pro. You miss by 10 ft!";
                          userHealth = user.getHealth();
                          bossHealth = boss.getBossHealth();
                          userHealthLabel.setText("Player's Health: " + userHealth);
                          bossHealthL.setText("Boss Health: " + bossHealth);
                      } else if (chance <= 2) {
                          description = "You try to attack, but you missed.";
                          userHealth = user.getHealth();
                          bossHealth = boss.getBossHealth();
                          userHealthLabel.setText("Player's Health: " + userHealth);
                          bossHealthL.setText("Boss Health: " + bossHealth);
                      }
                      
                      System.out.println();
                      System.out.println(description);
                      
                      if (boss.checkBossDead()) {
                          System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                          System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                          System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                          System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                          System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                          System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                          System.out.println("  ──────────╔═╝║                                                ");
                          System.out.println("  ──────────╚══╝                                                ");
                          System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                          System.out.println();
                          pointCount += 2000;
                          System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                          frame.setVisible(false);
                      } else {
                          if (user.checkIfDead()) {
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println();
                                System.out.println("                You died! Better luck next time.                  ");
                                System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                System.out.println();
                                System.out.println("                  ");
                                frame.setVisible(false);
                          } else {
                              bossTurn = 1;
                              
                              if (bossTurn == 1) {
                                  int bossChance = attackF.chance(10);
                                  if (bossChance <= 10 && bossChance >= 5) {
                                      descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                      user.addHealth(-1 * (bossAttack - user.getDefense()));
                                  } else if (bossChance == 3) {
                                      descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                  } else if (bossChance == 2) {
                                      descriptionB = "Boss prepares his attack. +7 Attack";
                                      bossAttack = 7;
                                  } else if (bossChance == 1) {
                                      descriptionB = "Boss defends. +3 Defense";
                                      bossDefense += 2;
                                  } else if (bossChance == 0) {
                                      descriptionB = "Boss fails to attack.";
                                  } else if (bossChance == 4) {
                                      descriptionB = "Boss charges. +3 Attack to current";
                                  }
                                  bossTurn = 0;
                              }
                              System.out.println();
                              System.out.println("The boss charges up his attack!\n" + descriptionB + "\n");
                              userHealth = user.getHealth();
                              bossHealth = boss.getBossHealth();
                              userHealthLabel.setText("Player's Health: " + userHealth);
                              bossHealthL.setText("Boss Health: " + bossHealth);
                          }
                      }
                      playerTurnCount++;
                  }
              }
              ActionListener listener = new Attack();
              button.addActionListener(listener);  
              
              
              JButton button2 = new JButton("Flee  ", fleeIcon);
              class Flee implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                      System.out.println("You fled from the battle successfully!");
                      user.kill();
                      
                      System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                      System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                      System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                      System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                      System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                      System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                      System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                      System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                      System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                      System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                      System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                      System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                      System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                      System.out.println();
                      System.out.println("                You died! Better luck next time.                  ");
                      System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                      System.out.println();
                      System.out.println("            (Next time, don't run away like a coward!)            ");
                      frame.setVisible(false);
                  }
              }
              ActionListener listener2 = new Flee();
              button2.addActionListener(listener2);  
              
              JButton ARC = new JButton("ARC Codes", ARCIcon);
              //panel.add(ARC);
              class Code implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                      System.out.println("Action-Replay Codes are currently not available.");
                      //Scanner kBoard = new Scanner(System.in);
                      //String code = kBoard.next();
                      
                  }
              }
              ActionListener listenerCode = new Code();
              ARC.addActionListener(listenerCode); 
              
              
              ActionListener listenerStart = new Start();
              beginButton.addActionListener(listenerStart);  
       
              
              
              // Wave Button
              waveButton.setVisible(false);
              class ClickListenerW implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                      System.out.println("You waved to the crowd! But the crowd doesn't exist.");
                      chargeButton.setVisible(false);
                      waveButton.setVisible(false);
                      coverButton.setVisible(false);
                      button.setVisible(true);
                      skillLabel.setVisible(false);
                      button2.setVisible(true);
                      button4.setVisible(true);
                      item.setVisible(true);
                      pointCount += 500;
                      points.setText("Points: " + pointCount);
                      menuInfo.setVisible(true);
                      playerTurnCount++;
                      bossTurn = 1;
                      if (boss.checkBossDead()) {
                          System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                          System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                          System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                          System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                          System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                          System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                          System.out.println("  ──────────╔═╝║                                                ");
                          System.out.println("  ──────────╚══╝                                                ");
                          System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                          System.out.println();
                          pointCount += 2000;
                          System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                          frame.setVisible(false);
                      } else {
                            if (user.checkIfDead()) {
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println();
                                System.out.println("                You died! Better luck next time.                  ");
                                System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                System.out.println();
                                System.out.println("            You lost 2000 points. Score: " + pointCount            );
                                frame.setVisible(false);
                        } else {
                              bossTurn = 1;
                              
                              if (bossTurn == 1) {
                                  int bossChance = attackF.chance(5);
                                  if (bossChance == 4) {
                                      descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                      user.addHealth(-1 * (bossAttack - user.getDefense()));
                                  } else if (bossChance == 3) {
                                      descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                  } else if (bossChance == 2) {
                                      descriptionB = "Boss prepares his attack. +7 Attack";
                                      bossAttack = 3;
                                  } else if (bossChance == 1) {
                                      descriptionB = "Boss defends. +3 Defense";
                                      bossDefense = 2;
                                  } else if (bossChance == 0) {
                                      descriptionB = "Boss fails to attack.";
                                  }
                                  bossTurn = 0;
                              }
                              System.out.println();
                              System.out.println("The boss charges up his attack!\n" + descriptionB);
                              userHealth = user.getHealth();
                              bossHealth = boss.getBossHealth();
                              userHealthLabel.setText("Player's Health: " + userHealth);
                              bossHealthL.setText("Boss Health: " + bossHealth);
                        }
                    }                      
                      userHealth = user.getHealth();
                      bossHealth = boss.getBossHealth();
                      userHealthLabel.setText("Player's Health: " + userHealth);
                      bossHealthL.setText("Boss Health: " + bossHealth);
                  }
              }
              ActionListener listenerW = new ClickListenerW();
              waveButton.addActionListener(listenerW);  
              
              
              
              
              // Charge Up Button
              chargeButton.setVisible(false);
              class ClickListenerC implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                      user.setAttack(user.getAttack() + 1);
                      System.out.println("Attack Boosted! (+1 Attack for 1 turn)");
                      //attackLabel.setText("+" + attackAmt + " Attack (" + attackTime + ")");
                      
                      chargeButton.setVisible(false);
                      waveButton.setVisible(false);
                      coverButton.setVisible(false);
                      button.setVisible(true);
                      skillLabel.setVisible(false);
                      button2.setVisible(true);
                      button4.setVisible(true);
                      //attackLabel.setVisible(true);
                      item.setVisible(true);
                      
                      menuInfo.setVisible(true);
                      playerTurnCount++;
                      bossTurn = 1;
                       if (boss.checkBossDead()) {
                          System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                          System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                          System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                          System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                          System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                          System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                          System.out.println("  ──────────╔═╝║                                                ");
                          System.out.println("  ──────────╚══╝                                                ");
                          System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                          System.out.println();
                          pointCount += 2000;
                          System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                          frame.setVisible(false);
                      } else {
                            if (user.checkIfDead()) {
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println();
                                System.out.println("                You died! Better luck next time.                  ");
                                System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                System.out.println();
                                System.out.println("         (ASCII Art borrowed from textart4u.blogspot.com)         ");
                                frame.setVisible(false);
                        } else {
                              bossTurn = 1;
                              
                              if (bossTurn == 1) {
                                  int bossChance = attackF.chance(5);
                                  if (bossChance == 4) {
                                      descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                      user.addHealth(-1 * (bossAttack - user.getDefense()));
                                  } else if (bossChance == 3) {
                                      descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                  } else if (bossChance == 2) {
                                      descriptionB = "Boss prepares his attack. +7 Attack";
                                      bossAttack = 3;
                                  } else if (bossChance == 1) {
                                      descriptionB = "Boss defends. +3 Defense";
                                      bossDefense = 2;
                                  } else if (bossChance == 0) {
                                      descriptionB = "CRITICAL HIT! Boss strikes you hard. You take 20 HP of damage.";
                                      user.addHealth(-20);
                                  }
                                  bossTurn = 0;
                              }
                              System.out.println();
                              System.out.println("The boss charges up his attack!\n" + descriptionB);
                              userHealth = user.getHealth();
                              bossHealth = boss.getBossHealth();
                              userHealthLabel.setText("Player's Health: " + userHealth);
                              bossHealthL.setText("Boss Health: " + bossHealth);
                        }
                    }
                      userHealth = user.getHealth();
                      bossHealth = boss.getBossHealth();
                      userHealthLabel.setText("Player's Health: " + userHealth);
                      bossHealthL.setText("Boss Health: " + bossHealth);
                  }
              }
              ActionListener listenerC = new ClickListenerC();
              chargeButton.addActionListener(listenerC);  
              
              // Defense Button
              coverButton.setVisible(false);
              class ClickListenerD implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                      user.setDefense(user.getDefense() * 2);
                      System.out.println("You duck for cover. +1 defense.");
                      chargeButton.setVisible(false);
                      waveButton.setVisible(false);
                      coverButton.setVisible(false);
                      button.setVisible(true);
                      skillLabel.setVisible(false);
                      button2.setVisible(true);
                      button4.setVisible(true);
                      menuInfo.setVisible(true);
                      item.setVisible(true);
                      playerTurnCount++;
                      bossTurn = 1;
                      if (boss.checkBossDead()) {
                          System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                          System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                          System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                          System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                          System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                          System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                          System.out.println("  ──────────╔═╝║                                                ");
                          System.out.println("  ──────────╚══╝                                                ");
                          System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                          System.out.println();
                          pointCount += 2000;
                          System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                          frame.setVisible(false);
                      } else {
                            if (user.checkIfDead()) {
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                System.out.println();
                                System.out.println("                You died! Better luck next time.                  ");
                                System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                System.out.println();
                                System.out.println("         (ASCII Art borrowed from textart4u.blogspot.com)         ");
                                frame.setVisible(false);
                        } else {
                              bossTurn = 1;
                              
                              if (bossTurn == 1) {
                                  int bossChance = attackF.chance(6);
                                  if (bossChance == 4) {
                                      descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                      user.addHealth(-1 * (bossAttack - user.getDefense()));
                                  } else if (bossChance == 3) {
                                      descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                  } else if (bossChance == 2) {
                                      descriptionB = "Boss prepares his attack. +7 Attack";
                                      bossAttack = 3;
                                  } else if (bossChance == 1) {
                                      descriptionB = "Boss defends. +3 Defense";
                                      bossDefense = 2;
                                  } else if (bossChance == 0) {
                                      descriptionB = "Boss fails to attack.";
                                  } else if (bossChance == 5) {
                                      descriptionB = "Boss charges crazy attack. +4 Attack for every turn.";
                                      bossAttack += 4;
                                  }
                                  bossTurn = 0;
                              }
                              System.out.println();
                              System.out.println("The boss charges up his attack!\n" + descriptionB);
                              userHealth = user.getHealth();
                              bossHealth = boss.getBossHealth();
                              userHealthLabel.setText("Player's Health: " + userHealth);
                              bossHealthL.setText("Boss Health: " + bossHealth);
                        }
                    }
                    userHealth = user.getHealth();
                    bossHealth = boss.getBossHealth();
                    userHealthLabel.setText("Player's Health: " + userHealth);
                    bossHealthL.setText("Boss Health: " + bossHealth);
                  }
              }
              ActionListener listenerD = new ClickListenerD();
              coverButton.addActionListener(listenerD);  

              // Skill Button
              class Skills implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                        chargeButton.setVisible(true);
                        waveButton.setVisible(true);
                        coverButton.setVisible(true);
                        button.setVisible(false);
                        item.setVisible(false);
                        
                        skillLabel.setVisible(true);
                        button2.setVisible(false);
                        button4.setVisible(false);
                        menuInfo.setVisible(false);
                        userHealth = user.getHealth();
                        bossHealth = boss.getBossHealth();
                        userHealthLabel.setText("Player's Health: " + userHealth);
                        bossHealthL.setText("Boss Health: " + bossHealth);
                  }
              }
              ActionListener listener4 = new Skills();
              button4.addActionListener(listener4); 
              
              class Items implements ActionListener {
                  public void actionPerformed(ActionEvent event) {
                      JLabel selectionI = new JLabel("Select an item to use.");
                      button.setVisible(false);
                      skillLabel.setVisible(false);
                      button2.setVisible(false);
                      button4.setVisible(false);
                      menuInfo.setVisible(false);
                      item.setVisible(false);
                      userHealthLabel.setVisible(false);
                      bossHealthL.setVisible(false);
                      buttonReturn.setVisible(true);
                      
                      JButton legendBoneCut = new JButton("Legendary Bone-in Cut", legendBoneCutIcon);
                      JLabel legendBoneCutLabel = new JLabel("Doubles attack permenately.");
                      
                      JButton spaceFood = new JButton("Space Food", spaceFoodIcon);
                      JLabel spaceFoodLabel1 = new JLabel("Now not just for aliens! Heals 5 HP ");
                      JLabel spaceFoodLabel2 = new JLabel("when in battle, 50 HP in space!");
                      
                      JButton dangerousMeal = new JButton("Dangerous Meal", dangerousMealIcon);
                      JLabel dangerousMealLabel1 = new JLabel("Heals 50 HP! But with an item like ");
                      JLabel dangerousMealLabel2 = new JLabel("that comes bad side effects...");
                      
                      JButton blueApple = new JButton("Blue Apple", blueAppleIcon);
                      JLabel blueAppleLabel1 = new JLabel("A strange blue apple. Heals ");
                      JLabel blueAppleLabel2 = new JLabel("10 HP and increases defense by 1.");
                      
                      JButton worksheet = new JButton("Worksheet", worksheetIcon);
                      JLabel worksheetLabel = new JLabel("An oddly familiar quiz...");
                      class legendBoneCut implements ActionListener {
                          public void actionPerformed(ActionEvent event) {
                              legendBoneCut.setVisible(false);
                              legendBoneCutLabel.setVisible(false);
                              System.out.println("Your attack is DOUBLED!");
                              user.setAttack(user.getAttack() * 2);
                              
                              button.setVisible(true);
                              skillLabel.setVisible(false);
                              button2.setVisible(true);
                              button4.setVisible(true);
                              menuInfo.setVisible(true);
                              userHealthLabel.setVisible(true);
                              bossHealthL.setVisible(true);
                              worksheet.setVisible(false);
                              worksheetLabel.setVisible(false);
                              blueApple.setVisible(false);
                              blueAppleLabel1.setVisible(false);
                              blueAppleLabel2.setVisible(false);
                              spaceFood.setVisible(false);
                              spaceFoodLabel1.setVisible(false);
                              spaceFoodLabel2.setVisible(false);
                              dangerousMeal.setVisible(false);
                              dangerousMealLabel1.setVisible(false);
                              dangerousMealLabel2.setVisible(false);
                              item.setVisible(true);
                              frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                              if (boss.checkBossDead()) {
                                      System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                                      System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                                      System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                                      System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                                      System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                                      System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                                      System.out.println("  ──────────╔═╝║                                                ");
                                      System.out.println("  ──────────╚══╝                                                ");
                                      System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                                      System.out.println();
                                      pointCount += 2000;
                                      System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                                      frame.setVisible(false);
                                  } else {
                                        if (user.checkIfDead()) {
                                            System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                            System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                            System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                            System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                            System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                            System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                            System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                            System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                            System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                            System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                            System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                            System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                            System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                            System.out.println();
                                            System.out.println("                You died! Better luck next time.                  ");
                                            System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                            System.out.println();
                                            System.out.println("         (ASCII Art borrowed from textart4u.blogspot.com)         ");
                                            frame.setVisible(false);
                                    } else {
                                          bossTurn = 1;
                                          
                                          if (bossTurn == 1) {
                                              int bossChance = attackF.chance(5);
                                              if (bossChance == 4) {
                                                  descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                                  user.addHealth(-1 * (bossAttack - user.getDefense()));
                                              } else if (bossChance == 3) {
                                                  descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                              } else if (bossChance == 2) {
                                                  descriptionB = "Boss prepares his attack. +7 Attack";
                                                  bossAttack = 3;
                                              } else if (bossChance == 1) {
                                                  descriptionB = "Boss defends. +3 Defense";
                                                  bossDefense = 2;
                                              } else if (bossChance == 0) {
                                                  descriptionB = "Boss fails to attack.";
                                              }
                                              bossTurn = 0;
                                          }
                                          System.out.println();
                                          System.out.println("The boss charges up his attack!\n" + descriptionB);
                                          userHealth = user.getHealth();
                                          bossHealth = boss.getBossHealth();
                                          userHealthLabel.setText("Player's Health: " + userHealth);
                                          bossHealthL.setText("Boss Health: " + bossHealth);
                                    }
                                }
                                userHealth = user.getHealth();
                                bossHealth = boss.getBossHealth();
                                userHealthLabel.setText("Player's Health: " + userHealth);
                                bossHealthL.setText("Boss Health: " + bossHealth);
                                usedLegend = false;
                          }
                      }
                      ActionListener listenerILege = new legendBoneCut();
                      legendBoneCut.addActionListener(listenerILege);  
                      
                      
                      class spaceFood implements ActionListener {
                          public void actionPerformed(ActionEvent event) {
                              spaceFood.setVisible(false);
                              spaceFoodLabel1.setVisible(false);
                              spaceFoodLabel2.setVisible(false);
                              button.setVisible(true);
                              skillLabel.setVisible(false);
                              button2.setVisible(true);
                              button4.setVisible(true);
                              menuInfo.setVisible(true);
                              userHealthLabel.setVisible(true);
                              bossHealthL.setVisible(true);
                              worksheet.setVisible(false);
                              worksheetLabel.setVisible(false);
                              legendBoneCut.setVisible(false);
                              legendBoneCutLabel.setVisible(false);
                              blueApple.setVisible(false);
                              blueAppleLabel1.setVisible(false);
                              blueAppleLabel2.setVisible(false);
                              dangerousMeal.setVisible(false);
                              dangerousMealLabel1.setVisible(false);
                              dangerousMealLabel2.setVisible(false);
                              item.setVisible(true);
                              System.out.println("You don't seem to be in space... you only get 5 HP out of that.");
                              user.addHealth(5);
                              bossTurn = 1;
                                            frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                                  if (boss.checkBossDead()) {
                                      System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                                      System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                                      System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                                      System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                                      System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                                      System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                                      System.out.println("  ──────────╔═╝║                                                ");
                                      System.out.println("  ──────────╚══╝                                                ");
                                      System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                                      System.out.println();
                                      pointCount += 2000;
                                      System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                                      frame.setVisible(false);
                                  } else {
                                        if (user.checkIfDead()) {
                                            System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                            System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                            System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                            System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                            System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                            System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                            System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                            System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                            System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                            System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                            System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                            System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                            System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                            System.out.println();
                                            System.out.println("                You died! Better luck next time.                  ");
                                            System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                            System.out.println();
                                            System.out.println("         (ASCII Art borrowed from textart4u.blogspot.com)         ");
                                            frame.setVisible(false);
                                    } else {
                                          bossTurn = 1;
                                          
                                          if (bossTurn == 1) {
                                              int bossChance = attackF.chance(5);
                                              if (bossChance == 4) {
                                                  descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                                  user.addHealth(-1 * (bossAttack - user.getDefense()));
                                              } else if (bossChance == 3) {
                                                  descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                              } else if (bossChance == 2) {
                                                  descriptionB = "Boss prepares his attack. +7 Attack";
                                                  bossAttack = 3;
                                              } else if (bossChance == 1) {
                                                  descriptionB = "Boss defends. +3 Defense";
                                                  bossDefense = 2;
                                              } else if (bossChance == 0) {
                                                  descriptionB = "Boss fails to attack.";
                                              }
                                              bossTurn = 0;
                                          }
                                          System.out.println();
                                          System.out.println("The boss charges up his attack!\n" + descriptionB);
                                          userHealth = user.getHealth();
                                          bossHealth = boss.getBossHealth();
                                          userHealthLabel.setText("Player's Health: " + userHealth);
                                          bossHealthL.setText("Boss Health: " + bossHealth);
                                    }
                                }
                                userHealth = user.getHealth();
                                bossHealth = boss.getBossHealth();
                                userHealthLabel.setText("Player's Health: " + userHealth);
                                bossHealthL.setText("Boss Health: " + bossHealth);
                                usedSpaceFood = false;
                          }
                      }
                      ActionListener listenerISpac = new spaceFood();
                      spaceFood.addActionListener(listenerISpac); 
                      
                      
                      class dangerousMeal implements ActionListener {
                          public void actionPerformed(ActionEvent event) {
                              dangerousMeal.setVisible(false);
                              dangerousMealLabel1.setVisible(false);
                              dangerousMealLabel2.setVisible(false);
                              button.setVisible(true);
                              skillLabel.setVisible(false);
                              button2.setVisible(true);
                              button4.setVisible(true);
                              menuInfo.setVisible(true);
                              userHealthLabel.setVisible(true);
                              bossHealthL.setVisible(true);
                              worksheet.setVisible(false);
                              worksheetLabel.setVisible(false);
                              legendBoneCut.setVisible(false);
                              legendBoneCutLabel.setVisible(false);
                              System.out.println("Ooooo... I think you need to sit down...");
                              System.out.println("You healed 50 HP! But you are weakened completely.");
                              blueApple.setVisible(false);
                              blueAppleLabel1.setVisible(false);
                              blueAppleLabel2.setVisible(false);
                              spaceFood.setVisible(false);
                              spaceFoodLabel1.setVisible(false);
                              spaceFoodLabel2.setVisible(false);
                              item.setVisible(true);
                              user.setAttack(1);
                              user.addHealth(50);
                              frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                              bossTurn = 1;
                              if (boss.checkBossDead()) {
                                  System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                                  System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                                  System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                                  System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                                  System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                                  System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                                  System.out.println("  ──────────╔═╝║                                                ");
                                  System.out.println("  ──────────╚══╝                                                ");
                                  System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                                  System.out.println();
                                  pointCount += 2000;
                                  System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                                  frame.setVisible(false);
                              } else {
                                    if (user.checkIfDead()) {
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                        System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                        System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                        System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                        System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                        System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println();
                                        System.out.println("                You died! Better luck next time.                  ");
                                        System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                        System.out.println();
                                        System.out.println("         (ASCII Art borrowed from textart4u.blogspot.com)         ");
                                        frame.setVisible(false);
                                } else {
                                      bossTurn = 1;
                                      
                                      if (bossTurn == 1) {
                                          int bossChance = attackF.chance(5);
                                          if (bossChance == 4) {
                                              descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                              user.addHealth(-1 * (bossAttack - user.getDefense()));
                                          } else if (bossChance == 3) {
                                              descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                          } else if (bossChance == 2) {
                                              descriptionB = "Boss prepares his attack. +7 Attack";
                                              bossAttack = 3;
                                          } else if (bossChance == 1) {
                                              descriptionB = "Boss defends. +3 Defense";
                                              bossDefense = 2;
                                          } else if (bossChance == 0) {
                                              descriptionB = "Boss fails to attack.";
                                          }
                                          bossTurn = 0;
                                      }
                                      System.out.println();
                                      System.out.println("The boss charges up his attack!\n" + descriptionB);
                                      userHealth = user.getHealth();
                                      bossHealth = boss.getBossHealth();
                                      userHealthLabel.setText("Player's Health: " + userHealth);
                                      bossHealthL.setText("Boss Health: " + bossHealth);
                                }
                            }
                            userHealth = user.getHealth();
                            bossHealth = boss.getBossHealth();
                            userHealthLabel.setText("Player's Health: " + userHealth);
                            bossHealthL.setText("Boss Health: " + bossHealth);
                            usedMeal = false;
                          }
                      }
                      ActionListener listenerIDang = new dangerousMeal();
                      dangerousMeal.addActionListener(listenerIDang); 
                      
                      
                      class blueApple implements ActionListener {
                          public void actionPerformed(ActionEvent event) {
                              blueApple.setVisible(false);
                              blueAppleLabel1.setVisible(false);
                              blueAppleLabel2.setVisible(false);
                              System.out.println("You heal 10 HP! +1 Defense!");
                              user.addHealth(10);
                              button.setVisible(true);
                              skillLabel.setVisible(false);
                              button2.setVisible(true);
                              button4.setVisible(true);
                              menuInfo.setVisible(true);
                              userHealthLabel.setVisible(true);
                              bossHealthL.setVisible(true);
                              worksheet.setVisible(false);
                              worksheetLabel.setVisible(false);
                              legendBoneCut.setVisible(false);
                              legendBoneCutLabel.setVisible(false);
                              spaceFood.setVisible(false);
                              spaceFoodLabel1.setVisible(false);
                              spaceFoodLabel2.setVisible(false);
                              dangerousMeal.setVisible(false);
                              dangerousMealLabel1.setVisible(false);
                              dangerousMealLabel2.setVisible(false);
                              item.setVisible(true);
                              user.setDefense(user.getDefense() + 1);
                              frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                              bossTurn = 1;
                              if (boss.checkBossDead()) {
                                  System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                                  System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                                  System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                                  System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                                  System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                                  System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                                  System.out.println("  ──────────╔═╝║                                                ");
                                  System.out.println("  ──────────╚══╝                                                ");
                                  System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                                  System.out.println();
                                  pointCount += 2000;
                                  System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                                  frame.setVisible(false);
                              } else {
                                    if (user.checkIfDead()) {
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                        System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                        System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                        System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                        System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                        System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println();
                                        System.out.println("                You died! Better luck next time.                  ");
                                        System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                        System.out.println();
                                        System.out.println("         (ASCII Art borrowed from textart4u.blogspot.com)         ");
                                        frame.setVisible(false);
                                } else {
                                      bossTurn = 1;
                                      
                                      if (bossTurn == 1) {
                                          int bossChance = attackF.chance(5);
                                          if (bossChance == 4) {
                                              descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                              user.addHealth(-1 * (bossAttack - user.getDefense()));
                                          } else if (bossChance == 3) {
                                              descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                          } else if (bossChance == 2) {
                                              descriptionB = "Boss prepares his attack. +7 Attack";
                                              bossAttack = 3;
                                          } else if (bossChance == 1) {
                                              descriptionB = "Boss defends. +3 Defense";
                                              bossDefense = 2;
                                          } else if (bossChance == 0) {
                                              descriptionB = "Boss fails to attack.";
                                          }
                                          bossTurn = 0;
                                      }
                                      System.out.println();
                                      System.out.println("The boss charges up his attack!\n" + descriptionB);
                                      userHealth = user.getHealth();
                                      bossHealth = boss.getBossHealth();
                                      userHealthLabel.setText("Player's Health: " + userHealth);
                                      bossHealthL.setText("Boss Health: " + bossHealth);
                                }
                              }
                              userHealth = user.getHealth();
                              bossHealth = boss.getBossHealth();
                              userHealthLabel.setText("Player's Health: " + userHealth);
                              bossHealthL.setText("Boss Health: " + bossHealth);
                              usedApple = false;
                          }
                      }
                      ActionListener listenerIApple = new blueApple();
                      blueApple.addActionListener(listenerIApple); 
                      
                      
                      class itemWorksheet implements ActionListener {
                          public void actionPerformed(ActionEvent event) {
                              worksheet.setVisible(false);
                              worksheetLabel.setVisible(false);
                              button.setVisible(true);
                              skillLabel.setVisible(false);
                              button2.setVisible(true);
                              button4.setVisible(true);
                              menuInfo.setVisible(true);
                              userHealthLabel.setVisible(true);
                              bossHealthL.setVisible(true);
                              legendBoneCut.setVisible(false);
                              legendBoneCutLabel.setVisible(false);
                              blueApple.setVisible(false);
                              blueAppleLabel1.setVisible(false);
                              blueAppleLabel2.setVisible(false);
                              spaceFood.setVisible(false);
                              spaceFoodLabel1.setVisible(false);
                              spaceFoodLabel2.setVisible(false);
                              dangerousMeal.setVisible(false);
                              dangerousMealLabel1.setVisible(false);
                              dangerousMealLabel2.setVisible(false);
                              item.setVisible(true);
                              System.out.println("You decide to take a quiz! But this is not the time...");
                              frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                              bossTurn = 1;
                              if (boss.checkBossDead()) {
                                  System.out.println("  ╔═══╗─────────────╔╗───╔╗───╔╗                     ");
                                  System.out.println("  ║╔═╗║────────────╔╝╚╗──║║──╔╝╚╗                   ");
                                  System.out.println("  ║║─╚╬══╦═╗╔══╦═╦═╩╗╔╬╗╔╣║╔═╩╗╔╬╦══╦═╗╔══╗  ");
                                  System.out.println("  ║║─╔╣╔╗║╔╗╣╔╗║╔╣╔╗║║║║║║║║╔╗║║╠╣╔╗║╔╗╣══╣  ");
                                  System.out.println("  ║╚═╝║╚╝║║║║╚╝║║║╔╗║╚╣╚╝║╚╣╔╗║╚╣║╚╝║║║╠══║  ");
                                  System.out.println("  ╚═══╩══╩╝╚╩═╗╠╝╚╝╚╩═╩══╩═╩╝╚╩═╩╩══╩╝╚╩══╝  ");
                                  System.out.println("  ──────────╔═╝║                                                ");
                                  System.out.println("  ──────────╚══╝                                                ");
                                  System.out.println("            You beat the boss! Congratulations! Pretty easy, no?          ");
                                  System.out.println();
                                  pointCount += 2000;
                                  System.out.println("                  You earned 2000 points. Score: " + pointCount            );
                                  frame.setVisible(false);
                              } else {
                                    if (user.checkIfDead()) {
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println("    ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀");
                                        System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼");
                                        System.out.println("    ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀");
                                        System.out.println("    ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼");
                                        System.out.println("    ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄");
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println("    ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼");
                                        System.out.println("    ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼");
                                        System.out.println("    ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄");
                                        System.out.println("    ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼");
                                        System.out.println();
                                        System.out.println("                You died! Better luck next time.                  ");
                                        System.out.println("                  Remaining boss Health: " + boss.getBossHealth()  );
                                        System.out.println();
                                        System.out.println("         (ASCII Art borrowed from textart4u.blogspot.com)         ");
                                        frame.setVisible(false);
                                } else {
                                      bossTurn = 1;
                                      
                                      if (bossTurn == 1) {
                                          int bossChance = attackF.chance(5);
                                          if (bossChance == 4) {
                                              descriptionB = "Ouch! DIRECT HIT! " + name + " takes " + (bossAttack - user.getDefense()) + " damage.";
                                              user.addHealth(-1 * (bossAttack - user.getDefense()));
                                          } else if (bossChance == 3) {
                                              descriptionB = "Yikes. " + name + " takes 5 damage from poison.";
                                          } else if (bossChance == 2) {
                                              descriptionB = "Boss prepares his attack. +7 Attack";
                                              bossAttack = 3;
                                          } else if (bossChance == 1) {
                                              descriptionB = "Boss defends. +3 Defense";
                                              bossDefense = 2;
                                          } else if (bossChance == 0) {
                                              descriptionB = "Boss fails to attack.";
                                          }
                                          bossTurn = 0;
                                      }
                                      System.out.println();
                                      System.out.println("The boss charges up his attack!\n" + descriptionB);
                                      userHealth = user.getHealth();
                                      bossHealth = boss.getBossHealth();
                                      userHealthLabel.setText("Player's Health: " + userHealth);
                                      bossHealthL.setText("Boss Health: " + bossHealth);
                                }
                                }
                                userHealth = user.getHealth();
                                bossHealth = boss.getBossHealth();
                                userHealthLabel.setText("Player's Health: " + userHealth);
                                bossHealthL.setText("Boss Health: " + bossHealth);
                                usedWorksheet = false;
                          }
                      }
                      ActionListener listenerIWork = new itemWorksheet();
                      worksheet.addActionListener(listenerIWork); 
                      
                      
                      class Return implements ActionListener {
                          public void actionPerformed(ActionEvent event) {
                              button.setVisible(true);
                              skillLabel.setVisible(false);
                              button2.setVisible(true);
                              button4.setVisible(true);
                              menuInfo.setVisible(true);
                              item.setVisible(true);
                              frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
                              legendBoneCut.setVisible(false);
                              legendBoneCutLabel.setVisible(false);
                              blueApple.setVisible(false);
                              blueAppleLabel1.setVisible(false);
                              blueAppleLabel2.setVisible(false);
                              spaceFood.setVisible(false);
                              spaceFoodLabel1.setVisible(false);
                              spaceFoodLabel2.setVisible(false);
                              dangerousMeal.setVisible(false);
                              dangerousMealLabel1.setVisible(false);
                              dangerousMealLabel2.setVisible(false);
                              worksheet.setVisible(false);
                              worksheetLabel.setVisible(false);
                              buttonReturn.setVisible(false);
                              userHealthLabel.setVisible(true);
                              bossHealthL.setVisible(true);
                          }
                      }
                      ActionListener listenerReturn = new Return();
                      buttonReturn.addActionListener(listenerReturn); 
                      
                      frame.setSize(220, 800);
                      
                      if (usedLegend) {
                          panel.add(legendBoneCut);
                          panel.add(legendBoneCutLabel);
                      }
                      
                      if (usedWorksheet) {
                          panel.add(worksheet);
                          panel.add(worksheetLabel);
                        }
                        
                      if (usedSpaceFood) {
                          panel.add(spaceFood);
                          panel.add(spaceFoodLabel1);
                          panel.add(spaceFoodLabel2);
                      }
                        
                      if (usedApple) {
                          panel.add(blueApple);
                          panel.add(blueAppleLabel1);
                          panel.add(blueAppleLabel2);
                      }
                        
                      if (usedMeal) {
                          panel.add(dangerousMeal);
                          panel.add(dangerousMealLabel1);
                          panel.add(dangerousMealLabel2);
                      }
                      panel.add(buttonReturn);
                  }
              }
              ActionListener listenerItems = new Items();
              item.addActionListener(listenerItems); 
              
              // Adds everything to the panel, then the panel to the frame.          
              panel.add(points);
              panel.add(button);
              panel.add(button2);
              panel.add(item);
              
              panel.add(waveButton);
              panel.add(chargeButton);
              panel.add(coverButton);
              panel.add(button4);
              panel.add(skillLabel);
              panel.add(menuInfo);
              panel.add(userHealthLabel);
              panel.add(bossHealthL);
              frame.add(panel);
              
              // Frame settings
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setVisible(true); 
              frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
          }
      }
      ActionListener listenerSTART = new Start();
      beginButton.addActionListener(listenerSTART); 
      
      
      introFrame.add(introPanel);
      introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      introFrame.setVisible(true); 
      introFrame.setSize(600, 300);
      
   }
}
// 1214 lines of code in this document.