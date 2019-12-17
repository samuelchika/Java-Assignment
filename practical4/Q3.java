/**
 * Write a program that displays all the leap years, ten per line, in the twenty-first century (from 2001 to 2100), separated by exactly one space.
 */

/**
 * @author EZEJA
 *
 */
public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leap = 4;
		int count = 0;
		for(int i = 2001; i <= 2100; i++) {
			int result;
			if (i % 4 == 0) {
				
				System.out.print(i + "  ");
				count++;
			}
			if(count % 10 == 0) {
				System.out.println();
			}
						
		}
				
	}

}
