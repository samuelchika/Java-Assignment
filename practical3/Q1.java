/*
 * Write a program that prompts the user to enter the month and year and displays the number of days in the month. 
 * For example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days. 
 * If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days.
 */

/**
 * @author EZEJA
 *
 */
/*To write the program, we need to list all the days in the month.
 * We make use of the Nursery Rhyme
 * 30 days has September, April, June and November
 * all the rest has 31 days except February alone,
 * Which has 28 and 29 days every leap year.
 * 
 * 
 * 1 - January has 31 days,
 * 2 - February has 28 - 29 days depending if its a leap year
 * 3 - March has 31 31 days
 * 4 - April has 30 days
 * 5 - May has 31 days
 * 6 - June has 30 days
 * 7 - July has 31 days
 * 8 - August has 31 days
 * 9 - September has 30 days
 * 10 - October has 31 days
 * 11 - November has 30 days
 * 12 - December has 31 days
 * 
 * For leap Year, the month have to be divisible by 4.
 
 */
// we import the scanner class to help us collect data from the console.
import java.util.Scanner;
public class Q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we create the scanner object to help us fetch data using the nextInt() method
		
		Scanner consoleInput = new Scanner(System.in);
		long milliseconds = System.currentTimeMillis(); // get number of milliseconds since Jan 1970

	    long seconds = milliseconds/1000; //converts milliseconds to seconds
	    long minutes = seconds/60; //converts seconds to minutes
	    long hours = minutes/60; //converts minutes to hours
	    long days = hours/24; //convert hours to days
	    long years = days/365; //converts days to years

	    
	    long currentYear = 1970 + years; //This is used to get the current Year.
		//We will be needing 2 integer here for the month and the year
		int monthInteger, year;
		System.out.print("Please input the month in Integer (between 1 - 12 'Not in Decimal'): ");
		//Prompt the users to input a month;
		monthInteger = consoleInput.nextInt();
		System.out.print("Enter the Year: ");
		//Prompt users to enter year
		year = consoleInput.nextInt();
		String month = "";
		
		switch(monthInteger) {
		//We use the switch statement to work through and get the month name from the year.
			case 1:
				month = "January";
				break;
			case 2: 
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6: 
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
		}
		int dayss;
		
		if (monthInteger ==   9 || monthInteger == 4 || monthInteger == 6 || monthInteger ==  11) {
			//As mentioned above, September, April, June and November has 30 days.
			dayss = 30;
		} else if (monthInteger == 2) { //February has 28 or 29 days
			if(year % 4 == 0) { //if the year is a leap year, we will have 29 days, else, we will have 28 days
				dayss = 29;
			} else {
				dayss = 28;
			}
		} else { //Other days has 31 days
			dayss = 31;
		}
		if (year < currentYear) {
			System.out.println(month + " " + year + " had " + dayss + " days."); //if the year is less than the given year, we output it using this
		} else {
			System.out.println(month + " " + year + " has " + dayss + " days."); // if the year is more than or same as the given year, we output it using this,
		}
		
		

	}

}
