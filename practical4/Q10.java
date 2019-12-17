/*
 * Write a method that prints characters using the following header:
 * This method prints the characters between ch1 and ch2 with the specified numbers per line. Write a test program that prints ten characters per line from 1 to Z. 
 * Characters are separated by exactly one space.
 */

/**
 * @author EZEJA
 *
 */
public class Q10 {
	public static void main(String[] args) {
		// Print ten characters per line from 1 to z
		char char1 = '1';	// Start of range
		char char2 = 'Z';	// End of range
		charactersPrint(char1, char2, 10); //this is the function to print out our details starting from ch1 to ch2
		System.out.println();
	}
	public static void charactersPrint(char char1, char char2, int numberPerLine) {
		for (char c = char1, count = 1; c <= char2; c++, count++) {
			//NOTE that char stores the ASCII value for each character which in turn is an integer.
			if (count % numberPerLine == 0) { //if the number is up character per line is up to ten, print starts from next line
				System.out.println(c);
			}else {
				System.out.print(c + " "); // print value
			}
		}
	}
}
