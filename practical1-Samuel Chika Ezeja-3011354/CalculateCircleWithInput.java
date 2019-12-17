import java.util.Scanner;
public class CalculateCircleWithInput{
  final static double pi = 3.14159; // pi is a constant value.
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double area, circumfrence, radius; //we declear all requiered variable
    System.out.println("Please input the circle's radius: ");
    radius = input.nextDouble(); //we assign value to our radius as instructed: 5
    area = pi * radius * radius; //we calculate for the area using pi*r^2
    circumfrence = 2 * pi * radius; // we calculate for the Circumfrence using 2*pi*r

    System.out.println("You have defined the circle's radius as " + radius); //This line pints out the radius of the circle on the console.
    System.out.println("Its area is " + area);//This prints out the area of the circle on the console.
    System.out.println("Its Circumfrence is " + circumfrence);//This prints out the circumfrence of the circle on the console.
  }
}
