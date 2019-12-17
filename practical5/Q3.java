/*
 * Write a program that reads in integers supplied between 1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here is a sample run of the program:
 * Note: that if a number occurs more than one time, the plural word “times” is used in the output.
 */

/**
 * @author EZEJA
 *
 */
import java.util.Scanner; //import the scanner class
public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[100]; //declares the integer and its length
		System.out.print("Enter numbers between 1 and 100, \nENSURE TO INPUT '0' AS YOUR LAST INPUT: "); //Prompt user to input numbers and end it with 0;
		fetchData(numbers); // fetchdata method to stock the array with data
	}
	public static void fetchData (int[] numbers) { // this method fetch data and store the data in an array, then pass it to another method for output 
		Scanner consoleInput = new Scanner(System.in); //scanner object
		int inputedData; //this helps store inputed data
		int index  = 0;//this helps us count the number of data inputed to help us create a new array with inputed values to avoid printing default array values (0)
		
		do { // the do while loop for capturing data before it start checking for zero to end the program
			inputedData = consoleInput.nextInt(); //this statement fetch data and store them in the inputedData variable
			if(inputedData > 100) { //this ensures the maximum inputed data is not greater than 100;
				System.out.printf("%s\n%5s%d%4s\n", "***ERROR! ERROR!! ERROR!!!***", "*",inputedData, "* :- is greater than 100");
				//the above code is used to prompt user of input greater than 100;
				System.out.println("**Enter numbers between 1 and 100,** \n**Please Start allover!**\n**ENSURE TO INPUT ZERO (0) AS YOUR LAST INPUT**");
				index = 0;
				inputedData = consoleInput.nextInt(); //this statement fetch data and store them in the inputedData variable
			} else {
				numbers[index] = inputedData; //stores the inputed data into the array
				index++;
			}
		} while (inputedData != 0);
		int newArrayLength = (index - 1); //this helps us get the length for our new array we are to create from the main array to avoid zeros
		int[] newArray = new int[newArrayLength]; //this creates the new array
		System.arraycopy(numbers, 0, newArray, 0, newArrayLength); //this statement copies data from our main array to the new array from the zero index to the newArray index.
		java.util.Arrays.sort(newArray); //sort out array to get our output in a sorted form
		arrayDuplicatedCheck(newArray); //this is a method to be used to check duplicate value.
	}
	
	public static void arrayDuplicatedCheck(int[] newArray) {//this method check duplicate values
		int count = 1; //this helps us check for duplicate value;
		for (int i = 0; i < newArray.length; i++) { //for loop to check every value for duplicate value
			if(newArray[i] != 0) { //we ensure the value is not zero since we are going to assign zero to every value  we have check
				//the if statement above help us to avoid comparing data compared already, help processor to aqvoid too many work.
				for (int k = (i + 1); k < newArray.length; k++) { //help compare each value of the array.
					if(newArray[i] == newArray[k]) {
						count++; // count then amount of times the value occur to help us print plural for more than 1 occurrences 
						newArray[k] = 0; //set the value of the corresponding value to zero
					}	
				}
				int number = newArray[i]; //we assign the array value to a variable to help us print the value and its occurrence
				counter(count, number); //this method print the number and give the number of occurrences
				count = 1; //reset our counter to 1.
				newArray[i] = 0; //set the number to zero. 
			}
			
		}
	}
	public static void counter(int count, int number) { //this method prints out values with the number of occurrences.
		if(count > 1) { //if count is greater than 1, use plural output : " times."
			System.out.println(number + " occurs " + count + " times." );
		} else {//if count is greater than 1, use singular output : " time."
			System.out.println(number + " occurs " + count + " time.");
		}
	}
}
