//Import Scanner class
import java.util.Scanner;

public class travelExpenseMain {
    public static void main(String[] args) {
        //Create variables for the program
        int days = 0;
        double airfare = 0.0;
        double carRentalFee = 0.0;
        double miles = 0.0;
        double parkFee = 0.0;
        double taxiFee = 0.0;
        double regFee = 0.0;
        double lodging = 0.0;
        boolean newTrip = true;

        char choices = ' ';

        //Create Scanner
        Scanner userInput = new Scanner(System.in);       
        
        do {
            //Create Travel Expense object
            travelExpense travel = new travelExpense();

            //Prompt user, for information and validate
            do{
                System.out.print("Number of days on the Trip: ");
                days = userInput.nextInt();
                if(days <= 0) {
                    System.out.println("Invalid input given, please enter a number greater than 0");
                }
            } while(days <= 0);
            travel.setDays(days);

            System.out.print("Did you have an Airfare Charge(y/n): ");
            choices = userInput.next().charAt(0);
            if(Character.compare('y', choices) == 0) {
                do{
                    System.out.print("Airfare Charge: ");
                    airfare = userInput.nextDouble();
                    if(airfare <= 0) {
                        System.out.println("Invalid input given, please enter a number greater than 0");
                    }
                } while(airfare <= 0);
            }
            travel.setAirfare(airfare);

            System.out.print("Did you have a Car Rental Charge(y/n): ");
            choices = userInput.next().charAt(0);
            if(Character.compare('y', choices) == 0) {
                do{
                    System.out.print("Car Rental Charge: ");
                    carRentalFee = userInput.nextDouble();
                    if(carRentalFee <= 0) {
                        System.out.println("Invalid input given, please enter a number greater than 0");
                    }
                } while(carRentalFee <= 0);
            }
            travel.setCarRental(carRentalFee);

            System.out.print("Did you drive your own car(y/n): ");
            choices = userInput.next().charAt(0);
            if(Character.compare('y', Character.toLowerCase(choices)) == 0) {
                do{
                    System.out.print("Miles Driven: ");
                    miles = userInput.nextDouble();
                    if(miles <= 0) {
                        System.out.println("Invalid input given, please enter a number greater than 0");
                    }
                } while(miles <= 0);
            }
            else {
                travel.setMiles(0);
            }
            travel.setMiles(miles);

            do{
                System.out.print("Parking Fee: ");
                parkFee = userInput.nextDouble();
                if(parkFee < 0) {
                    System.out.println("Invalid input given, please enter a number greater than 0");
                }
            } while(parkFee < 0);
            travel.setParkFee(parkFee);

            do{
                System.out.print("Taxi Fee: ");
                taxiFee = userInput.nextDouble();
                if(taxiFee < 0) {
                    System.out.println("Invalid input given, please enter a number greater than 0");
                }
            } while(taxiFee < 0);
            travel.setTaxiFee(taxiFee);

            do{
                System.out.print("Conference Registration Fee: ");
                regFee = userInput.nextDouble();
                if(regFee < 0) {
                    System.out.println("Invalid input given, please enter a number greater than 0");
                }
            } while(regFee < 0);
            travel.setRegFee(regFee);

            do{
                System.out.print("Lodging Per Night: ");
                lodging = userInput.nextDouble();
                if(lodging < 0) {
                    System.out.println("Invalid input given, please enter a number greater than 0");
                }
            } while(lodging < 0);
            travel.setLodging(lodging);

            //The Dipla method provided included calling the methods that calculate both expense total and allowable total
            travel.displayMethod();

            //Prompt user if they would like to enter a new trip
            System.out.print("Would you like to enter in a new Trip(y/n): ");
            choices = userInput.next().charAt(0);

            switch(choices) {
                case 'y':
                    newTrip = true;
                    break;
                default:
                    newTrip = false;
                    break;
            }
        } while(newTrip == true);

        //Close the Scanner object
        userInput.close();
    }
}
