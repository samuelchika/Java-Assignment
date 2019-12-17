/*Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average and how many scores are below the average. 
 * Enter a negative number to signify the end of the input. Assume that the maximum number of scores is 100.
 * */
/**
 * @author EZEJA
 *
 */
import java.util.Scanner; //importing the scanner class.
public class Q4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[100]; //declares the integer and its length to be hundred, maximum number 0f Scores
		System.out.print("Enter numbers between 1 and 100, \nENSURE TO INPUT A 'NEGATIVE VALUE' AS YOUR LAST INPUT: ");//Prompt user to input numbers and end it with 0;
		fetchData(numbers); // fetchdata method to stock the array with data
	}
	public static void fetchData (int[] numbers) {// this method fetch data and store the data in an array, then pass it to another method for output 
		Scanner consoleInput = new Scanner(System.in); //scanner object
		int inputedData; //this helps store inputed data
		int index  = 0;//this helps us count the number of data inputed to help us create a new array with inputed values to avoid printing default array values (0)
		
		do {
			inputedData = consoleInput.nextInt(); //this statement fetch data and store them in the inputedData variable
			if(inputedData > 100) { //this ensures the maximum inputed score value is not greater than 100;
				System.out.printf("%s%10s%10s\n%-10d", "ERROR!", "ERROR!!", "ERROR!!!",inputedData, "is greater than 100");
				//the above code is used to prompt user of input greater than 100;
				System.out.print("Enter numbers between 1 and 100, \nPlease Start allover!\nENSURE TO INPUT A 'NEGATIVE VALUE' AS YOUR LAST INPUT FOR COMPILING: ");
				index = 0;
				inputedData = consoleInput.nextInt(); //this statement fetch data and store them in the inputedData variable
			} else {
				numbers[index] = inputedData; //stores the inputed data into the array
				index++;
			}
			
		} while (inputedData >= 0);
		int newArrayLength = (index - 1); //this helps us get the length for our new array we are to create from the main array to avoid zeros
		int[] newArray = new int[newArrayLength]; //this creates the new array
		System.arraycopy(numbers, 0, newArray, 0, newArrayLength); //this statement copies data from our main array to the new array from the zero index to the newArray index.
		java.util.Arrays.sort(newArray); // we sort the array to help us get compare the average value easily
		calculateAverage(newArray); //this method is used to calculate the average
	}
	public static void calculateAverage (int[] newArray) { //average method
		double average; //declaring average with dataType double
		double sum = 0; //Use to get the sum of all integer in the array.
		for(int i = 0; i < newArray.length; i++) { //for loop to get us each value in the array.
			sum += newArray[i]; //add each value to the sum variable
		}
		average = sum / newArray.length; //calculating the average value, sum divided by the length of the array.
		System.out.print("You inputed " + newArray.length + " numbers: '");
		
		for(int i : newArray) {
			System.out.print(i + " "); //prints out number inputed
		}
		System.out.print("'\nAverage of all values inputed");
		System.out.printf(" is:= %.2f",average); //format the output to 2 decimal place.
		compareScores(average, newArray); //we pass the array to check for values greater than or lower than the average
	}
	
	public static void compareScores(double average, int[] newArray) { //this method determines how many score is greater than or less than the average
		int count = 0; //count as we compare
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] >= average) { //comparing the variables with the average, if a value is found greater than or equals, we break out
				break;
			} else {
				count++; //else we start counting each score checked
			}
		}
		int rightIndex = newArray.length - count; // we get the size of scores not checked
		System.out.println();
		System.out.print(rightIndex + " scores: { ");
		getScores(rightIndex, newArray, average); //Print the numbers greater than or equal the average score.
		System.out.println("} are greater than or equal to average score: " + average);

		System.out.print(count + " scores: { ");
		getScores((count - 1), newArray, average); //Prints numbers less than the average
		System.out.println("} are less than average score: " + average);	
	}
	
	public static void getScores(int index, 	int[] newArray, double average) {//method for printing scores
		double checkPoint = newArray[index]; //convert the int value to double
		if (checkPoint >= average) { //if the value is equal or greater than average
			if((newArray.length % 2) == 1) { //for odd array length value we have to decrease index by one to print the array because arrays are zero index...
				for (int i = (index - 1); i < newArray.length; i++) {
					System.out.print(newArray[i] + " "); 
				}
			} else { //when 
				for (int i = (index); i < newArray.length; i++) {
					System.out.print(newArray[i] + " ");
				}
			}		
		} else { // prints for even array value
			for (int i = 0; i <= index; i++) {
				System.out.print(newArray[i] + " ");
			}
		}
	}
}