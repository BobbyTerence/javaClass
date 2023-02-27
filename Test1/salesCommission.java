//Will Flowers

//Import needed Classes
import java.util.Scanner;

public class salesCommission {
	public static void main(String[] args) {
		//Declare and initiate variables needed
		final double FIVE = .05, TEN = .10, TWELVE = .12, FOURTEEN = .14, SIXTEEN = .16;
		/* I'm using int instead of double since the numbers we
			are using are so large that it doesn't make sense
			to include the change */
		double sales = 0;
		double advancePay = 0;
		double commissionRate = 0;
		double commissionPay = 0;
		int valid = 1;
		
		//Create Scanner Object
		Scanner userInput = new Scanner(System.in);
		
		//Create a loop to check for a valid sales amount
		do {
			//Prompt the user for needed input
			System.out.print("Enter the amount of monthly sales: ");
			sales = userInput.nextInt();
			if (sales < 0) {
				System.out.println("Invalid input. Make sure amount is positive");
			}
		} while(sales < 0);
		
		//Create a loop to validate that advanced pay does not exceed commission pay
		do {
			//Prompt User for advanced pay
			System.out.print("Enter the amount of Advanced Pay: ");
			advancePay = userInput.nextInt();
			if (advancePay < 0) {
				System.out.println("Invalid input. Make sure amount is positive");
			} else {
				if(sales < 10000) {
					if(advancePay > (sales * FIVE)) {
						System.out.println("Advance Pay exceeds Commission, please try again.");
					} else {
						valid = 0;
					}
				}
				else if (sales >= 10000 && sales < 15000) {
					if(advancePay > (sales * TEN)) {
						System.out.println("Advance Pay exceeds Commission, please try again.");
					} else {
						valid = 0;
					}
				}
				else if (sales >= 15000 && sales < 18000) {
					if(advancePay > (sales * TWELVE)) {
						System.out.println("Advance Pay exceeds Commission, please try again.");
					} else {
						valid = 0;
					}
				}
				else if (sales >= 18000 && sales < 22000) {
					if(advancePay > (sales * FOURTEEN)) {
						System.out.println("Advance Pay exceeds Commission, please try again.");
					} else {
						valid = 0;
					}
				}
				else if (sales >= 22000) {
					if(advancePay > (sales * SIXTEEN)) {
						System.out.println("Advance Pay exceeds Commission, please try again.");
					} else {
						valid = 0;
					}
				}
			}
		} while(advancePay < 0 || valid == 1);
		
		//Close Scanner Object
		userInput.close();
		
		//Calcualte
		if(sales < 10000) {
			commissionRate = FIVE;
		}
		else if (sales >= 10000 && sales < 15000) {
			commissionRate = TEN;
		}
		else if (sales >= 15000 && sales < 18000) {
			commissionRate = TWELVE;
		}
		else if (sales >= 18000 && sales < 22000) {
			commissionRate = FOURTEEN;
		}
		else if (sales >= 22000) {
			commissionRate = SIXTEEN;
		}
		
		commissionPay = (sales * commissionRate) - advancePay;
		
		//Display
		System.out.printf("Your Commission rate is %.2f%% and your pay is $%.2f\n",commissionRate, commissionPay);
	}
}