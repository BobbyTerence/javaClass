/* Write a program that ask the user for the number of shares of stock they bought.
The price per share is $23.87. They must pay their stock broker a 2 percent commission for the transaction.
Write a program that calculates and displays the following:

The amount paid for the stock alone(without the commission)
The amount of the commission
The total amount paid(for the stock plus the commission) */

package Chapter1;

import java.util.Scanner;

public class stockPurchase
{
    public static void main(String[] args)
    {
        //Declare constants and variables
        final double STOCK_COST = 23.87;
        final double COMMIS = .02;

        int shares;
        double paid;
        double commission;
        double total;

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Prompt user for input
        System.out.println("Stock Price: " + STOCK_COST + "\n" + 
        "Broker Commission: 2%");
        System.out.print("Number of Stocks you wish to purchase: ");
        shares = userInput.nextInt();

        //Calculate the costs
        //Without commission
        paid = shares * STOCK_COST;
        //Commission
        commission = paid * COMMIS;
        //Total
        total = paid + commission;

        //Display
        System.out.println("Price for the Stocks: " + paid +
        "\nCommission Total: " + commission +
        "\nTotal Cost: " + total);
    }
}