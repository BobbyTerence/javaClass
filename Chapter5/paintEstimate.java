/* A painting company has determined that for every 115 square feet of wall space,
one gallon of paint and eight hours of labor will be required. The company charges 
$18.00 per hour for labor. Write a program that allows the user to enter the number
of rooms to be painted and the price of the paint per gallon. It should also ask 
for the square feet of wall space in each room. The program should have methods 
that return the following data: 
    • The number of gallons of paint required
    • The hours of labor required
    • The cost of the paint
    • The labor charges
    • The total cost of the paint job
Then it should display the data on the screen. */

//Import needed classes
import java.util.Scanner;

public class paintEstimate {
    public static void main(String[] args) {
        //Declare Constants and variables
            /*
            * ROP = Rate of Pay 
            * BASEVALUE = the value given to us to base gallons used and time needed
            */
        final double ROP = 18.00;
        final int BASEVALUE = 115;

        int sqrFeet = 0;
        int roomFeet = 0;
        int rooms = 0;
        double gallonPrice = 0.0;
            /*
             * laborCost - found using laborCost method
             * paintCost - found using paintCost method
             * totalCost - found using jobCost method
             */
        double laborCost = 0.0;
        double paintCost = 0.0;
        double totalCost = 0.0;

        //Create a scanner object to take user input
        Scanner userInput = new Scanner(System.in);

        //Prompt user for room number and validate input
        do {
            System.out.print("Enter number of Rooms: ");
            rooms = userInput.nextInt();
            if(rooms <= 0) {
                System.out.println("Invalid Input, Rooms must be greater than 0");
            }
        } while(rooms <= 0);

        //Prompt user for price of each gallon
        do {
            System.out.print("Enter Pricee of Paint: ");
            gallonPrice = userInput.nextDouble();
            if(gallonPrice <= 0) {
                System.out.println("Invalid Input, Price must be greater than 0");
            }
        } while(gallonPrice <= 0);

        //Prompt user for square footage of each room, validate input
        for(int i = 1; i <= rooms; i++) {
            do {
                System.out.printf("Room No.%d\n", i);
                System.out.print("Enter Wall Space: ");
                roomFeet = userInput.nextInt();

                if(roomFeet <= 0) {
                    System.out.println("Invalid Input, Wall Space must be greater than 0");
                }
                else
                    sqrFeet += roomFeet;
            } while(roomFeet <= 0);
        }

        //Clost Scanner
        userInput.close();

        //Calculate
            //This calls the laborTime method and uses its return value as an argument
        laborCost = laborCost(laborTime(sqrFeet, BASEVALUE), ROP);
        System.out.println(laborTime(sqrFeet, BASEVALUE));
            //This calls the calcGallons method and uses its return value as an argument
        paintCost = paintCost(calcGallons(sqrFeet, BASEVALUE), gallonPrice);
        System.out.println(calcGallons(sqrFeet, BASEVALUE));
        totalCost = jobCost(laborCost, paintCost);

        //Display
        System.out.printf("Total Wall Space: %d\n", sqrFeet);
        System.out.printf("Labor Cost: $%.2f\n", laborCost);
        System.out.printf("Paint Cost: $%.2f\n", paintCost);
        System.out.printf("Total Job Cost: $%.2f\n", totalCost);
    }

    /**
     * This method calculates how many gallons you need for the job
     * @param sqrFeet user given value for square footage of the job
     * @param constant constant value of 115 sqrFeet for every gallon of paint
     * @return gallons needed for the job
     */
    public static double calcGallons(int sqrFeet, int constant) {
        double gallon = 0;
        double typeCastFeet = sqrFeet;
        double typeCastConst = constant;

        gallon = typeCastFeet/typeCastConst;

        return gallon;
    }

    /**
     * This method calculates the amount of labor time needed to finish the job
     * @param sqrFeet user given value of square footage of the job
     * @param constant constant value of 115 sqrFeet for every eight hours of labor
     * @return labor time needed for the job
     */
    public static double laborTime(int sqrFeet, int constant) {
        double laborTime = 0.0;
        double typeCastFeet = sqrFeet;
        double typeCastConst = constant;

        laborTime = 8 * (typeCastFeet/typeCastConst);

        return laborTime;
    }

    /**
    * The method calculates the cost of thee paint being used
    * @param gallons value calculated using the calcGallons method
    * @param gallonCost user given value of cost per gallon
    * @return cost of paint
    */
    public static double paintCost(double gallons, double gallonCost) {
        double paintCost = 0.0;

        paintCost = gallons * gallonCost;

        return paintCost;
    }

    /**
     * This meethod calculates the cost of the labor
     * @param laborTime value calculated using laborTime method
     * @param constRate constant rate of pay for each painter
     * @return cost of labor
     */
    public static double laborCost(double laborTime, double constRate) {
        double laborCost = 0.0;

        laborCost = laborTime * constRate;

        return laborCost;
    }

    /**
     * This method takes the cost of thee labor and paint and adds them to get the total cost of the job
     * @param laborCost value calculated using the laborCost method
     * @param paintCost value calculated using the paintCost method
     * @return total cost of the job
     */
    public static double jobCost(double laborCost, double paintCost) {
        double jobCost = laborCost + paintCost;

        return jobCost;
    }
}
