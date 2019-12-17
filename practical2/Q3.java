/*
      we are to write a program to output

      £ = 4 + (1 + 1/3 + 1/5 + 1/7 + 1/9 + 1/11 + 1/13)
      we assign a variable to store the value of our answer
      we assign another variable to store the right hand side value of the calculation.

      variables needed are answer and rightHandValue.
      both variables are having data type of Double.

    */
public class Q3{
  public static void main(String[] args){
    double rightHandValue = 1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13);
    double pi = 4.0 * rightHandValue;

    //Since rightHandValue is a double: then we have to use 1.0;

    System.out.print("The value of: pi: ");
    System.out.println();
    System.out.println("4 x (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13))");
    System.out.println(" = " +  pi);
  }
}
