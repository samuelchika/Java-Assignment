/*Write a program that reads in ten numbers and displays distinct numbers (i.e., if a number appears multiple times, it is displayed only once). (Hint: Read a number and store it to an array if it is new. 
 * If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers. Here is the sample run of the program:
 * 
 * */
/**
 * @author EZEJA
 *
 */
import java.util.Scanner;
public class Q5 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] distinctNumber = new int[10];//This defines the array variable and the length (10).
		int arraylength; // this helps us print the array to avoid printing unwanted zeros 
		System.out.print("Please Enter 10 integer to display distinct number: "); // prompt the user to input 10 integers
		arraylength = fetchNumber(distinctNumber);  //stores data inside the array and return the amount of distinct value to help us print non zeros value from array index without data.
		printDistinctNumber(distinctNumber,arraylength); //this helps us to print the array with the max index as 'arraylength'
			//This print the value of the array that are not -100;
	}
	
	public static int fetchNumber(int[] distinctNumber) {  //this helps get data by comparing the values before inputting them into the array
		Scanner consoleInput = new Scanner(System.in); //Scanner Object
		//This is used to get input from the keyboard....
		int x = consoleInput.nextInt(); // store input into x variable.
		distinctNumber[0] = x; // we store our first value before comparing.
		int count = 0; //used to monitor if the data is values are not same.
		int inputed = 1; //This help us input values inside our array; with the right index after comparing
		for(int i = 1; i < distinctNumber.length; i++) { //this helps us get 10 values
			x = consoleInput.nextInt(); //obtain inputs.
			for (int v = 0; v <= i; v++) {//this helps in bringing in each value less than the array index to be inputed for comparison
				if(distinctNumber[v] == x) {//comparing data inputed with data in the array
					count++; // monitor if there was a match
				} 	
			}
			if(count == 0) { //if there is no match, then store value into the array.
				distinctNumber[inputed] = x;
				inputed++; //this update the index or next input
			} else {
				count = 0; //reset counter
			}
			
			//for each iteration a value is inputed into the array with the length defined with the array.length method.
		}
		return inputed; // return the amount of data inputed out of the 10 inputs to help us avoid printing zero unwanted values.
	}
	
	public static void printDistinctNumber(int[] distinctNumber, int arraylength) {//this helps us print our input values.
		System.out.println("The distinct numbers are: ");
		for (int i = 0; i < arraylength; i++) { //iteration for printing
				System.out.print(distinctNumber[i] + " "); //printing the values.
		}
	}
	
}

