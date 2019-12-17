/*Write a program that displays the result of:
 * 9.5 x 4.5 - 2.5 * 3
 * -------------------
 *     45.5 - 3.5    
 * */
public class Q1{
  public static void main(String[] args){
    //we have fractions which comprises of the numerator and the denominator
    //we can break the program into 2 variables using data type Double for both.
    double numerator;
    double denominator;

    /*we assign the numerator values in our assignment to the the variable numerator
          9.5 X 4.5 - 2.5 x 3 (numerator)
          -------------------
              45.5 - 3.5      (denominator)
    */
    numerator = (9.5 * 4.5) - (2.5 * 3); //This is the numerator of the fraction.
    denominator = 45.5 - 3.5; //This is the denominator of the fraction.

    System.out.println("The Value of: ");
    System.out.println("9.5 x 4.5 - 2.5 * 3");
    System.out.println("-------------------");
    System.out.println("    45.5 - 3.5    ");

    System.out.println(" = " + numerator / denominator); //This output the result of our fraction.
  }
}
