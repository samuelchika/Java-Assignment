/*
 * Write a program that reads ten integers, stores them in an array and displays them in the reverse of the order in which they were supplied.
 * 
 */

/**
 * @author EZEJA
 *
 */
import java.util.Scanner;
public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integerArray = new int[10]; //Defining the integer array with the length as 10
		System.out.print("Please Enter 10 number: "); //prompt the user to input 10 
		fetchInput(integerArray); //This function helps us to collect input using the for loop defined in it and fill the empty defined array.
		printArrayValuesReversed (integerArray); //This method was defined for printing of numbers.
		
	}
	public static void fetchInput(int[] integerArray) { //This help us input values inside the defined array.
		Scanner consoleInput = new Scanner(System.in); //the Scanner Object or fetching data
		for(int i = 0; i < integerArray.length; i++) { //the or loop for iteration
			integerArray[i] = consoleInput.nextInt(); //for each iteration a value is inputed into the array with the length defined with the array.length method.
		}
	}
	public static void printArrayValuesReversed (int[] integerArray) {
		//This method output the integers in the arrays 
		System.out.print("The Numbers you inputed are: "); //inform user of data inputed 
		System.out.print("\n"); //creates a new line.
		for(int i : integerArray) { //iterates for printing.
			System.out.print(i + " ");
			//This output the Array values when it has not been reversed
		}
		System.out.println("\n");
		System.out.print("The reverse of the Numbers is:  ");
		System.out.println();
		for(int i = (integerArray.length - 1); i >= 0; i--) {
			System.out.print(integerArray[i] + " ");
			//We print the array from the back (i.e. from the last index [9] to the first index [0]
		}
	}

}
