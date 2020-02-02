//print all the even element of the 2 dimensional array.

public class Exercise_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f[][] = new int[10][12];
		int[] sum = new int[12];
		
		intiArray(f);
		getColSum(f, sum);
		printArrays(f, sum);
		sumArray(f, sum);

	}
	public static void intiArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 10);
			}
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
	public static void printArrays(int[][] arr, int[] sum) {
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-4d", arr[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < (sum.length * 4); i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < sum.length; i++) {
			System.out.printf("%-4d", sum[i]);
		}
		System.out.println();
		for(int i = 0; i < (sum.length * 4); i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	public static void sumArray(int[][] arr, int[] sums) {
		int sum = 0;
		System.out.println("The Sum of all elements are: ");
		for(int i = 0; i < sums.length; i++) {
			if(i == (sums.length - 1)) {
				System.out.print(sums[i]);
			} else {
				System.out.print(sums[i] + " + ");
			}
		}
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				sum += arr[i][j];
			}
		}
		System.out.print(" = " + sum);
	}
}
