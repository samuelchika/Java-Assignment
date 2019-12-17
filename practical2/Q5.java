/*Write a program that reads an integer between 0 and 1000 
 * and adds all the digits in the integer. 
 * For example, if an integer is 932, 
 * the sum of all its digits is 14.
 * */
public class Q5{
  public static void main(String[] args){

    int randomNumber,hundreds,tens,unit,ans;

    randomNumber = (int)(Math.random() * 1000);  //This generates our random number between 0 - 1000 and stores it with the y variable

    System.out.println("Our Random Number is: " + randomNumber); //This print out our number to the screen.
    //We will be having only 3 integers in hundreds which can be expressed in Hundreds, Tens, and Unit
    unit = randomNumber % 10;  //This gets the first number (Units)
    randomNumber = randomNumber / 10; //This is used to validate the value of the random number.
    tens = randomNumber % 10; //This gets the value of the second number after the validation of the random number (Tens).

    randomNumber = randomNumber / 10; //This also validates the value of the Random number.

    hundreds = randomNumber % 10; //This gets the value of the (Hundreds)
    
    //print our output
    System.out.print(hundreds + " + " + tens + " + " + unit + " = "); 
    ans = hundreds + tens + unit;
    System.out.println(ans);
  }
}
