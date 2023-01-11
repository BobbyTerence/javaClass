/* The East Coast sales division of a company generates 62 percent of total sales. 
Based on that percentage, write a program that will predict how much the East Coast division 
will generate if the company has $4.6 million in sales this year. */

package Chapter1;

public class salesPrediction 
{
    public static void main(String[] args)
    {
        //Declare variables and constants
        final double PERCENTAGE_SALE = .62;

        double compSales = 4.6;
        double eastCoastSales;

        //Calculate the given values
        eastCoastSales = PERCENTAGE_SALE * compSales;

        System.out.println("The East Coast Division of the company made $" + eastCoastSales + " millon out of the $" + compSales + " million total sales.");
    }    
}
