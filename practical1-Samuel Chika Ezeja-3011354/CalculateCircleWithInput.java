/*    4. Build upon your answer to Q3 (saved in a file called “CalculateCircleUserInput.java”) to ask the user to supply the value for the circle. The output should look like (user’s input in Red):

Please input the circle’s radius: 5
You have defined the circle's radius as 5.0
Its area is 78.53975
Its circumference is 31.4159

Note: In order to use the “Scanner” class described in the lecture you will first have to import it using the following line as the first line in your program (line 1; insert the line before “public class CalculateCircleUserInput”:

import java.util.Scanner;
*/
import java.util.Scanner; //import the scanner class for inputs.
public class CalculateCircleWithInput{
  final static double pi = 3.14159; // pi is a constant value.
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double area, circumfrence, radius; //we declare all required variable
    System.out.println("Please input the circle's radius: ");
    radius = input.nextDouble(); //we assign value to our radius as instructed: 5
    area = pi * radius * radius; //we calculate for the area using pi*r^2
    circumfrence = 2 * pi * radius; // we calculate for the Circumference using 2*pi*r

    System.out.println("You have defined the circle's radius as " + radius); //This line pints out the radius of the circle on the console.
    System.out.println("Its area is " + area);//This prints out the area of the circle on the console.
    System.out.println("Its Circumfrence is " + circumfrence);//This prints out the circumference of the circle on the console.
  }
}
