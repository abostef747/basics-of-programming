
import java.util.Random;


public class Player {
    private String name;
    private char sex;
    private int level;
    private int points;

    public Player(String name,char sex){
        this.name = name;
        level = 1;
        this.sex = sex;
        points = 0;
    }

    public void getPlayer(){
        System.out.println("Player name is: " + name);
        System.out.println("Player sex is: " + sex);
        System.out.println("player level is: " + level);
        System.out.println("Player points are: " + points);
    }

    public int RollDice() {
        Random rand = new Random();
        rand.nextInt(10);
        return 10;
    }

    public void getPlayerPoints(){
        System.out.println("Your points reached: ");
    }
    
}
