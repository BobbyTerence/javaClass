/* Write a program that plays a simple dice game between the computer and the user. 
When the program runs, a loop should repeat 10 times. 
Each iteration of the loop should do the following: 
• Generate a random integer in the range of 1 through 6. This is the value of the computer’s die.
• Generate another random integer in the range of 1 through 6. This is the value of the user’s die.
• The die with the highest value wins. (In case of a tie, there is no winner for that particular roll of the dice.) 
As the loop iterates, the program should keep count of the number of times the computer 
wins, and the number of times that the user wins. After the loop performs all of its 
iterations, the program should display who was the grand winner, the computer or the user. */

//Import needed classes
import java.util.Random;

public class diceGame {
    public static void main(String[] args) {
        //Declare Variables and Constants
        final int GAME_TERM = 10;
        int compRoll = 0, compWin = 0, userRoll = 0, userWin = 0;

        //Create Random object
        Random diceRoll = new Random();

        //Create the loop
        for(int i = 0; i < GAME_TERM; i++) {
            compRoll = diceRoll.nextInt(6);
            userRoll = diceRoll.nextInt(6);

            //Determine who won the round
            if (compRoll < userRoll) {
                userWin++;
                System.out.println("User Win");
            }
            else if (compRoll > userRoll) {
                compWin++;
                System.out.println("Computer Win");
            }
            else
                System.out.println("Tie");
        }

        //Compare Results and declare overall winner
        if (compWin > userWin) {
            System.out.printf("Computer wins %d to %d\n", compWin, userWin);
        }
        else if (compWin < userWin) {
            System.out.printf("Userwins %d to %d\n", userWin, compWin);
        }
        else
            System.out.printf("The game was tied %d for Computer to %d for User\n", compWin, userWin );
    }
}
