import java.util.Scanner;

public class tipCalculation {
    public static void main(String[] args) {
        //Create Variables and constants
        double mealCost = 0.0, mealTotal = 0.0, tipAmt = 0.0;

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Prompt the user for meal cost
        System.out.print("Enter the price of the meal: ");
        mealCost = userInput.nextDouble();

        //Close userInput
        userInput.close();

        //Calculate Tip amount
        tipAmt = tipCalc(mealCost);

        //Calculate meal total and display
        mealTotal = tipAmt + mealCost;

        System.out.printf("Meal Cost: $%2f\n", mealCost);
        System.out.printf("Tip Amount: $%2f\n", tipAmt);
        System.out.printf("Total Cost: $%2f\n", mealTotal);
    }

    public static double tipCalc(double mealPrice) {
        final double LOWTIP = .15, HIGHTIP = .2;

        double tipAmt = 0.0;

        if(mealPrice >= 50.00) {
            tipAmt = mealPrice * HIGHTIP;
        }
        else {
            tipAmt = mealPrice * LOWTIP;
        }

        return tipAmt;
    }
}
