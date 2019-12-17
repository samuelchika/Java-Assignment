/*
 * Write methods with the following headers:
 * Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */

/**
 * @author EZEJA
 *
 */
import java.util.Scanner;
public class Q7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in);
		int number;
		System.out.print("Please Enter Number to check if it a Palindrome: ");
		number = consoleInput.nextInt();
		
		int reversedNumber = reverse(number); //Get the users input for the Palindrome value.
		boolean b = isPalindrome(reversedNumber, number);
		//The above is a boolean variable which is use to check if the reversed number and the input number.
		System.out.println("The Value you inputed is: " + number);
		System.out.println("The reverse value is: " + reversedNumber);
		if(b == true) {
			System.out.print("\nThe Number is Palindrome");
		} else {
			System.out.print("\nThe Number is not Palindrome");
		}
	}
	
	public static int reverse(int number) {
		//This function reverse the users integer and concat it using a string, 
		String reversed = ""; //this string is used to get all the numbers.
		int reversedNumber;
		while (number > 0) {//this iterates and keep checking for our number to ensure it is not equal zero, 
			// the while loop also helps us to ensure the values from the module of 10 are gotten 
			// when the number is zero form line 44 (the next 4 line below this line), the programs terminates
			int changeNumberValue;
			changeNumberValue = number % 10;
			reversed = reversed + changeNumberValue;
			number = number / 10;
		}
		reversedNumber = Integer.parseInt(reversed);
		return reversedNumber;
	}
	//This function is use to check if a number is a palindrome.	
	public static boolean isPalindrome(int reversedNumber, int number) {
		boolean boolValue; //This tells if its true or false. (True if both number are same and false if they are not)
		if(number == reversedNumber) { //the if statement helps us to check
			boolValue = true;
		} else {
			boolValue = false;
		}
		return boolValue;
	}

}
