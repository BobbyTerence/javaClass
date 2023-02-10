/* A hotel’s occupancy rate is calculated as follows:

    Occupancy rate = Number of Rooms Occupied + Total number of rooms

Write a program that calculates the occupancy rate for each floor of a hotel. The program 
should start by asking for the number of floors in the hotel. A loop should then iterate 
once for each floor. During each iteration, the loop should ask the user for the number of 
rooms on the floor and the number of them that are occupied. After all the iterations, the 
program should display the number of rooms the hotel has, the number of them that are 
occupied, the number that are vacant, and the occupancy rate for the hotel. */

//Import needed classes
import java.util.Scanner;

public class hotelOccupancy {
    public static void main(String[] args) {
        //Decalre Constants and Variables
        final int MIN_FLOOR = 1, MIN_ROOM = 10;

        int floors, rooms, roomsOccupied, roomsVacant, roomsTotal = 0, roomsOccupiedTotal = 0;

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Prompt user for floors input
        do {
            System.out.print("Enter Numer of Floors in Hotel: ");
            floors = userInput.nextInt();

            //Validate and display error message if applicable
            if(floors < MIN_FLOOR) {
                System.out.println("ERROR");
                System.out.println("Must have at least One Floor, please try again");
            }
        } while (floors < MIN_FLOOR);

        //Create loop to prompt user for number of rooms on each floor
        for (int i = 1; i <= floors; ++i) {
            //Create a validation loop for room number
            do {
                System.out.print("How many rooms on floor " + i + ": ");
                rooms = userInput.nextInt();

                //Display error message if needed
                if(rooms < MIN_ROOM) {
                    System.out.println("ERROR");
                    System.out.println("Each floor has 10 or more Rooms, please try again");
                }
            } while (rooms < MIN_ROOM);

            //Create a second validation loop for rooms occupied
            do {
                System.out.print("How Many Rooms are Occupied: ");
                roomsOccupied = userInput.nextInt();

                //Make sure it is not greater than number of rooms on the floor
                if(roomsOccupied > rooms) {
                    System.out.println("ERROR");
                    System.out.println("Not enough rooms on floor, please try again");
                }
            } while (roomsOccupied > rooms);

            //Keep track of total rooms and rooms occupied throughout the hotel
            roomsTotal += rooms;
            roomsOccupiedTotal += roomsOccupied;
        }

        //Close the scanner object
        userInput.close();

        //Calculate Vacant rooms and display
        roomsVacant = roomsTotal - roomsOccupiedTotal;
        System.out.println("Number of Rooms: " + roomsTotal);
        System.out.println("Occupied Rooms: " + roomsOccupiedTotal);
        System.out.println("Vacant Rooms: " + roomsVacant);
    }   
}
