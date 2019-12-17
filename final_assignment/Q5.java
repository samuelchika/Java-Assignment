/*    5. Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:

    • 4 for Visa cards 
    • 5 for Mastercards 
    • 37 for American Express cards
    • 6 for Discover cards

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine whether a card number is entered correctly or whether a credit card is scanned correctly by a scanner. Credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):

    (i) Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.


    (ii)      Now add all single-digit numbers from Step (i)

4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

    (iii)      Add all digits in the odd places from right to left in the card number. 

6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
    (iv)      Sum the results from Step (ii) and Step (iii). 

37 + 38 = 75
    (v) If the result from Step (iv) is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.

Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. Design your program to use the following methods:
 * */

import java.util.Scanner;//Scanner Class importation
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 0; //declares and initialize the credit card numbers.
		long number = 	getCardNumber(num); //the method is use to get the number and perform the operations
		
	}
	
	public static long getCardNumber (long number) { //method to get the card number and performs the required check we need to do
		System.out.println("Enter a credit card number as a long integer: ");//Prompt the user to enter the credit card number
		Scanner input = new Scanner(System.in);//Scanner Method
		number = input.nextLong(); //This gets the credit card number;
		int len = getSize(number); //this get the length of the number.
		if(getSize(number) == 13 || getSize(number) == 16) { //if the length of the credit card is 13 or 16, we can continue, else we get the credit card number again
			if(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) {
				//if the prefix matches any of the following number described above, we start manipulation.
				int evenSum = sumOfDoubleEvenPlace(number);//the sum of the even places of the card
				int oddSum = sumOfOddPlace(number); //the sum of the odd places of the card
				long summation = evenSum + oddSum; //total sum of both even and odd places.
				if(isValid(summation)) { //we pass the value of the summation of even and odd together to check if its valid
					System.out.println(number + " is valid"); //if return true,  its valid
				} else { //if it return false
					System.out.println(number + " is invalid"); //it is invalid
				}
			} else {
				System.out.println("This card is cannot be classified as 'Visa', 'Master Cards', 'American Express Cards' or 'Discover Card'");
				//this is when the card prefix number don't match
				getCardNumber(number); //restart the getting card method process again.
			}
			
		} else {
			System.out.println("Credit card number length Mismatch "); // if the number of digit don't match;
			getCardNumber(number); //restart the process
		}
		
		
		return number;
	}
	
	public static int getSize(long d) { //this return the length of the number passed to it
		String card = d + ""; //it convert the credit card number into a string
		int len = card.length(); //this stores the length of the credit card as an int.
		
		return len; //this return the length as an integer.
		
	}
	
	public static boolean isValid(long number) { //check if the card is valid (divisible by 10).
		if ((number % 10) == 0) { //check if it is divisible
			return true; //return true;
		} else { //if not divisible;
			return false; //return false
		}
	}
	
	public static int sumOfDoubleEvenPlace (long number) { //this is used to add up all the even number
		String card = number + ""; //we convert it to string to get each number to manipulate by multiplying by 2
		int sum = 0; //initialize the sum value;
			for(int i = 0; i < card.length() ; i += 2) {//iteration
				sum += getDigit(Integer.parseInt(card.charAt(i) + "") * 2);//we pass each of the numbers after converting it to a method of getDigit and sum it up to sum
			}	
		return sum; //return sum
	}
	
	public static int getDigit(int number) {//this check if the digit passed is less than 10 or greater
		if(number <= 9) { // if number is less than 10, return it
			return number;
		} else {
			return (number % 10) + (number / 10); // if it is up to ten or more ass it up
		}
	}
	
	public static int sumOfOddPlace (long number) { //this method add up all the odd place number
		String card = number + ""; // convert it to string first
		int sum = 0; //initialize the sum variable
			for(int i = 0; i < card.length() ; i++) { //iteration to get all the odd number and add them together
				if((i % 2) != 0 ) { //get the odd place integers
					sum += Integer.parseInt(card.charAt(i) + "");
				}
			}
		return sum; // return sum
	}
	
	public static boolean prefixMatched (long number, int d) {//this check the prefix of the card number with the given integer d
		boolean match = getPrefix(number, getSize(d)) == d;  //we pass it to a method to get the prefix and compare
		return match; //return true or false after comparison.
	}

	public static long getPrefix (long number, int k) { //this get the prefix of the number with regards to the length gotten with the getSize method
		if (getSize(number) > k)  { //if the length of the number is greater than the length of the prefix.
			String num = number + ""; //we convert it to string and use the substring method to get the new number and parse it to long value
			return  Long.parseLong(num.substring(0, k)); //return the long.
		}
		return number; // if not return number
	}
}
