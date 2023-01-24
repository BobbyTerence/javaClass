/* A cookie recipe calls for the following ingredients:
• 1.5 cups of sugar
• 1 cup of butter
• 2.75 cups of flour
The recipe produces 48 cookies with these amounts of the ingredients. Write a program that asks the user how many cookies he or she wants to make, 
and then displays the number of cups of each ingredient needed for the specified number of cookies. */

package Chapter1;

//Import classes
import java.util.Scanner;

public class ingredientAdjuster 
{
    public static void main(String[] args)
    {
        //Declare constants and variables
        final double SUGAR = 1.5;
        final double BUTTER = 1;
        final double FLOUR = 2.75;
        final double COOKIES = 48;

        double sugar;
        double butter;
        double flour;
        double cookies;
        double ratio;

        //Create the scanner object to accept user input
        Scanner input = new Scanner(System.in);

        //Prompt user for input
        System.out.print("How many cookies would you like to make: ");
        cookies = input.nextInt();

        //Calculate the ratio for the recipe
        ratio = cookies/COOKIES;

        //Apply that ratio to the rest of the ingredients
        sugar = ratio * SUGAR;
        butter = ratio * BUTTER;
        flour = ratio * FLOUR;

        //Display the adjusted recipe
        System.out.println("To make " + cookies + " you will need:\n" + sugar + " cups of sugar\n" + butter + " cups of butter\n" + flour + " cups of flour");
    }
}
