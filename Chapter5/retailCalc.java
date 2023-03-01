/* Write a program that asks the user to enter an item’s wholesale cost and its 
markup percentage. It should then display the item’s retail price. For example:
    • If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, 
    then the item’s retail price is 10.00.
    • If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, 
    then the item’s retail price is 7.50. 
The program should have a method named calculateRetail that receives the 
wholesale cost and the markup percentage as arguments, and returns the 
retail price of the item. */

//Import needed classes
import java.util.Scanner;

public class retailCalc {
    public static void main(String[] args) {
        //Create Variables
        double wholesalePrice, markupPct, retailCost;

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Prompt user for needed information;
        System.out.print("Enter Wholesale Price: ");
        wholesalePrice = userInput.nextDouble();

        System.out.print("Enter the Markup Percentage: ");
        markupPct = userInput.nextDouble();

        //Close the Scanner object
        userInput.close();

        //Call the method to calculate the total price
        retailCost = calcRetail(wholesalePrice, markupPct);

        //Dispaly the retail price
        System.out.printf("Retail Price: $%.2f\n", retailCost);
    }

    /**
     * This method calculates the retail cost of the wholesale item
     * @param wholesale is the wholesalae price of the item
     * @param markup is the percentage marakup of the item
     * @return The full retail cost of an item
     */
    public static double calcRetail(double wholesale, double markup) {
        double retailMarkup;
        double retailCost;

        retailMarkup = wholesale * (markup/100);

        retailCost = wholesale + retailMarkup;

        return retailCost;
    }
}
