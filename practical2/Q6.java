/* 
 * 	Write a program that prompts the user to enter the minutes (e.g., 1 billion) and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
	Writing the program to convert the finites into years and year,
	we need to apply some elementary mathematics knowledge.

	we know for finites to be converted to days and years, we follow the following process
	Finites - hours - days - years.

	60 min - 1 hour.
	24 hours - 1 day.
	365 days - 1 year.

	This values above remains constant values to help us achieve our aim.
*/
import java.util.Scanner; //This is used to import our Scanner for inputting value into the console
public class Q6{
	final static int min = 60; //This stores our constant value for minutes.
	final static int hour = 24; //This stores our constant value for hours.
	final static int year = 365; //This stores our constant value for years

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in); //This is the scanner Object that help us with the collection of input from the user

		//Variable Declaration.
		long minutes;
		int remDays, yearss;
		double hours, days, years;
		

		//We display the essence of our program to the user on the console.
		System.out.println("This program converts Minites to the number of Years and days of that minites.");
		System.out.println(); // We give a line difference to help the user focus.
		System.out.print("Please the amount of Minites (eg 1000000000): "); //prompt user to input the minutes
		minutes = inp.nextLong(); //This collect the value from user into the console.

		hours = minutes / min; //This fetches the amount of hours in the minutes
		days = hours / hour; // This line fetches the amount of days in the hours
		years = days /year; //This fetches the amount of years in the days
		remDays = (int)days % year; //This fetches the remaining days after calculating the years.
		
		yearss = (int)years;
		/*
			we want to base our output with the years value to monitor if its years or year
			and also monitor our remaining days if it will be days or days
		 */
		// System.out.println();
		// System.out.println("Minites: " + minutes);
		// System.out.println("Hours: " + hours);
		// System.out.println("Days: " + days);
		// System.out.println("Years: " + yearss);
		// System.out.println("Remaining Days: " + remDays);
		
		System.out.println();
		if(years == 0){
			//we tell he uses no year and check also for remaining days
			switch(remDays){
				case 0:
					System.out.println("Invalid Input, the minites you inputed is not up to a day!");
					break;
				case 1:
					System.out.println(minutes + " minites is equivalent to " + remDays + " day.");
					break;
				default:
					System.out.println(minutes + " minites is equivalent to " + remDays + " days.");
					break;
			}

		} else if (years == 1){
			//we have only one year, not years. we output to the users we only have one year
			System.out.print(minutes + " is equivalent to " + yearss + " year");
			switch(remDays){
				case 0:
					System.out.println(".");
					break;
				case 1:
					System.out.println(", " + remDays + " day.");
					break;
				default:
					System.out.println(", " + remDays + " days.");
					break;
			}
		} else  {
			//years is greater than 1 and we can actually use days not day.
			System.out.print(minutes + " is equivalent to " + yearss + " years");
			switch(remDays){
				case 0:
					System.out.println(".");
					break;
				case 1:
					System.out.println(", " + remDays + " day.");
					break;
				default:
					System.out.println(", " + remDays + " days.");
					break;
			}
		}
	
	}
}