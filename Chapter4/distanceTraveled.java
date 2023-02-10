/* The distance a vehicle travels can be calculated as follows:
    Distance = Speed * Time
For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is 120 miles.
Write a program that asks for the speed of a vehicle (in miles-per-hour) and the number of hours it 
has traveled. It should use a loop to display the distance a vehicle has traveled for each hour of a 
time period specified by the user. For example, if a vehicle is traveling at 40 mph for a three-hour 
time period, it should display a report similar to the one that follows: 

    Hour            Distance Traveled
    1               40
    2               80
    3               120
    
Input Validation: Do not accept a negative number for speed and do not accept any value less than 1 for time traveled.*/
//Example done together in class

//Import needed classes 
import java.util.Scanner;

public class distanceTraveled 
{
    public static void main(String[] args)
    {
        //Declare Constants and Variables
        double speed;
        int hours;

        //Create Scanner Object
        Scanner userInput = new Scanner(System.in);

        //Prompt for input
        System.out.print("Enter the vehicle's Spped: ");
        speed = userInput.nextDouble();

        //Validate
        while(speed < 0)
        {
            System.out.println("Invalid input");
            System.out.print("Enter the vehicle's Spped: ");
            speed = userInput.nextDouble();
        }

        System.out.print("Enter the number of hours the vehicle was in motion: ");
        hours = userInput.nextInt();

        //Validate
        while(hours < 0)
        {
            System.out.println("Invalid input");
            System.out.print("Enter the number of hours the vehicle was in motion: ");
            hours = userInput.nextInt();
        }

        //Close Scanner
        userInput.close();

        //Dispaly Header for Table
        System.out.println("Hour\tDistance Traveled");
        System.out.println("-------------------------");

        //Create loop to Display the hour and distance traveled
        for(int period = 1; period <= hours; period++)
        {
            System.out.println(period + "\t\t" + period * speed);
        }
    }    
}
