/*Write a program that prompts the user to enter the year and first day of the year, 
 * and displays the first day of each month in the year on the console. For example, 
 * if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, your program should display the following output: 
 *  January 1, 2013 is Tuesday
         ...
December 1, 2013 is Sunday
 * 
 * */
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in);
		int year, startDay;
		System.out.print("Enter the Year: ");
		year = consoleInput.nextInt();
		System.out.print("Start Day \n(0 = Sunday - 6 = Saturday): ");
		startDay = consoleInput.nextInt();
		int count = 0;
		String monthInWords = "";
		int numberOfDaysOfTheMonth;
		System.out.println();
		//we need to iterate for 12 months.
		//we use a switch statement to iterate it.
		String dayofTheWeek = "";
		for (int month = 1; month <= 12; month++) {
			//we use to output each month and for each month, we are to visit a function to get the days of the month 
			//after the month, we need another function to get the next start day.	
			//First we need to get the month in words so we pass the value of month to a function.
			monthInWords = getMonthName(month);
			numberOfDaysOfTheMonth = getDaysOfTheMonth(month, year);
			//We get the number of days of the month.
			for(int i = 0; i < startDay; i++) { //This loop helps us print the spaces before the start of the day. 
				count++; //we count each space to help us move the cursor to the next line.
			}
			for(int j = 1; j <= numberOfDaysOfTheMonth; j++) {// we print each day of the month as gotten from the function.
				count++; //monitor the lines print to help us move the cursor to the next line.
			}	
			dayofTheWeek = getDayOfTheWeek(startDay);
			System.out.println(monthInWords + " 1, " + year + " is " + dayofTheWeek);
			System.out.println(); //we print a new line
			startDay = getStartDay(count); //This function helps us get the next start line 
			count = 0; //we reset the counter.
		} //end of the for loop that iterates all the date.	
	} //end of the main 
	public static String getMonthName(int month) {
		String monthName = "";
			switch(month) {
				case 1:
					monthName = "January";
					break;
				case 2:
					monthName = "February";
					break;
				case 3:
					monthName = "March";
					break;
				case 4: 
					monthName = "April";
					break;
				case 5:
					monthName = "May";
					break;
				case 6:
					monthName = "June";
					break;
				case 7:
					monthName = "July";
					break;
				case 8:
					monthName = "August";
					break;
				case 9:
					monthName = "September";
					break;
				case 10:
					monthName = "October";
					break;
				case 11:
					monthName = "November";
					break;
				case 12:
					monthName = "December";
					break;
			}
		return monthName;
	}
	public static int getDaysOfTheMonth(int month, int years) {
		int days = 0;
		/*
		 * Thirty days has September, April June and November.
		 * All the rest has 31 days except February alone.
		 * Which has 28 days or 29 days every leap year.
		 * */
			switch(month) {
				case 1:
					days = 31;
					break;
				case 2:
					if(years % 400 == 0 || (years % 4 == 0 && years % 100 != 0)) {
						days = 29;
					} else {
						days = 28;
					}
					break;
				case 3:
					days = 31;
					break;
				case 4:
					days = 30;
					break;
				case 5:
					days = 31;
					break;
				case 6:
					days = 30;
					break;
				case 7:
					days = 31;
					break;
				case 8:
					days = 31;
					break;
				case 9: 
					days = 30;
					break;
				case 10:
					days = 31;
					break;
				case 11:
					days = 30;
					break;
				case 12: 
					days = 31;
					break;
			}
		return days;
	}
	public static int getStartDay(int count) {
		int start =(count % 7); //since we are running from 0 - 6, not from 1 - 7
		return start;
	}
	public static String getDayOfTheWeek(int startDay) { //this iterates for the days of the week.
		String dayWeek = "";
		switch(startDay) {
			case 0:
				dayWeek = "Sunday";
				break;
			case 1:
				dayWeek = "Monday";
				break;
			case 2:
				dayWeek = "Tuesday";
				break;
			case 3:
				dayWeek = "Wednesday";
				break;
			case 4:
				dayWeek = "Thursday";
				break;
			case 5:
				dayWeek = "Friday";
				break;
			case 6:
				dayWeek = "Saturday";
				break;
		}
		return dayWeek;
	}
}
