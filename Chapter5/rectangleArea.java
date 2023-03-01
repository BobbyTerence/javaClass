/* This is a program done in class after going over methods */

import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        //Create variables
        double length, width, area;

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Call Methods to assign length and width values;
        length = getLength(userInput);

        width = getWidth(userInput);

        //Close Scanner object
        userInput.close();

        //Call Method to calculate and assign area
        area = getArea(length, width);

        //Call Dispaly method
        display(length, width, area);
    }

    /** The getLength method prompts user for length of the rectangle
     * @return the length of the rectangle
     */
    public static double getLength(Scanner userInput) {
        //Create a variable
        double length;

        System.out.print("Enter rectangles length: ");
        length = userInput.nextDouble();

        //userInput.close();

        return length;
    }

    /** The getWidth method prompts the usere for the width of the rectangl
     * @return the width of the rectangle
     */
    public static double getWidth(Scanner userInput) {
        //Create a variable
        double width;

        System.out.print("Enter rectangles width: ");
        width = userInput.nextDouble();

        //userInput.close();

        return width;
    }

    /** The getArea method finds the area of the rectangle
     * @param length length of the rectangle
     * @param width width of the rectangle
     * @return area of the rectangle
     */
    public static double getArea(double length, double width) {
        //Create variable to hold the value of the area
        double area;

        //Area of a rectangle is equal to length * width
        area = length * width;

        return area;
    }

    /** The display method is a method used to display all of our values
     * @param length length of the rectangle
     * @param width width of the rectangle
     * @param area calculated area of the rectangle
     */
    public static void display(double length, double width, double area) {
        System.out.printf("The Area of a Rectangle with length %.2f and width %.2f has an area of %.2f\n", length, width, area);
    }
}
