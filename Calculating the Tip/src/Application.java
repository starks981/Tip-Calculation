// Importing the util package
import java.util.*;

public class Application {
	
	// The main method of the application
	public static void main(String[] args) {
		
		// Creating a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Output a prompt asking for user input
		System.out.println("Please enter the amount of the bill:");
		
		// Wait for the user to input something
		Double myDouble = input.nextDouble();
		
		// Take the value inputed by the user and multiply by 20%
		Double tip = myDouble * .20;
		
		// Create a variable to house the bill total
		Double bill = 0.0;
		
		// Calculate the total bill
		bill = tip + myDouble;
		
		// Return the final amounts to the user
		System.out.println("The tip owed is: " + tip +"\nThe bill total is: " + bill);
		
		input.close();
		
	}
}
