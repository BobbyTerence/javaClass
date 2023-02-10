/* Write a program that asks the user for a positive nonzero integer value. The program should use a 
loop to get the sum of all the integers from 1 up to the number entered. For example, if the user 
enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50. */

//Import classes
import javax.swing.JOptionPane;

public class numberSum {
    public static void main(String[] args) {
        //Declare constants and variables
        int summation = 0, given;
        String input;

        //Prompt user for input
        input = JOptionPane.showInputDialog("This application gives the summation of the given number.\nPlease enter a Number:");
        given = Integer.parseInt(input);

        //Calculate the Summation
        for(int i = 1; i <= given; i++)
        {
            summation += i;
        }

        //Display the answer
        JOptionPane.showMessageDialog(null, "Summation of " + given + " is " + summation);

        //Close the application
        System.exit(0);
    }
}