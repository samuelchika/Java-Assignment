/* Using a for loop, write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cSam
 */
import java.util.Scanner; //Scanner class to get inputs
public class Q8{
	
	public static void main(String[] args){
		Scanner consoleInput = new Scanner(System.in);

		int pyramidLine; //This is us to get the pyramid line; 
          System.out.println("Enter the number of lines: ");
		pyramidLine = consoleInput.nextInt();
          while(pyramidLine < 1 || pyramidLine >15){
            //This is use to ensure the input lies between 1 and 15
            System.out.println("Please Select a Number between 1 - 15");
            pyramidLine = consoleInput.nextInt();
          }

		for (int l = 1; l <= pyramidLine; l++){
			int preventFormatError = pyramidLine + 1; //This is to ensure we don't have any format error: %0s
			System.out.printf("%"+ 3 * (preventFormatError - l) + "s", " ");
               //This define the spaces to keep the pyramid lines in shape
			for (int m = l; m >= 1; m--){
				System.out.printf("%3d",m);
				if(m == 1){
					for (int n = 2; n <= l; n++){
				System.out.printf("%3d",n);
					}
				}
			}
			System.out.println();
			
		}
	}
}