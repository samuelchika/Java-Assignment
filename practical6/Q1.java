/*(Random number chooser) Write a method that returns a random number between 1 and 54, 
 * excluding the numbers passed in the argument. The method header is specified as follows:
 * 
 */

/**
 * @author crypt
 *
 */
import java.util.Scanner;
public class Q1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in);
		Scanner consoleInput2 = new Scanner(System.in);
		int arrayLength;
		System.out.print("This Program generates a 'Random Number' between 1 and 54\nYou can exclude some numbers if you don't want them to be part of the possible Guess\n");
		System.out.println("How many number between 1 and 54 are you willing to remove before we Output the Random Number: ");
		arrayLength = consoleInput.nextInt();
		if(arrayLength == 0) {
			//then the user don't want to continue with the program.
			System.out.print("Thanks for your attention!\nExiting Program...");
		} else {
			//int[] numbers = new int[arrayLength];
			String option = "";
			if(arrayLength >= 1 && arrayLength < 55) {
					System.out.print("You want to exclude " + arrayLength + " numbers?\nInput 'Yes' if you want to Continue\nInput 'No' if you want to change the size of numbers you want to input: ");
					option = consoleInput2.nextLine();
					if(checkYesNo(option)) {
						System.out.println();
						fetchArray(arrayLength);
					} else {
						arrayLength = getTheArrayLength(arrayLength);
						checkArrayLengthSize(arrayLength);
						System.out.println();
						checkYesNo(option);
					}
				
			} else {
				//The number is greater than or less than the required input.
				arrayLength = getTheArrayLength(arrayLength);
				System.out.println();
				checkArrayLengthSize(arrayLength);
			}
		}
	}
	
	public static void checkArrayLengthSize(int arrayLength) { //This checks the length of the array, ensures its not more than the required values
		if(arrayLength >= 1 && arrayLength < 55) { //ensure the array length is within the required range of numbers
			Scanner input = new Scanner(System.in);
			String option = "";
			System.out.print("You want to exclude " + arrayLength + " numbers?\nInput 'Yes' if you want to Continue\nInput 'No' if you want to change the size of numbers you want to input: ");
			option = input.nextLine();
			if(checkYesNo(option)) { //we ensure the user did not input the arraylength by mistake.
				System.out.print("Input the " + arrayLength + " numbers: ");
				System.out.println();
				fetchArray(arrayLength); //use it to fetch the numbers we want to input into the array with regards to the length
			} else { //if it was a mistake, we start all over again.
				arrayLength = getTheArrayLength(arrayLength); //we  get the array Length
				System.out.println();
				checkArrayLengthSize(arrayLength); //we check if the arraylength is valid
			}
		} else {
			
			arrayLength = getTheArrayLength(arrayLength); //we  get the array Length
			System.out.println();
			checkArrayLengthSize(arrayLength); //we check if the arraylength is valid

			
		}
	}
	
	public static void fetchArray(int arrayLength) { //This method fetches the data for the array.
		Scanner getInputs = new Scanner(System.in); //Scanner for fetching data from the console
		int[] numbers = new int[arrayLength]; //our new array defined with the length inputed by the user which was passed into the method
		int randomNumber;
		System.out.print("Input Numbers to Exclude: ");
		for(int i = 0; i < numbers.length; i++) { //helps us fetch data using the iteration.
			numbers[i] = getInputs.nextInt();
		}
		//we have to check if the number in the array length and the length of the array matched
		//but its not necessary since is a console program and will not terminate unless the number is inputs is complete.
		randomNumber = getRandom(numbers); //We store the random number inside the variable.
		System.out.print("Our Generated Random Number is: " + randomNumber); //Print the random number.
	}
	
	public static int getRandom(int... numbers) { // This method excludes the passed in integers and generate our random number
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random() * 54) + 1;
		while(randomNumber < 1 || randomNumber > 54) { //ensuring random number stays in range 1 - 54
			randomNumber = (int)(Math.random() * 54) + 1;
		}
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == randomNumber) {
				randomNumber = (int)(Math.random() * 54) + 1;
				while(randomNumber < 1 || randomNumber > 54) {
					randomNumber = (int)(Math.random() * 54) + 1;
				}
				i = -1;
			}
		}		
		return randomNumber;
	}
	
	public static boolean checkYesNo(String option) { //We ensure the user array length is not a mistake.
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
	
	public static int getTheArrayLength(int arrayLength) { //This method gets us the array Length.
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("PS: You are to input Number between 1 and 54!\nHow many number between 1 and 54 are you willing to remove before we Output the Random Number: ");
		arrayLength = consoleInput.nextInt();
		return arrayLength;
	}
}
