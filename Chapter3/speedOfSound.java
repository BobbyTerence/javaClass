/* The following table shows the approximate speed of sound in air, water, and steel:
    Medium             Speed
    Air:           1,100 ft/s
    Water:         4,900 ft/s
    Steel:        16,400 ft/s

    Write a program that asks the user to enter “air”, “water”, or “steel”, and the
    distance that a sound wave will travel in the medium. The program should then 
    display the amount of time it will take. 

    You can calculate the amount of time it takes sound to travel in air with the following formula:
        Time = Distance/1,100
    You can calculate the amount of time it takes sound to travel in water with the following formula:
        Time = Distance/4,900
    You can calculate the amount of time it takes sound to travel in steel with the following formula:
        Time = Distance/16,400 */

//Import classes
import java.util.Scanner;

public class speedOfSound 
{
    public static void main(String[] args)
    {
        //Declare Constants and variables
        final double AIR_SPEED = 1100, WATER_SPEED = 4900, STEEL_SPEED = 16400;
        final String AIR = "air", WATER = "water", STEEL = "steel";

        String mediumInput;
        double distanceInput;
        double timeElapsed = 0.0;

        //Create Scanner Object
        Scanner userInput = new Scanner(System.in);

        //Prompt for user input
        System.out.print("Enter one of the following; Air, Water, Steel: ");
        mediumInput = userInput.nextLine();
        System.out.print("Enter Distance Traveled, in Feet: ");
        distanceInput = userInput.nextDouble();

        //Close Scanner Object
        userInput.close();

        //Calculate
        if(mediumInput.compareToIgnoreCase(AIR) == 0)
            timeElapsed = distanceInput / AIR_SPEED;
        else if(mediumInput.compareToIgnoreCase(WATER) == 0)
            timeElapsed = distanceInput / WATER_SPEED;
        else if(mediumInput.compareToIgnoreCase(STEEL) == 0)
            timeElapsed = distanceInput / STEEL_SPEED;
        else //This is an invalid input case
        {
            System.out.println("Invalid Medium Input.\nApplication closing");
            System.exit(0);
        }

        //Dsiplay
        System.out.printf("It will take %,.2f seconds\n", timeElapsed);
    }
}
