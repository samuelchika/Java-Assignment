/*Given a two-dimensional array of integer values write a program to compute the sum
of the values in each row and print the table with the row totals.
 * */
public class Exercise_1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] f = new int[10][10];
		int[] sum = new int[10];
		
		initArray(f);
		sumRows(f, sum);
		printArray(f, sum);
	}

	public static void initArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static void sumRows(int[][] arr, int[] sum) {
		for(int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				rowSum += arr[i][j];
			}
			sum[i] = rowSum;
		}
	}
	
	public static void printArray(int[][] arr, int[] sum) {
		System.out.printf("%-40s%4s\n", "Table Data", "Sum");
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j  < arr[i].length; j++) {
				System.out.printf("%-4d", arr[i][j]);
			}
			System.out.printf("|%-4d\n", sum[i]);
		}
	}
}
