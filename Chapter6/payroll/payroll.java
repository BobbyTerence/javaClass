/*
 * Design a Payroll class that has fields for an employee’s name, ID number, hourly pay rate, and number of hours worked.
 * Write the appropriate accessor and mutator methods and a constructor that accepts the employee’s name and ID number 
 * as arguments. The class should also have a method that returns the employee’s gross pay, which is calculated as the 
 * number of hours worked multiplied by the hourly pay rate. Write a program that demonstrates the class by creating a Payroll 
 * object, then asking the user to enter the data for an employee. The program should display the amount of gross pay earned.
 */

 //Import the scanner class
 import java.util.Scanner;

 public class payroll {
    //Create the variables that will be stored in this class
    private String empName;
    private int idNum;
    private double hourPay;
    private double hourWork;

    //Base Constructor
    public payroll(String constrName, int constrID) {
        empName = constrName;
        idNum = constrID;
    }

    //Accessors
    /**
     * Accessor for empName
     * @return
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Accessor for idNum
     * @return
     */
    public int getID() {
        return idNum;
    }

    /**
     * Accessor for hourPay
     * @return
     */
    public double getHourPay() {
        return hourPay;
    }

    /**
     * Accessor for hourWork
     * @return
     */
    public double getHourWork() {
        return hourWork;
    }

    //Mutators
    /**
     * Mutator for empName
     * @param nameSet
     */
    public void setEmpName(String nameSet) {
        empName = nameSet;
    }

    /**
     * Mutator for idSet
     * @param idSet
     */
    public void setID(int idSet) {
        idNum = idSet;
    }

    /**
     * Mutator for hourPay
     * @param setPay
     */
    public void setHourPay(double setPay) {
        hourPay = setPay;
    }

    /**
     * Mutator for hourWork
     * @param setWork
     */
    public void setHourWork(double setWork) {
        hourWork = setWork;
    }

    /**
     * Calculates the gross pay of the worker
     * @return gross pay for current time worked
     */
    public double grossPay(Scanner userInput) {
        if(hourWork == 0) {
            System.out.println("Missing Hours Worked");
            do {
                System.out.print("Please enter Hours Worked now: ");
                hourWork = userInput.nextDouble();

                if(hourWork <= 0) {
                    System.out.print("Invalid input");
                }
            } while(hourWork <= 0);
        }
        else if(hourPay == 0) {
            System.out.println("Missing Hourly Pay");
            do {
                System.out.print("Please enter Hourly Pay now: ");
                hourPay = userInput.nextDouble();

                if(hourPay <= 0) {
                    System.out.print("Invalid input");
                }
            } while(hourPay <= 0);
        }
        return hourPay * hourWork;
    }
}