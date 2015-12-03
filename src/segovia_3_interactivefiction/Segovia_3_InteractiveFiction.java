/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segovia_3_interactivefiction;
import java.util.Scanner;
public class Segovia_3_InteractiveFiction {
    static Scanner sc = new Scanner(System.in);
    static boolean tryAgain;
    static int counter = 3;
    static String mazeFinish;
    public static void main(String[] args) {
        tryAgain = true;
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Okay " + name + " Let's play a game");
        System.out.println("This is my game 'Protect Her'");
        while (counter > 0){
        startUp();
        counter--;
        }
    }
    /*
    Beginning Of Game
    */
   static public void startUp(){
        System.out.println("You are walking and you see a child on"
        + " the floor crying");
        System.out.println("Punt the small child or pick her up?");
        String choice1 = sc.nextLine();
        if(choice1.contains("Punt") || choice1.contains("punt")){
            youLose();
        }
        else if(choice1.contains("Pick") || choice1.contains("pick")){
            mazeEntrance();
        }   
    }
    /*
    First Choice
    I had this method directed from from first choice
    in the startUp method.
    */
   static public void mazeEntrance(){
        System.out.println("you see gates");
        System.out.println("do you enter? or try to find away around?");
        String choiceMazeEntrance = sc.nextLine();
        if(choiceMazeEntrance.contains("go around") || choiceMazeEntrance.contains("find a way around")
            || choiceMazeEntrance.contains("around"))
            {    goAround();
        }
        else if(choiceMazeEntrance.contains("enter") || choiceMazeEntrance.contains("go in")
                || choiceMazeEntrance.contains("Enter"))
            {
                mazeStart();
        }
    }
    /*
    This is the other way you could have gone
    when you were given the 2 choices from the 
    mazeEntrance method
    */
    static public void goAround(){
        System.out.println("There isn't a way around");
        System.out.println("You have to go back"); 
            {   mazeEntrance();
        }
    }
    /*
    Here is the beginning of the maze
    everything from here on until my next
    code comment is the maze.
    There is about seven methods in this little part
    each one leading from other method or choice made
    */
    static public void mazeStart(){
        System.out.println("You start to notice that through these gates are");
        System.out.println("to something like a garden maze but of course much more");
        System.out.println("scary because it is dark");
        System.out.println("you can go two ways. left or right?");
        String choiceMazeStart = sc.nextLine();
        if(choiceMazeStart.contains("Right") || choiceMazeStart.contains("right")
            || choiceMazeStart.contains("Go right"))
            {       rightDeadEnd();
        }
        else if(choiceMazeStart.contains("Left") || choiceMazeStart.contains("left")
                || choiceMazeStart.contains("Go left"))
            {       rightIsRight();
        }
        
    }
    static public void rightDeadEnd(){
        System.out.println("right is a dead end");
        System.out.println("something tells you that there will be alot of these");
            {       mazeStart();
        }
    }
    public static void rightIsRight(){
        System.out.println("again, you can do left or right");
        System.out.println("which way do you go?");
        String rightIsRight = sc.nextLine();
            if (  
                rightIsRight.contains ("Left") || rightIsRight.contains ("left")
                || rightIsRight.contains ("Go left") || rightIsRight.contains ("go left")) 
            {        mazeContinues();
        }
            else if (
                rightIsRight.contains ("Right") || rightIsRight.contains ("right")
                || rightIsRight.contains ("Go right") || rightIsRight.contains ("go right")) 
            {        anotherDeadEnd();
        }
    }

    public static void anotherDeadEnd(){
        System.out.println("again, you can do left or right");
        System.out.println("which way do you go?");
        String anotherDeadEnd=sc.nextLine();
            if (
                anotherDeadEnd.contains ("Left") || anotherDeadEnd.contains ("left")
                || anotherDeadEnd.contains ("Go left") || anotherDeadEnd.contains ("go left"))
            {         anotherDeadEnd2();
        }
            else if (
                anotherDeadEnd.contains ("Right") || anotherDeadEnd.contains ("right")
                || anotherDeadEnd.contains ("Go right") || anotherDeadEnd.contains ("go right")) 
            {    anotherDeadEnd2();
        }
    }

    public static void anotherDeadEnd2(){
        System.out.println("it's another dead end");
        System.out.println ("so you go back");
        System.out.println ("but you cant");
            {    youLose();
        }
    }

