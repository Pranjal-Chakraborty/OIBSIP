import java.util.*;

public class Guessing_game {

    public static void isCorrectNumber(int userNo, int computerNo) {

        if (userNo == computerNo) {
            System.out.println("\nCongratulations you have guessed the correct Number!!\n");
        } else if (userNo > computerNo) {
            System.out.println("\nYour Number is Greater than Computer Number!! Guess Something Smaller!\n");
        } else {
            System.out.println("\nYour Number is Smaller than Computer Number!! Guess Something Larger!\n");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberofguess = 0;

        NewGame game1 = new NewGame();

        int computerNo = game1.startGame();

        int userNumber;


        do {

            System.out.print("Enter Your Number : ");
            userNumber = scan.nextInt();

            isCorrectNumber(userNumber, computerNo);
            numberofguess ++;

        } while (userNumber != computerNo);

        System.out.println("\nYou Won te game by " + numberofguess +" "+"no of guesses!!\n");

        System.out.println("Do you want to play again? (Y/N)");
        char playAgain = scan.next().charAt(0);

        if (playAgain == 'Y') {
            game1.startGame();
        }

        scan.close();
    }
}
