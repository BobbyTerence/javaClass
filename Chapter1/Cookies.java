/* A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 servings in the bag and that
a serving equals 300 calories. Write a program that lets the user enter the number of cookies he or she actually ate and then
reports the number of total calories consumed. */

package Chapter1;
import javax.swing.JOptionPane;

public class Cookies
{
    public static void main(String[] args)
    {
        //Declare constants and variables
        final int COOKIES_PER_BAG = 40, SERVINGS = 10, CALORIES = 300;

        String input;
        int cookies, totalCalories;

        //user input
        input = JOptionPane.showInputDialog("Enter the number of cookies did you eat?");
        cookies = Integer.parseInt(input);

        //calculate
        //Cookies per serving
        final int COOKIES_PER_SERVING = COOKIES_PER_BAG / SERVINGS;

        //Calories per cookie
        final int CALORIES_PER_COOKIE = CALORIES / COOKIES_PER_SERVING;

        //Total Calories
        totalCalories = cookies * CALORIES_PER_COOKIE;

        //Display
        JOptionPane.showMessageDialog(null, "The total calories you consumed was " + totalCalories);

        //Close the program
        System.exit(0);
    }
}