    public static void mazeContinues(){
        System.out.println("again, you can do left or right or straight");
        System.out.println("which way do you go?");
        String anotherDeadEnd=sc.nextLine();
            if ( 
                anotherDeadEnd.contains ("Left") || anotherDeadEnd.contains ("left")
                || anotherDeadEnd.contains ("Go left") || anotherDeadEnd.contains ("go left")) 
            {    mazeFinish();
        }   
            else if(
                anotherDeadEnd.contains ("Right") || anotherDeadEnd.contains ("right")
                || anotherDeadEnd.contains ("Go right") || anotherDeadEnd.contains ("go right")) 
            {    mazeFinish();
        }
            else if(
            anotherDeadEnd.contains ("Straight") || anotherDeadEnd.contains ("straight")
            || anotherDeadEnd.contains ("Go straight") || anotherDeadEnd.contains ("go straight")) 
            {    mazeFinish();
        }
    }
    /*
    Final Part Of Maze
    */
    public static void mazeFinish(){
        System.out.println("you've realized you're outta that dark maze and you see sunlight coming from where you now know as the east");
        System.out.println("once again two ways east or west?");
        String mazeFinish = sc.nextLine();
            if ( 
                mazeFinish.contains ("East") || mazeFinish.contains ("east")
                || mazeFinish.contains ("Go east") || mazeFinish.contains ("go east")) 
            {    oldHoboLadyScene();
        }
            else if (
                mazeFinish.contains ("West") || mazeFinish.contains ("west")
                || mazeFinish.contains ("Go west") || mazeFinish.contains ("go west")) 
            {    plotTwist();
        }
    }
    /*
    This is a little "plot twist" i put it to make
    the player go where i wanted them to go
    */
    public static void plotTwist(){
        System.out.println("as you are going west, away from the sun rise");
        System.out.println("everything starts to shake. you fall");
        System.out.println("you start to hear howling, while you feel heat bouncing off your body");
        System.out.println("you look up to see that you were going east the whole time");
        System.out.println("...or were you? you can turn around and try for the 'west' again or stay going east towards the sun");
        String plotTwist=sc.nextLine();
            if ( 
                plotTwist.contains ("East") || plotTwist.contains ("east")
                || plotTwist.contains ("Go east") || plotTwist.contains ("go east")) 
            {    oldHoboLadyScene();
        }
            else if (
                mazeFinish.contains ("West") || mazeFinish.contains ("west")
                || mazeFinish.contains ("Go west") || mazeFinish.contains ("go west")) 
                System.out.println("it all happens again with the baby in your arms you don't know if you'll try it again. So you go towards the sun"); 
            {   oldHoboLadyScene();
        }
    }
    /*
    Enemy Hobo
    Here is the main and somewhat only antagonist in the game
    she wants the little girl you are protected and causes problems
    for the player.
    
    */
    public static void oldHoboLadyScene(){
        System.out.println("while you're walking you see an old lady");
        System.out.println("she's crying for her baby, but the only thing connecting her and the baby that you have in your arms "
        + "is the clothes they are wearing");
        System.out.println("but this is the moment wear she looks straight you, with lightning speed as if your presences alerted her");
        System.out.println("she sees that you have a baby so she roars 'can i hold her?'");
        System.out.println("do you give it to her?");
        String oldHoboLadyScene = sc.nextLine();
            if ( 
                oldHoboLadyScene.contains ("Give") || oldHoboLadyScene.contains ("give")) 
            {    hoboChase();
        }
            else if (
                oldHoboLadyScene.contains ("Don't Give") || oldHoboLadyScene.contains ("Dont Give")
                || oldHoboLadyScene.contains ("don't give") || oldHoboLadyScene.contains ("dont give"))  
            {   hoboRunsAway();
        }
    }
    public static void hoboRunsAway(){
        System.out.println("She has runaway and they baby is gone forever");
            {   youLose();
        }
    }
    public static void hoboChase(){
        System.out.println("She starts to chase you");
        System.out.println("do you outrun her or fight her?");
        String hoboChase= sc.nextLine();
                if ( 
                    hoboChase.contains ("Fight") || hoboChase.contains ("fight")) 
                {    hoboFight();
            }
                else if (
                    hoboChase.contains ("Outrun") || hoboChase.contains ("outrun")
                    || hoboChase.contains ("Run") || hoboChase.contains ("run"))  
                {   babyTrip();
            }
    }
    public static void babyTrip(){
        System.out.println("you trip and the baby falls out your arms");
            {   youBothAreSafeForNow();   
        }        
    }
    public static void youBothAreSafeForNow(){
        System.out.println("you both are safe for now");
        System.out.println("you a forest");
        System.out.println("so you run");
            {   youWin();    
        }
    }
    public static void hoboFight(){
        System.out.println("swing first? or let her swing?");
        String hoboFight = sc.nextLine();
                if ( 
                    hoboFight.contains ("Swing first") || hoboFight.contains ("swing first")) 
                {   System.out.println("you knock her out and run.");
                    System.out.println("there is alot of running in this quest.");
                    youBothAreSafeForNow();
            }
                else if (
                    hoboFight.contains ("Let her swing") || hoboFight.contains ("let her swing")) 
                {   System.out.println("you get knocked out and she run with the baby.");;
                    youLose();
            }
    }
    /*
    Win Statement
    */
    public static void youWin(){
        System.out.println("*********");
        System.out.println("*you Win*");
        System.out.println("*********");
        tryAgain = true;
    }
    /*
    Lose Statement
    */
    public static void youLose(){
        System.out.println("**********");
        System.out.println("*you lose*");
        System.out.println("**********");
        tryAgain = false;
    }
}

