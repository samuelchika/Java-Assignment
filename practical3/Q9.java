/*
 * Use nested loops that display the following patterns one after another (each pattern will require entirely separate nested loops):
 */

/**
 * @author EZEJA
 *
 */
/*
 * The basic function we use in this program is the printf() statement.
 * we use it for spacing and formating the outputs with the spaces.
 * */
public class Q9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern A");
		for(int i = 1; i <= 6; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern B");
		for(int i = 6; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern C");
		int counts = 6;
		for(int i = 1; i <= 6; i++) {
			System.out.printf("%"+counts * 2+"s","");
			for (int k = i; k >= 1; k--) {
				System.out.printf("%2d",k);;
			}
			System.out.println();;
			counts--;
		}
		System.out.println();
		System.out.println("Pattern D");
		int count = 1;
		for(int i = 6; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.printf("%-2d", k);
			}
			System.out.printf("\n%"+2 * count +"s","");
			count++;
		}
	
	}

}
