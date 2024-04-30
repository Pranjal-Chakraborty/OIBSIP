import java.util.*;

public class NewGame {

    public int startGame() {

        Random rand = new Random();
        int computerNo = rand.nextInt(100);
        System.out.println("\nGuess the number between 1 to 100!\n");
        return computerNo;

    }
}
