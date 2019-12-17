/*    4. Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is
where
    • h is the day of the week 
(0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
    • q is the day of the month. 
    • m is the month (3: March, 4: April, . . ., 12: December). January and February are counted as months 13 and 14 of the previous year.
    • j is the century (i.e.,). 
    • k is the year of the century (i.e., year % 100).

Note: that the division in the formula performs an integer division. 
Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week. 
Here are some sample runs:
 * 
 * */

import java.util.Scanner; //import the scanner class
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //method of the scanner class to get input from console
		int h; //day of the week;
		int q; //day of the month;
		int m; //month of the year;
		int year;//this get the year
		int j; //century;
		int k; //yearOfCentury;
		
		System.out.print("Enter Year: ");//prompt the user for year.
		year = input.nextInt(); //this help us get the date
		System.out.print("Enter Month: 1 - 12: "); //Prompt user for the  month
		m = input.nextInt();//the user enter the month
		System.out.print("Enter the day of the month: 1 - 31: "); //The user enter the day of the month
		q = input.nextInt();//collect the sat of the month from the console
		//if month is January or February, the year is in the previous
		if(m == 1) { //this check if month is January
			m = 13; //we make month value 13
			year--; // we reduce year value;
		} else if (m == 2) {//this check if month is February
			m = 14; //we make month value 14
			year--; //we reduce year value
		} 
		
		j = year / 100; //we store the value of the century (every 100 years) with this variable j
		k = year % 100; //we store the year of the century
		h = (q + (26 * (m + 1) / 10) + k + (k/4) + (j/4) + (5 *j)) % 7;//calculate the day of the week.
		switch (h) { //this helps in our output and specifying the day of the week it is
			case 0: // 0 is for Saturday
				System.out.println("Day of the Week is Saturday");
				break;
			case 1: //1 is for Sunday
				System.out.println("Day of the Week is Sunday");
				break;
			case 2://2 is for Monday
				System.out.println("Day of the Week is Monday");
				break;
			case 3: //3 is for Tuesday
				System.out.println("Day of the Week is Tuesday");
				break;
			case 4: // 4 is for Wednesday
				System.out.println("Day of the Week is Wednesday");
				break;
			case 5: // 5 is for Thursday
				System.out.println("Day of the Week is Thursday");
				break;
			case 6: // 6 is for Friday
				System.out.println("Day of the Week is Friday");
				break;
		}
		
	}

}
