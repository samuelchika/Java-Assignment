/*
 * Write a program that displays a random uppercase letter  using the System.CurrentTimeMillis() method. 
 * */
public class Q9 {
  public static void main(String[] args) {
  	//We use the long variable to store data because of its:
  	// 8 byte length.
  	// its capable of converting char values to unicode values and use them for data manipulation.
    long getTime = System.currentTimeMillis(); //This is used to store the data because of its length
    // display random upper-case letter
    long randomValue = 'A' + getTime % ('Z' - 'A' + 1); 
    //The above code converts A to its unicode value (65), likewise other characters Z = (90).
    /*
      * when we use the time variable to fetch the value of the System.currentTimeMillis().
      * This randomValue is a long data type value.
      * using the long data type also convert the charater to a unicode.
      * we divide the time variable by 26 (total number of alphabeth) and have the remainder.
      * The remainder value will be added to the value of A to keep its value within the limit of A(65) - Z(90)
    */
    // display the upper-case letter
    System.out.print("Our Random Letter is: " + (char) randomValue);
    //We have to cast the value variable to a char to convert it to a character.
  }
}
