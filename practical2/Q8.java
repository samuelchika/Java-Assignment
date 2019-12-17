/*Write a program that displays the current time and date, calculated from the System.CurrentTimeMillis() method. 
 * 
 * */
import java.util.Date; //This is to import the date Class.
public class Q8{

	public static void main(String[] args) {
		//we declare the variable to hold the time
		long date = System.currentTimeMillis(); // this is use to capture the value for the time
		Date dates = new Date(date); // we use the date function to transform the captured value into a date.
		System.out.print(dates); //This is use to print out the date.

	}

}