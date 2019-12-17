/*
 * (Format an integer) Write a method with the following header to format the integer with the specified width.
 * The method returns a string for the number with one or more prefix 0s. 
 * The size of the string is the width. For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. 
 * If the number is longer than the width, the method returns the string representation for the number. For example, format(34, 1) returns 34.
 */

/**
 * @author EZEJA
 *
 */
import java.util.Scanner;
//this helps in importing the scanner object
public class Q1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We are to get from the user the number and the width
		Scanner consoleInput = new Scanner(System.in); //Scanner Object to fetch data from database
		int number, width; //declaration of variables.
		System.out.print("Enter the number to format: "); //prompt user to input the number to be formatted
		number = consoleInput.nextInt(); //activates the collection of number and also store the number inputed into the variable number
		System.out.print("Enter the width: "); // Prompt user to input the width which help determine the number of zeros (0)
		width = consoleInput.nextInt(); //activates the collection of number and also store the number inputed into the variable number
		
		String formattedInput = format(number, width); //method to format the number and return a string output
		System.out.println("Our New formatted Number is: " + formattedInput); //This outputs the number
	}
	
	public static String format (int number, int width) { 
		//this method is used to format the number given with the parameters passed to it
		String newNumber = ""; //this stores our output, me make it an empty string to enable us concatenate values to it.
		String convertedNumber = Integer.toString(number); //this method called here is to convert integers to string
		int length = convertedNumber.length(); //this return the length of the given number after been converted to string. 
		if(width <= length) { //we check if the width is less than the length or more than the length
			return convertedNumber; //if then width is less than the length, we return the number without formating it
		} else { //if the width is more than the length, then we do the following
			int numberOfZeros = width - length;//we determine the number of zeros by subtracting the length from the width.
			for(int i = 1; i <= numberOfZeros; i++) { //this helps print the number of zeros b y concatenating them together.
				newNumber = newNumber + "0";//this concatenate the zero for every value iteration depending on the number of zeros variable
			}
			newNumber = newNumber + convertedNumber; //this statement concatenate the converted number in string to the number of zeros
			return newNumber;//this returns the formatted number
		} //closes the format() method.
		
	}

}
