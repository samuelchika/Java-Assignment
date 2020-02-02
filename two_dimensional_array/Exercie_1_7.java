//Write a function similar to linearSearch that searches a table for the occurrence of
//some given value x . Write a program to test it
import java.util.Scanner;
public class Exercie_1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input Value to search for: ");
		int x = input.nextInt();
		int f[][] = new int[10][10];
		
		intiArray(f);
		printArray(f);
		linearSearh(f, x);

	}
	public static void intiArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static void printArray(int[][] arr) {
for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void linearSearh(int[][] arr, int x) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == x) {
					int r = i;
					int c = j;
					System.out.print("f["+ i + "][" + j + "]: Row " + (r + 1) + " Column " + (j + 1) + " = " + arr[i][j] + " ;");
					count++;
					System.out.println();
			}	
		} 
			
	}
		if(count != 0) {
			System.out.println(x + " occured " + count + " times in the table.");
		} else {
			System.out.println(x + " was not found in the table.");
		}
	}
}
