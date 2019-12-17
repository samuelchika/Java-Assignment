/*(Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:
 * 
 */

/**
 * @author crypt
 *
 */
import java.util.Scanner;
public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in); //Scanner Class for input
		int arrayLength = 0; //array length initialiser
		String option = ""; //string for yes or no erification of array length
		boolean optionCheck = false; //check verification of array length value
		do {
			arrayLength = getTheArrayLength(arrayLength);
			System.out.print("\nUse 'Yes' or 'No' \nYou want to input " + arrayLength + " numbers? ");
			option = consoleInput.nextLine(); //Get Yes or No
			optionCheck = checkYesNo(option);
		} while(optionCheck == false);
		
		if(checkYesNo(option)) { //if Yes then proceed
			System.out.println();
			int[] list = new int[arrayLength];
			int[] distinctArray = eliminateDuplicates(list); //the array that stores the returned array of distinct values after eliminating duplicates
			printArrays(distinctArray); //invoking method to print array
		}
	}
	
	public static void printArrays(int[] distinctArray) { //method that print array
		java.util.Arrays.sort(distinctArray); //Sort the array before printing
		System.out.print("Distinct values for inputed are: ");
		for (int i : distinctArray) {
			System.out.print(i + " ");
		}
	}
	
	public static boolean checkYesNo(String option) { //method to verify use inputed the right array length.
		boolean successRate = false;
		Scanner input = new Scanner(System.in);
		switch (option) {
			case ("No"):
			case ("N"):
			case ("no"):
			case ("n"):
			case ("NO"):
				break;
			case ("Yes"):
			case ("Y"):
			case ("yes"):
			case ("y"):
			case ("YES"):
				successRate = true;
				break;
			default: 
				System.out.print("Invalid Input!!! You are to input 'Yes' or 'No'\n");
			
		}
		return successRate;
	}
	
	public static int[] eliminateDuplicates(int[] list) { //method  to elimated duplicate values as input are passed in the console
		/*What we did here is that when any input is passed into the console, it compares it with the numbers in the array
		 * If there is a match is discard it, if not it stores the value in the array.
		 * we keep index of the amount of the numbers we inputed.
		 * the amount of value inputed is used as the length of the array to hold distinct value. 
		 * We make a copy from the array to the new array with the new array length.
		 * we return the new array. 
		*/
		Scanner consoleInput = new Scanner(System.in); //Scanner Object
		//This is used to get input from the keyboard....
		System.out.print("Input Numbers: ");
		int x = consoleInput.nextInt(); // store input into x variable.
		list[0] = x; // we store our first value before comparing.
		int count = 0; //used to monitor if the data is values are not same.
		int inputed = 1; //This help us input values inside our array; with the right index after comparing
		for(int i = 1; i < list.length; i++) { //this helps us get 10 values
			x = consoleInput.nextInt(); //obtain inputs.
			for (int v = 0; v <= i; v++) {//this helps in bringing in each value less than the array index to be inputed for comparison
				if(list[v] == x) {//comparing data inputed with data in the array
					count++; // monitor if there was a match
				} 	
			}
			if(count == 0) { //if there is no match, then store value into the array.
				list[inputed] = x;
				inputed++; //this update the index or next input
			} else {
				count = 0; //reset counter
			}
			
			//for each iteration a value is inputed into the array with the length defined with the array.length method.
		}
		int[] distinctArray = new int[inputed];
		System.arraycopy(list, 0, distinctArray, 0, inputed);
		return distinctArray; // return the amount of data inputed out of the 10 inputs to help us avoid printing zero unwanted values.
		
	}
	
	public static int getTheArrayLength(int arrayLength) {
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("How many number do you want to input? ");
		arrayLength = consoleInput.nextInt();
		return arrayLength;
	}
}
