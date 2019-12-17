/**
 * Write a program that simulates flipping a coin one million times and displays the number of heads and tails.
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
		int flip = 2;
		int head = 0; //initialize the head variable
		int tail = 0; //initialize the tail variable
		int i = 0;
		int flips = 0;
		
		while(i < 1000000) { //performing the operation 1000000 times;
			
			flips = flipses() % flip; //divide the returned value from the method value by 2 which gives only values of 1 and 0
		if(flips == 0) { //if the remainder is 0 the it is head.
				head++;
			} else { //else its 1 and it is tail
				tail++;
			}
			 i++;
		}
		System.out.println("Number of Head: " + head); //print number of head flips
		System.out.println("Number of Tail " + tail); //print number of tail flips
	}
	public static int flipses() { //flip method
		int coin = (int)(Math.random() * 10); //generate a number between 0 - 9; 
		return coin; //return the value to the function.
	}

}
