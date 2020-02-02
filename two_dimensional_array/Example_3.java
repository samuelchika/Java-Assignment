//Initialize the leading diagonal to 1 others 0;
/*Write a procedure that initializes the diagonal elements of a square matrix to 1; all
other elements to 0. Write a program to test it.*/
import java.util.Scanner;
public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Size of the table: ");
		int len = input.nextInt();
		int f[][] = new int[len][len];
		initArray(f);
		printArray(f);		
	}
	public static void initArray(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				if(j == i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		
	}
	
	public static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

