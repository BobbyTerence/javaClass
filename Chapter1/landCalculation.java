/*Assignment: One acre of land is equivalent to 43,560 square feet. Write a program that calculates
 the number of acres in a tract of land with 389,767 square feet */

package Chapter1;

public class landCalculation 
{
    public static void main (String[] args) 
    {
        //Declare variables and constants
        final int FEET_PER_ACRE = 43560;

        int tract = 389767;
        double acresCalc;

        //Calculations
        //Tract of land is given to us in feet, so we have to divide the numbers
        acresCalc = tract / FEET_PER_ACRE;

        //Display
        System.out.println("A tract of land with " + tract + " square feet is equal to " + acresCalc + " acres.");
    }
}
