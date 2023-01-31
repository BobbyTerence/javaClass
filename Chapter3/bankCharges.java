/* A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
    $.10 each for less than 20 checks 
    $.08 each for 20–39 checks
    $.06 each for 40–59 checks
    $.04 each for 60 or more checks 
Write a program that asks for the number of checks written for the month. The program should then calculate and
display the bank’s service fees for the month. */

//Import needed classes
import java.util.Scanner;

public class bankCharges 
{
    public static void main(String[] args)
    {
        //Declare Constants and Variables
        double BASE_FEE = 10.00;

        double cost;
        int checksWritten;

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Prompt User for input
        System.out.print("Number of Checks written this Month: ");
        checksWritten = userInput.nextInt();

        //Close Scanner object
        userInput.close();

        //Determine fee's and calculate
        if(checksWritten < 20)
            cost = BASE_FEE + (checksWritten * .10);
        else if(checksWritten >= 20 && checksWritten < 40)
            cost = BASE_FEE + (checksWritten * .08);
        else if(checksWritten >= 40 && checksWritten < 60)
            cost = BASE_FEE + (checksWritten * .06);
        else
            cost = BASE_FEE + (checksWritten * .04);

        //Display
        System.out.printf("Bank Service Fee: $%.2f\n", cost);
    }   
}
