//Write a program to compute the first n terms of the Fibonacci sequence.
import java.util.Scanner;
public class fibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("This program prints Fibonacci number of nth term. \nEnter the nth value: ");
		int x = input.nextInt();
		
		fibonacci(x);
	
	}
	public static void fibonacci(int x) {
		int[] f = new int[x];
		f[0] = 0;
		f[1] = f[2] = 1;
		for(int i = 3; i < x; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		printArray(f);
	}
	public static void printArray(int[] f) {
		for(int v : f) {
			System.out.print(v + " ");
		}
	}

}
