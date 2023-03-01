/* Write a program that asks the user to enter five test scores. The program should display a letter grade 
for each score and the average test score. Write the following methods in the program:
    • calcAverage—This method should accept five test scores as arguments and return the average of the scores.
    • determineGrade—This method should accept a test score as an argument and return a letter grade for the score, based on the following grading scale:
        Score       Letter Grade
        90-100      A
        80-89       B
        70-79       C
        60-69       D
        Below 60    F */

//Import needed classes
import java.util.Scanner;

public class gradeCalc {
    public static void main(String[] args) {
        //Create constants and variables needed
        final int TEST = 5;
        double testScore = 0;
        double testScoreTotal = 0;
        double testAverage = 0;
        char letterGrade;
        char letterGradeFinal;

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //Create a loop to prompt user for five tests
        for(int i = 1; i <= TEST; i++) {
            //Create a validation loop to make sure it is a valid test score
            do {
                System.out.printf("Enter score for test %d: ", i);
                testScore = userInput.nextDouble();
                if (testScore < 0 || testScore > 100) {
                    System.out.println("Invalid grade");
                    System.out.println("Grade must be between 0 and 100");
                }
            } while (testScore < 0 || testScore > 100);

            //Add to total test score
            testScoreTotal += testScore;

            //Pass testScore to determineGrade method to find letter grade
            letterGrade = determineGrade(testScore);

            //Display the letter grade of the test
            System.out.printf("Test %d letter grade: %c\n", i, letterGrade);
        }

        //Calculate the overall average of the tests
        testAverage = calcAverage(testScoreTotal);

        //Get the letter grade of the overall average
        letterGradeFinal = determineGrade(testAverage);

        //Display the average score and grade
        System.out.printf("Average Score: %.2f%%\n", testAverage);
        System.out.printf("Average Letter Grade: %c\n", letterGradeFinal);

        //Close scanner object
        userInput.close();
    }

    /**
     * This method calculates the overall test average out of the five tests
     * This method is createed with the assumption of five test scores being given
     * @param testTotal the added total of all tests given
     * @return Average test score
     */
    public static double calcAverage(double testTotal) {
        //Create local constants and variables
        final int TESTS = 5;
        double testAverage;

        //Calculate
        testAverage = (testTotal / TESTS);

        return testAverage;
    }

    /**
     *  This method will determine the letter grade for a given score
     * @param testScore is the score of test being passes
     * @return the letter grade of score given
     */
    public static char determineGrade(double testScore) {
        //Create constant values for letter grades
        final char A = 'A', B = 'B', C = 'C', D = 'D', F = 'F';

        //compare values and 
        if (testScore >= 90) {
            return A;
        }
        else if (testScore >= 80 && testScore < 90) {
            return B;
        }
        else if (testScore >= 70 && testScore < 80) {
            return C;
        }
        else if (testScore >= 60 && testScore < 70) {
            return D;
        }
        else
            return F;
    }
}
