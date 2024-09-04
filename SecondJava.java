
import java.util.Scanner;

public class SecondJava{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dice game");

        //First Player
        System.out.println("lets start with the first player info");
        System.out.println("Whats your name: ");
        String firstPlayerName = scanner.nextLine();
        System.out.println("whats your sex: ");
        String firstPlayerSex = scanner.nextLine();
        Player player1 = new Player(firstPlayerName, firstPlayerSex.charAt(0));

        System.out.println("-------------------");

        //Second Player
        System.out.println("now for the second player info");
        System.out.println("Whats your name: ");
        String secondPlayerName = scanner.nextLine();
        System.out.println("whats your sex: ");
        String secondPlayerSex = scanner.nextLine();
        Player player2 = new Player(secondPlayerName, secondPlayerSex.charAt(0));

        //Getting the players info
        System.out.println("Here are the two players info");
        System.out.println("");
        System.out.println("Player 1");
        player1.getPlayer();
        System.out.println("");
        System.out.println("Player 2");
        player2.getPlayer();

    }
}