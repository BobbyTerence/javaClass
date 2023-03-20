import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        //Declare constants and variables
            /*
             * These constants will mirror the constants in the compare() method
             * to determine game state
             */
        final int TIE = 0, COMPWIN = 1, USERWIN = 2;

        int result = 0;
        String compChoice = "";
        String userChoice = "";

        //Create Scanner Object
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are now participating in the most honorable duel known as\nRock Paper Scissors. RPS for short.");

        //Compare the two choices
        do {
            compChoice = compInput();
            userChoice = userChoice(userInput);

            result = compare(compChoice, userChoice);

            switch(result) {
                case COMPWIN:
                    System.out.printf("Computer Choice: %s\n", compChoice);
                    System.out.printf("User Choice: %s\n", userChoice);
                    System.out.println("Outcome: The Computer has won this most honorable duel");
                    break;
                case USERWIN:
                    System.out.printf("Computer Choice: %s\n", compChoice);
                    System.out.printf("User Choice: %s\n", userChoice);
                    System.out.println("The User has won this most honorable dual");
                    break;
                case TIE:
                    System.out.printf("Computer Choice: %s\n", compChoice);
                    System.out.printf("User Choice: %s\n", userChoice);
                    System.out.println("It seems we have a draw.");
                    break;
                default:
                    break;
            }
        } while(result == 0);

        //Close Scanner object
        userInput.close();
    }

    /**
     * This method will generate the random number make the rps descision
     * @return a string value that is determined by the random number generated
     */
    public static String compInput() {
        //Declare constants and variables for the function
            /*
             * These constants will hold the variables needed for keeping casing consistent
             */
        final String ROCK = "rock", PAPER = "paper", SCISSOR = "scissor";
        String rps = "";
        int compChoice = 0;

        //Create the random number generator objet
        Random rand = new Random();

        compChoice = rand.nextInt(4);

        switch(compChoice) {
            case 0:
                rps = ROCK;
                break;
            case 1:
                rps = PAPER;
                break;
            default:
                rps = SCISSOR;
                break;
        }

        return rps;
    }

    /**
     * This method is used to simplify the process of having the user enter a new choice each time there is a tie
     * @param userInput Scanner object used to take user Input
     * @return the user Input
     */
    public static String userChoice(Scanner userInput) {
        final String ROCK = "rock", PAPER = "paper", SCISSOR = "scissor";  

        String userChoice = "";

        do {
            System.out.print("Please Enter your Choice of Weapon: ");
            userChoice = userInput.nextLine().toLowerCase();
            if(!userChoice.equals(ROCK) && !userChoice.equals(PAPER) && !userChoice.equals(SCISSOR)) {
                System.out.println("Your given weapon of choice is not permitted, please resubmit");
            }
        } while(!userChoice.equals(ROCK) && !userChoice.equals(PAPER) && !userChoice.equals(SCISSOR));

        return userChoice;
    } 

    /**
     * This method compares the user choice as well as the comp choice and returns an int value
     * that will represent the game state
     * @param compChoice
     * @param userChoice
     * @return 0 for a tie, 1 for a computer win, and 2 for a user win
     */
    public static int compare(String compChoice, String userChoice) {
        final int TIE = 0, COMPWIN = 1, USERWIN = 2;
        
        switch(compChoice) {
            case "rock":
                switch(userChoice) {
                    case "rock":
                        return TIE;
                    case "paper":
                        return USERWIN;
                    default:
                        return COMPWIN;
                }
            case "paper":
                switch(userChoice) {
                    case "paper":
                        return TIE;
                    case "scissor":
                        return USERWIN;
                    default:
                        return COMPWIN;
                }
            default:
                switch(userChoice) {
                    case "scissor":
                        return TIE;
                    case "rock":
                        return USERWIN;
                    default:
                        return COMPWIN;
                }
        }
    }
}
