/*
 * Using a for loop, write a program that prints the characters in the ASCII character table from ! to ~. 
 * Display ten characters per line. The ASCII table is shown in the lecture slides. Characters should be separated by exactly one space. 
 */

/**
 * @author EZEJA
 *
 */
public class Q7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1; 
		//This helps us keep track of the number of lines before we go into a new line.
		for(int j = 33; j <= 126; j++) {
			System.out.print("  " + (char) j + " "); //we cast the integer j to a character using the (char) casting method
			if(count % 10 == 0) { //if count is up to ten line, it will be divisible by 10 it start writting into a fresh line.
				System.out.println();
			}
			count++; //counter
		}
		System.out.println();
	}

}
