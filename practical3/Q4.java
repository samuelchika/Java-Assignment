/*Suppose a right triangle is placed in a plane as shown below:
 * The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). 
 * Write a program that prompts the user to enter a point with x- and y-coordinates using JOptionPane and determines whether the point is inside the triangle. 
 * The result should also be displayed using a JOptionPane alert.
 * 
 */

/**
 * @author EZEJA
 *
 */
/* to check if the point is in the triangle (200, 0) and (0,100)
 * we use the formula ((-x * (200 * 100)) / (-y * 200 - x * 100)) to check if it intersect the x axis
 * or ((-y * (200 * 100)) / (-y * 200 - x * 100)) to verify if it intersect on the y axis; 
 */
import javax.swing.JOptionPane; //This import the JOptionPane API to be used for the dialog boxes
public class Q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y, x_intersect, y_intersect; 
		//Variables to hold all variables and intersection variable
		//With the JOptionPane.showInputDialog() we use this to fetch data, which gives the data as a string data type
		//we have to convert the input using the Double.parseDouble() to convert the string into a double data type
		x = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input a value for x")); 
		y = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input a value for y"));
		//the above code is used to get the input and convert it to double data type since the JOptionPane gets data as a string
		
		x_intersect = ((-x * (200 * 100)) / (-y * 200 - x * 100)); //This gets the x intersect if the point is in the triangle
		y_intersect = ((-y * (200 * 100)) / (-y * 200 - x * 100)); //This gets the y intersect if the point is in the triangle.
		
		//with the JOptionPane.showMessageDialog(), we output data with an dialog box with different option such as
		/*
		 * JOptionPane.PLAIN_MESSAGE
		 * JOptionPane.QUESTION_MESSAGE
		 * JOptionPane.ERROR_MESSAGE
		 * JOptionPane.INFORMATION_MESSAGE
		 * JOptioinPane.WARNING_MESSAGE
		 * */
		if((x <= x_intersect) || (y <= y_intersect)) {
			JOptionPane.showMessageDialog(null, "The Point (" + x + ", " + y + ") is in the triangle!", "Result", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "The Point (" + x + ", " + y + ") is not in the triangle!", "Result", JOptionPane.PLAIN_MESSAGE);
		}

	}

}
