/* Write a program that asks the user for the names of two files. The first file should be opened 
for reading and the second file should be opened for writing. The program should read the contents 
of the first file, change all characters to uppercase, and store the results in the second file. 
The second file will be a copy of the first file, except that all the characters will be uppercase. 
Use Notepad or another text editor to create a simple file that can be used to test the program. */

//Import needed classes
import java.io.*;
import java.util.Scanner;

public class convertoUpper {
    public static void main(String[] args) 
        throws IOException {
        //Create Variables and Constants
        String outputStr = "", inputFileName = "", outputFileName = "";

        Scanner userInput = new Scanner(System.in);

        //Prompt user for file names
        System.out.print("Enter Initial Filename: ");
        inputFileName = userInput.nextLine();
        System.out.print("Enter Uppercase Filename: ");
        outputFileName = userInput.nextLine();

        //Create objects to work with files
        //Opens to Read File
        File readFile = new File(inputFileName);
        //Create and Open to Write to File
        FileWriter newFile = new FileWriter(outputFileName, true);
        PrintWriter outputFile = new PrintWriter(newFile);

        //Create object to read from the file
        Scanner inputFile = new Scanner(readFile);

        //Loop through the file until it has reached the EOF
        while(inputFile.hasNext()) {
            outputStr = inputFile.nextLine();
            outputFile.println(outputStr.toUpperCase());
        }

        //Close Scanner objects
        outputFile.close();
        inputFile.close();
        userInput.close();
    }    
}
