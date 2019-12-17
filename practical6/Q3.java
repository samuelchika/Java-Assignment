/*(Execution time) Write a program that randomly generates an array of 100,000 integers and a key. Estimate the execution time of invoking the linearSearch method in Lecture 06 - Arrays. 
 * Sort the array and estimate the execution time of invoking the binarySearch method in in Lecture 06 - Arrays. 
 * You can use the following code template to obtain the execution time: * 
 */

/**
 * @author crypt
 *
 */
import java.util.Scanner;
import java.util.Random;
public class Q3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consoleInput = new Scanner(System.in);
		long startTime;
		long endTime;
		long executionTime;
		int linearSearchReturned;
		int binarySearchReturned;
		//need a method to generate an array of 100,000 integer
		int[] largeArray = new int[100000];
		startTime  = System.nanoTime();
		largeArray = getRandom(largeArray);
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.println("Start Time: " + startTime + " nanoseconds");
		System.out.println("Array Has been created");
		System.out.println("End Time: " + endTime + " nanoseconds");
		System.out.println("Total Time to create the Array " + executionTime + " nanoseconds\n");
		
		//we also generate a random number (Key) between 0 - 100000
		int key = (int)(Math.random() * 10000);
		//we pass it into the linear search with timer
		startTime  = System.nanoTime(); //This keep watch of the time before the linear search
		linearSearchReturned = linearSearch(largeArray, key); //This performes the linear search and store the index of the search
		endTime = System.nanoTime(); //This stores the time when the program is done.
		executionTime = endTime - startTime; //This give us the time the program took to run in nanoseconds
		System.out.println("Start Time: " + startTime + " nanoseconds");
		if(linearSearchReturned != -1) {
			System.out.println("Our Key " + key + " was found at index: " + linearSearchReturned);
		} else {
			System.out.println("Our Key " + key + " was not found! It returned " + linearSearchReturned);
		}
		
		System.out.println("End Time: " + endTime + " nanoseconds");
		System.out.println("Total Time of Execution for Linear Search: " + executionTime + " nanoseconds\n");
		//we pass it into the Binary search and check the timer.
		startTime  = System.nanoTime(); //Start time before the binary search
		binarySearchReturned = binarySearch(largeArray, key); // Binary Search
		endTime = System.nanoTime(); //End time after the search
		executionTime = endTime - startTime; //Time used for the search
		System.out.println("Start Time: " + startTime + " nanoseconds");
		if(binarySearchReturned != -1) {
			System.out.println("Our Key " + key + " was found at index: " + binarySearchReturned);
		} else {
			System.out.println("Our Key " + key + " was not found! It returned " + binarySearchReturned);
		}
		
		System.out.println("End Time: " + endTime + " nanoseconds");
		System.out.println("Total Time of Execution for Binary Search: " + executionTime + " nanoseconds");
	}
	public static int[] getRandom(int[] passedArray) { //Generates the random number of 100000
		Random randomNumber = new Random(System.currentTimeMillis()); //Using the random class to generate number using the currentTimeMillis.
		for(int i = 0; i < passedArray.length; i++) {
			passedArray[i] = randomNumber.nextInt(100001); //The random number generator section for each index of the array
		}
		return passedArray; //return the number generated.
	}
	
	public static int linearSearch(int[] list, int key) { //Method used for linear search
		for (int i = 0; i < list.length; i++)
		    if (key == list[i])
		      return i;
		  return -1;
	}
	
	public static int binarySearch(int[] list, int key) { //method used from binary search.
		  int low = 0;
		  int high = list.length - 1;
		  while (high >= low) {
		    int mid = (low + high) / 2;
		    if (key < list[mid])
		      high = mid - 1;
		    else if (key == list[mid])
		      return mid;
		    else
		      low = mid + 1;
		  }
		  return -1 - low;
	}
}
