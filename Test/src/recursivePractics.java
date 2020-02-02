import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class recursivePractics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get value for n
		System.out.print("Please enter a value; terminate with -1: ");
		readValues();
	}
	public static void readValues() {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		int x = in.nextInt();
		if(x != -1) {
			//add the number and repeat the process;
			numbers.add(x);
			readValues();
		} 
		reverses(numbers);
	}
	public static void reverses(ArrayList<Integer> arr) {
		Collections.reverse(arr);
		for(Integer v : arr) {
			System.out.print(v + " ");
		}		
	}
}