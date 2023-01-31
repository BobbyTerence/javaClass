/* A mobile phone service provider has three different subscription packages for its customers

Package A: For 39.99/month 450 minutes provided, additional .45/minute
Package B: For 59.99/month 900 minutes provided, additional .40/minute
Package C: For 69.99/month Unlimited minutes

Write a program that calculates a customer’s monthly bill. It should ask the user to enter the
letter of the package the customer has purchased (A, B, or C) and the number of minutes that 
were used. The program should display the total charges. */

//Import needed classes
import java.util.Scanner;

public class mobileServiceProvider
{
    public static void main (String[] args)
    {
        //Declare Constants and Variables
        final double A_COST = 39.99, B_COST = 59.99, C_COST = 69.99;
        final int A_LIMIT = 450, B_LIMIT = 900;
        final char A = 'a', B = 'b', C = 'c';

        char planInput;
        int minutesUsed;
        double cost = 0.0, overageCost;
        boolean valid = false;
        
        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Create a loop to validate Plan input and then calculate
        do
        {
            //Prompt the user for data
            System.out.print("What Mobile Service package do you have: ");
            planInput = Character.toLowerCase(userInput.next().charAt(0));

            System.out.print("Enter number of Minutes used: ");
            minutesUsed = userInput.nextInt();

            switch(planInput)
            {
                case A:
                {
                    if(minutesUsed > A_LIMIT)
                    {
                        overageCost = (minutesUsed - A_LIMIT) * .45;
                        cost = A_COST + overageCost;
                    }
                    else
                        cost = A_COST;

                    valid = true;
                    break;
                }

                case B:
                {
                    if(minutesUsed > B_LIMIT)
                    {
                        overageCost = (minutesUsed - B_LIMIT) * .40;
                        cost = B_COST + overageCost;
                    }
                    else
                        cost = B_COST;

                    valid = true;
                    break;
                }

                case C:
                {
                    cost = C_COST;
                    valid = true;
                    break;
                }

                default:
                {
                    System.out.println("Invalid Plan, please try again.");
                    valid = false;
                    break;
                }
            }
        } while(valid == false);

        userInput.close();

        //Display
        System.out.printf("Your total bill is: $%,.2f\n", cost);
    }
}