/*
 *Write a method with the following header to display three numbers in increasing order: 
 *Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order. 
 */

/**
 * @author EZEJA
 *
 */
import java.util.Scanner;
public class Q8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("This program takes 3 numbers and sort the program.");
		System.out.print("Please enter the first number: ");
		num1 = consoleInput.nextInt();
		System.out.print("Please enter the second number: ");
		num2 = consoleInput.nextInt();
		System.out.print("Please enter the third number: ");
		num3 = consoleInput.nextInt();
		
		displaySortedNumbers(num1, num2, num3); //function that sorts the number.
	}
	
	public static void displaySortedNumbers(int num1, int num2, int num3) {
		int temp;
		if(num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp; //we have exchange the value of num1 to num2 if num1 is greater num2.
		}
		
		if(num2 > num3) {
			temp = num3;
			num3 = num2;
			num2 = temp; //we exchange the value of num3 to num2 if its greater than num2.
		}
		
		if(num1 > num2) { //we check again to be sure the num2 is not greater than than num1
			temp = num2;
			num2 = num1;
			num1 = temp; //we have exchange the value of num1 to num2 if num1 is greater num2.
		}
		
		System.out.println("The number are sorted using: " + num1 + " " + num2 + " " + num3);
	}

}
