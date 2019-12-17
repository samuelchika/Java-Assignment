/**
 * You can approximate π by using the following series:
 * Write a program that displays the π value for i = 10,000, 20,000, ..., to 100,000
 */

/**
 * @author EZEJA
 *
 */
public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double upper, lower1, pi; 
		double rightHand = 0;
		System.out.println("The value of pi for ");
		for(int i = 1; i <= 100000; i++) {
			upper = Math.pow((-1), i + 1); //this is use to iterate the numerator of the formula specified
			lower1 = (2 * i) - 1; //this is for the denominator.
			
			rightHand += (upper / lower1); //we try to sum up the values.
			if(i % 10000 == 0) {
				pi = 4 * rightHand; // for each output, we are to multiply by 4 to get our exact value.
				System.out.printf("%8d is %8.5f\n", i, pi); //with this, we are to output the value of pi.
			}
		}

	}

}
