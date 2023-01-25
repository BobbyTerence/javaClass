/* The Fast Freight Shipping Company charges the following rates:
Weight of Package                           Rate per 500 Miles Shipped
2 pounds or less                            $1.10
Over 2 pounds but not more than 6 pounds    $2.20
Over 6 pounds but not more than 10 pounds   $3.70
Over 10 pounds                              $3.80
The shipping charges per 500 miles are not prorated. For example, if a 2-pound package is shipped 550 miles, the charges would be $2.20.
Write a program that asks the user to enter the weight of a package and then displays the shipping charges. */

//Import classes
import javax.swing.JOptionPane;

public class shippingCharges 
{
    public static void main(String[] args)
    {
        //Declare constants and variables
        final int CHARGELIMIT = 500;

        String input;
        double rate;
        double cost;
        int distance;
        int rateCharge;
        int weight;

        //Prompt user
        input = JOptionPane.showInputDialog(null, "Enter the Weight, in Pounds");
        weight = Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null, "Enter distance Shipped, in Miles.");
        distance = Integer.parseInt(input);

        //Calculate
        //How many times rate is charged
        rateCharge = distance / CHARGELIMIT;
            //Make sure rateCharge is at least 1
            if(rateCharge < 1)
                rateCharge = 1;

        //Rate by Weight
        if(weight >= 10)
            rate = 3.8;
        else if(weight >= 6)
            rate = 3.7;
        else if(weight >= 2)
            rate = 2.2;
        else
            rate = 1.1;

        //Cost
        cost = rateCharge * rate;

        //Display
        JOptionPane.showMessageDialog(null,String.format("Shipping Charges are $%,.2f", cost));

        //Close the program
        System.exit(0);
    }
}
