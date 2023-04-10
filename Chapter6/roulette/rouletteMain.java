//Import needed classes
import java.util.Scanner;

public class rouletteMain {
    public static void main(String[] args) {
        //Create variables and constants
        String pocketColor;
        int pocketNum;

        //Create the Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        //Prompt the user for a pocket number
        do {
            System.out.print("Please Enter a Pocket Number: ");
            pocketNum = userInput.nextInt();

            if(pocketNum < 0 || pocketNum > 36) {
                System.out.println("Invalid pocket number, must be between 0 and 36");
            }
        } while(pocketNum < 0 || pocketNum > 36);

        //Close the Scanner object
        userInput.close();

        //Create the roulette object
        roulette pocket = new roulette(pocketNum);

        //Set the pocket color variable in the main class using the getPocketColor method
        pocketColor = pocket.getPocketColor();

        //Dispaly the pocket color
        System.out.printf("The pocket color you have chosen is: %s\n", pocketColor);
    }
}
