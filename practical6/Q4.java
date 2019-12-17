/*(Sort students) Write a program that prompts the user to enter: 
 * the number of students, 
 * the students’ names, 
 * and their percentage grades, 
 * and prints student names in decreasing order of their scores. 
 * 
 * */
import java.util.Scanner;
/**
 * @author crypt
 *
 */
public class Q4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We need an array to store String values
		//We need to get the length of the arrays.
		int arrayLength = getTheArrayLength(0);	
	}
	
	public static int getTheArrayLength(int arrayLength) { //This method gets our array length
		//Using one scanner object for string and integers makes our program unstable, we have to use 2 Scanner objects
		Scanner consoleInput = new Scanner(System.in); //Scanner for data input.
		Scanner input = new Scanner(System.in); //scanner for another input.
		String option = ""; //This is used to obtain yes or no input to ensure the use made the right choice in array length
		System.out.print("How many number of Student do you want to input? "); //Prompt user of amount of input.
		arrayLength = consoleInput.nextInt();
		System.out.println("Use 'Yes' or 'No'.\nAre you sure you want to input " + arrayLength + " Student Details? ");
		option = input.nextLine();
		if(checkYesNo(option)) { //if user confirms he made the right choice of array length. we contine
			//meaning the user wants to continue,
			fetchArray(arrayLength); //we fetch the array passing the arraylength into the fetchArray method.			
		} else {
			//User made mistake in his input and need to do it again
			System.out.print("Be more specific this time!\n");
			getTheArrayLength(arrayLength);
		}
		return arrayLength; 
	}
	
	public static void fetchArray(int arrayLength) {	//Method used to fetch array and manipulate array.	
		String[] studentName = new String[arrayLength];
		double[] scores = new double[arrayLength]; 
		//ensure to change the values to double, and keep them in 2 decimal places.
		//scores must not be greater than 100 and less than 0
		getStudentName(studentName); //This method helps us get the students name
		getScores(scores, studentName); //THis method get the scores of each students accordingly.
		sortArray(studentName, scores); //This sorts the array.
		printSortedArray(scores, studentName); //Printing Sorted Arrays.
	}
	
	public static void getStudentName(String[] studentName) { //Method that gets student
		Scanner consoleInput = new Scanner(System.in); //Scanner for data input.
		System.out.println("Please enter the name for the " + studentName.length + " student."); //Prompt user to input the students name
		for (int i = 0; i < studentName.length; i++) {
			studentName[i] = consoleInput.nextLine(); //Saves student name in the array
		}
	}
	
	public static void getScores(double[] scores, String[] studentName) { //we use this method to get scores 
		//we output each student name so the student score will be inputed.
		Scanner input = new Scanner(System.in); //scanner for another input.
		int x;
		System.out.println("Score must be between 0 - 100!\n\nPlease Press the enter Key after each input to help input the correct value for each student!"); //Prompt the user with instruction
		for (int i = 0; i < scores.length; i++) {
			System.out.print("Enter Score for " + studentName[i] + ": "); // output student name and prompt for scores
			x = input.nextInt(); //get the students grade
			if ((x >= 0) && (x <= 100)) { //Ensure the score is within the required range
				scores[i] = x; //if it is within the range, store it
			} else { // else prompt user of score range and reset the iteration value
				System.out.print("Score must be between 0 - 100!\n"); //Remember user of score range
				i--; // reset  counters
			}
			 
		}
	}
	
	public static void sortArray(String[] studentName, double[] scores) { //Method used to sort array.
		//we start comparing the values in the arrays.
		//int index = 0;
		for (int index = 0; index < scores.length; index++) {
			for (int i = (index + 1); i < scores.length; i++) {
				//we compare and swap values;
				if(scores[index] > scores[i]) { 
					//Sorting of Scores.
					double temp = scores[i];
					scores[i] = scores[index];
					scores[index] = temp;
					//Sorting of the Student Name too, with respect to the Scores.
					String tempString = studentName[i];
					studentName[i] = studentName[index];
					studentName[index] = tempString;
				}
			}
		}	
	}
	
	public static void printSortedArray(double[] scores, String[] studentName) { //Printing of the array.
		System.out.println("\nStudents details after sorting with scores");
		System.out.printf("%-6s%-30s%s\n", "S/No","STUDENTS NAME", "SCORES");
		for(int j = 0, v = 0; j < scores.length; j++, v++) {
			System.out.printf("%-6d%-30s%.2f\n", j,studentName[j], scores[j]);
			
		}
	}
	
	public static boolean checkYesNo(String option) {
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
}
