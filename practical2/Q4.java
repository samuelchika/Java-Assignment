/*Write a program that reads a Celsius degree in double from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:  fahrenheit = (9 / 5) * celsius + 32 

Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. 
 * 
 * */
import java.util.Scanner; //Scanner Class.
public class Q4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); //This is the scanner object.
    //we are to convert celcuis to fahrenheith
    //we declare our variables
    
    double fahrenheith; 
    double celcuis;

    System.out.println("Enter the Celcuis Value: "); //Prompt users to input value for celcuis.
    celcuis = input.nextDouble(); //Scanner input for collecting data.
    fahrenheith = ((9.0 / 5.0) * celcuis) + 32; //This is to calculate the fahrenheith
    System.out.print("fahrenheith Value for "+ celcuis + " celcuis = " + fahrenheith); //printing values

  }
}
