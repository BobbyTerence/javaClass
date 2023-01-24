/* A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
Quantity Discount
10–19    20% 
20–49    30% 
50–99    40% 
100-...  50%
Write a program that asks the user to enter the number of packages purchased. The pro- gram should then display the amount 
of the discount (if any) and the total amount of the purchase after the discount. */
//Done together in class

import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class softwareSales
{
    public static void main(String[] args)
    {
        //Declare Constants and Variables
        final int UNIT_PRICE = 99;

        int packages;
        double discountPerc, discount, total;

        //Create Scanner Object
        Scanner userInput = new Scanner(System.in);

        //User input
        System.out.print("Enter the number of packages purchased: ");
        packages = userInput.nextInt();

        //Descision making state to determine the discount percentage
        if(packages >= 100)
            discountPerc = .5;
        else if(packages >= 50)
            discountPerc = .4;
        else if(packages >= 20)
            discountPerc = .3;
        else if(packages >= 10)
            discountPerc = .2;
        else
            discountPerc = 0;

        //calculate discount
        discount = packages * UNIT_PRICE * discountPerc;

        //Calculate totale amount after discount
        total = (packages * UNIT_PRICE) - discount;

        //display
        System.out.printf("Discount: $%,.2f\n", discount);
        System.out.printf("Total amount: $%,.2f\n", total);

    }
}