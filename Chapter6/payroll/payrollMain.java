//Import needed classes
import java.util.Scanner;

//This is the class that will run the payroll class we just wrote
public class payrollMain {
    public static void main(String[] args) {
        //Create variables
        String empName;
        int idNum;
        double hourPay;
        double hourWork;
        double grossPay;

        //Create the Scanner object
        Scanner userInput = new Scanner(System.in);

        //Prompt the user for initial information
        System.out.print("Enter Employee Name: ");
        empName = userInput.nextLine();
        System.out.print("Enter Employee ID Number: ");
        idNum = userInput.nextInt();

        //Create the payroll object
        payroll emp = new payroll(empName, idNum);

        //Prompt user for Hours Worked
        do {
            System.out.print("Enter Hours Worked: ");
            hourWork = userInput.nextDouble();

            if(hourWork <= 0) {
                System.out.print("Invalid input");
            }
        } while(hourWork <= 0);
        //Set value of object
        emp.setHourWork(hourWork);

        //Prompt user for hourly pay
        do {
            System.out.print("Enter Hourly Pay: ");
            hourPay = userInput.nextDouble();

            if(hourPay <= 0) {
                System.out.print("Invalid input");
            }
        } while(hourPay <= 0);
        //Set value of object
        emp.setHourPay(hourPay);

        //Close Scanner object
        userInput.close();

        //Calculate and display gross pay
        grossPay = emp.grossPay(userInput);

        System.out.printf("\nEmployee Payroll Data\n");
        System.out.printf("Name: %s\n", emp.getEmpName());
        System.out.printf("ID Number: %d\n", emp.getID());
        System.out.printf("Hourly Pay: %.2f\n", emp.getHourPay());
        System.out.printf("Hours Worked: %.1f\n", emp.getHourWork());
        System.out.printf("Gross Pay: %.2f\n", grossPay);
    }
}
