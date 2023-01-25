// Assignment done in class to calculate a Restaurant Bill with Tip and Tax
package Chapter1;

//Import classes
import java.util.Scanner;

public class restaurantBill
{
    public static void main(String[] args)
    {
        //Consants and variables
        final double TAX_RATE = .0675;
        final double TIP_PERCENT = .20;

        double mealCharge;
        double taxAmt;
        double tipAmt;
        double total;

        //Create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Enter the meal charge: ");
        mealCharge = input.nextDouble();

        input.close();

        //Calculate
        taxAmt = mealCharge * TAX_RATE;
        tipAmt =( mealCharge + taxAmt) * TIP_PERCENT;

        total = mealCharge + taxAmt + tipAmt;

        //Display
        System.out.println("Meal Charge: $" + mealCharge + "\nTax Amount: $" + taxAmt + "\nTip Amount: $" + tipAmt + "\nTotal Charge: $" + total);
    }
}