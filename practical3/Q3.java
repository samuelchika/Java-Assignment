/*
 * Write a program that prompts the user to enter a point (x, y) 
 * and checks whether the point is within the rectangle centered at (0, 0) 
 * with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4) 
 * is outside the rectangle, as shown in Figure 3.9b. (Hint: A point is in the rectangle 
 * if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. 
 * Test your program to cover all cases.) Here are two sample runs.
 */

/**
 * @author EZEJA
 *
 */
/*The program Hint: A point is in the rectangle if 
 * its horizontal distance to (0, 0) is less than or equal to 10 / 2 
 * and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. 
 * 
 *  the horizontal distance is x and the vertical distance is y;
 *  we need 2 double variables x and y
 *  if x <= 10/2 and y <= 5/2
 */
//we need to import the Scanner class to enable us capture input
import java.util.Scanner;
public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in);
		double x, y;
		System.out.print("Enter a point with two cordinates 2 2: ");
		x = consoleInput.nextDouble(); //use to collect the value;
		y = consoleInput.nextDouble(); //use to collect the value;
		
		if((x <= (10/2)) && (y <= (5/2))) { //we use it to check if its in the rectangle.
			System.out.println("Point (" + x + ", " + y  + ") is in the rectangle");
		} else { //else point is not in the rectangle
			System.out.println("Point (" + x + ", " + y  + ") is not in the rectangle");
		}
	}
}
