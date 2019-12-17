/*Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. 
 * Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars. 
 * Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. 
 * The latest exchange rate can be found on http://www.xe.com. Here are the sample runs: 
 * 
 * The program should detect when incorrect input is entered at each step and prompt the user to re-enter the required value without requiring the re-running of the program. 
 * An example run is shown below:
 * */
import java.util.Scanner; //import the scanner class
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Scanner method.
		double e;
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		e = input.nextDouble(); //we obtain the exchange value;
		conversion(e); //This is used to call the conversion method to perform the conversion;
		//we pass the conversion rate into the the method;
	}
	public static void conversion(double e) {
		Scanner input = new Scanner(System.in); //Scanner method.help us pick our conversion values and type
		double x, y; // declaring variable
		//x is to get the amount to be converted
		//y is to get converted amount.
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		//prompt user to choose action, either dollar to RMB - 0 or 1 vice versa.
		int option = input.nextInt(); //get the user option either 0 or 1
		
		if(option == 0) { //This performs calculation from Dollar RMB
			System.out.print("Enter the dollar amount: "); //prompt user to input the amount
			x = input.nextDouble(); //use to fetch input from console
			y = e * x; //Performs the calculation
			//we run the dollar to RMB code here
			System.out.print("$" + x + " is " + y + " yuan"); //output our result
		} else if (option == 1) { //This performs calculation from RMB to dollar.
			System.out.print("Enter the RMB amount: "); //prompt users to enter the RMB amount.
			x = input.nextDouble(); //use to fetch value from the console.
			y = e * x; //Performs the calculation
			//we run the RMB to dollar code here.
			System.out.print(x + " yuan" + " is $" + y);  //output our result
		} else {
			//invalid input.
			System.out.print("Incorrect Input,");
			conversion(e);//once there is an invalid input, rerun the program.
		}
	}
}
