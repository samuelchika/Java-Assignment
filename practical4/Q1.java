/*
 * Write a program that lets the user enter the loan amount and loan period in number of years 
 * and displays the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8%. 
 * Here is a sample run:
 */

/**
 * @author EZEJA
 *
 */
import java.util.Scanner; //import the scanner class for input
public class Q1 {
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in); //create the scanner method
	
		System.out.print("Enter Loan Amount: ");// Prompt the user to enter the loan amount and
		double loanAmount = consoleInput.nextDouble();
		System.out.print("Enter the Number of Years: "); // Prompt user to enter loan period in number of years
		int numberOfYears = consoleInput.nextInt();

		System.out.println("Interest Rate    Monthly Payment    Total Payment");	
		// Display table with interest rates
		for (double i = 5.0; i <= 8; i += 0.125) { 
			double monthlyInterestRate = i / 1200;
			double x = loanAmount * monthlyInterestRate;
			double y = Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
			
			System.out.printf("%-5.3f%12s", i, " "); //The output of each interest rate
			
			double monthlyPayment = x / (1 - (1 / y)); 
			System.out.printf("%-19.2f", monthlyPayment); //Outputs monthly payment
			System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numberOfYears); //output the total payment
		}
	}
}
