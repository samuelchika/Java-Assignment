/*
 * Use a while loop to find the largest integer n such that n3 is less than 12,000. 
 */

/**
 * @author EZEJA
 *
 */
public class Q6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 1; //initialized the n value;
		while(Math.pow(n, 3) < 12000) { //when the value of cuberoot of n is less than 12000
			
			n++;
			
		}
		if(Math.pow(n, 3) > 12000) {
			n--;
		}
		System.out.printf("%s%.0f","The largest integer n such that n to the power of 3 is less than 12,000 is: ",n);
		//System.out.print(n);
		//our value gives us a number greater than the expected value, therefore we have to subtract 1 out of it for the main value.

	}

}
