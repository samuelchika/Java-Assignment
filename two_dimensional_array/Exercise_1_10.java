//Write a program to add two integer matrices.
import java.util.Scanner;
public class Exercise_1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Rows for Matrix A: ");
		int aRow = input.nextInt();
		System.out.print("Column for Matrix A: ");
		int aCol = input.nextInt();
		System.out.print("Rows for Matrix B: ");
		int bRow = input.nextInt();
		System.out.print("Column for Matrix B: ");
		int bCol = input.nextInt();
		int[][] a = new int[aRow][aCol];
		int[][] b = new int[bRow][bCol];
		
		
		//initialize the first 2 arrays 
		initArray(a);
		initArray(b);
		matrixSummation(a,b);
	}
	public static void initArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static void matrixSummation(int[][] a, int[][] b) {
		
		if(a.length == b.length) {
			//meaning both matrices can be added. rows and columns are equal.
			int[][] c = new int[a.length][a.length];
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.println("Matric A");
			printArrays(a);
			System.out.println();
			System.out.println("Matric B");
			printArrays(b);
			System.out.println();
			System.out.println("Matric C = A + B");
			printArrays(c);
		} else {
			//both matrices are not compatible for addition.
			System.out.print("Matrices not compatible for addition");
		}
		
	}
	public static void printArrays(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
