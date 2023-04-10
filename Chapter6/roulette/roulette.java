/* On a roulette wheel, the pockets are numbered from 0 to 36. The colors of the pockets are as follows:

    • Pocket 0 is green.
    • For pockets 1 through 10, the odd numbered pockets are red and the even numbered
        pockets are black.
    • For pockets 11 through 18, the odd numbered pockets are black and the even num-
        bered pockets are red.
    • For pockets 19 through 28, the odd numbered pockets are red and the even numbered
        pockets are black.
    • For pockets 29 through 36, the odd numbered pockets are black and the even num-
        bered pockets are red.

Write a class named RoulettePocket. The class’s constructor should accept a pocket number. The class 
should have a method named getPocketColor that returns the pocket’s color, as a string.
Demonstrate the class in a program that asks the user to enter a pocket number, and displays whether 
the pocket is green, red, or black. The program should display an error message if the user enters a 
number that is outside the range of 0 through 36. */

public class roulette {
    private String pocketColor = "";
    private int pocketNumber = 0;

    /**
     * This is a constructor for the class that initializes the number
     * @param number
     */
    public roulette(int number) {
        pocketNumber = number;
    }

    /**
     * This method takes the pocketNumber given in the Constructor and sets the value of pocketColor to the write color
     * according to what I have been given above
     * @return
     */
    public String getPocketColor() {
        if(pocketNumber == 0) {
            pocketColor = "green";
        }
        else if(pocketNumber >= 1 && pocketNumber <= 10) {
            //pocket number is even
            if((pocketNumber % 2) == 0) {
                pocketColor = "black";
            }
            //pocket number is odd
            else {
                pocketColor = "red";
            }
        }
        else if(pocketNumber >= 11 && pocketNumber <= 18) {
            //pocket number is even
            if((pocketNumber % 2) == 0) {
                pocketColor = "red";
            }
            //pocket number is odd
            else {
                pocketColor = "black";
            }
        }
        else if(pocketNumber >= 19 && pocketNumber <= 28) {
            //pocket number is even
            if((pocketNumber % 2) == 0) {
                pocketColor = "black";
            }
            //pocket number is odd
            else {
                pocketColor = "red";
            }
        }
        else if(pocketNumber >= 29 && pocketNumber <= 36) {
            //pocket number is even
            if((pocketNumber % 2) == 0) {
                pocketColor = "red";
            }
            //pocket number is odd
            else {
                pocketColor = "black";
            }
        }

        return pocketColor;
    }
}