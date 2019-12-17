/*    3. Using suitable variables, write a Java program called “CalculateCircle.java” capable of writing out to the console the area (πr2) and circumference of a circle (2πr). You should include a final variable for pi (it’s a constant), and a variable for the radius of the circle. The output of the program should look like:

The circle has a radius of 5
Its area is 78.53975
Its circumference is 31.4159
 * */
public class CalculateCircle{
  final static double pi = 3.14159; // pi is a constant value.
  public static void main(String[] args){
	//we declare all required variable
    double area, circumfrence;
    int radius; 
    radius = 5; //we initialized value to our radius as instructed: 5
    area = pi * radius * radius; //we calculate for the area using pi*r^2
    circumfrence = 2 * pi * radius; // we calculate for the Circumference using 2*pi*r

    System.out.println("The Circle has a radius of " + radius); //This line pints out the radius of the circle on the console.
    System.out.println("Its area is " + area); //This prints out the area of the circle on the console.
    System.out.println("Its Circumfrence is " + circumfrence); //This prints out the circumference of the circle on the console.
  }
}
