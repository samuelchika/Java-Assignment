//Given a two-dimensional array of integer values write a program to compute the sum
//of the values in each row and each column and print the table with both the row and
//column totals.
public class Exercise_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] f = new int[10][10];
		int[] sumColumn = new int[10];
		int[] sumRow = new int[10];
		
		initArray(f);
		sumRows(f, sumRow);
		getColSum(f, sumColumn);
		printArrays(f, sumColumn, sumRow);
	}

	public static void initArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static int sumArray(int[][] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				sum += arr[i][j];
			}
		}
		return sum;
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
	public static void getColSum(int[][] arr, int[] sum) {
		for(int i = 0; i < arr[0].length; i++) {
			sum[i] = 0;
			for(int j = 0; j < arr.length; j++) {
				sum[i] += arr[j][i];
			}
		}
	}
	
	public static void printArrays(int[][] arr, int[] sumColumn, int[] sumRows) {
		System.out.printf("%-40s%4s\n", "Table Data", "Sum");
		for(int i = 0; i < arr.length; i++) {			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-4d", arr[i][j]);
			}
			System.out.printf("|%-4d\n", sumRows[i]);
		}
		for(int i = 0; i < (sumColumn.length * 4) + 5; i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < sumColumn.length; i++) {
			System.out.printf("%-4d", sumColumn[i]);
		}
		System.out.println("|" + sumArray(arr));
		for(int i = 0; i < (sumColumn.length * 4) + 5; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

}
