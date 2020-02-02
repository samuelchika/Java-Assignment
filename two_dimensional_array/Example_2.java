import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Size of the table: ");
		int len = input.nextInt();
		int f[][] = new int[len][len];
		int sum[] = new int[len];
		
		initArray(f);
		getColSum(f, sum);
		printArrays(f, sum);

	}
	public static void initArray(int[][] arr) {
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
	}
}
