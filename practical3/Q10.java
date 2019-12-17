/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel Chika, Ezeja.
 */

/*
  This is the outputting the value of the powers of 2
2 to the power of 0 to 2 to the power of 7

We use the printf to format our output in other to keep the spaces

we make use of the Math.pow(2,0)
*/
public class Q10 {
  public static void main(String[] args){
    for(int l = 0; l <= 7; l++){
      System.out.printf("%" + 4 * (8 - l) + "s", " ");
      /*
        The space uses 4 line to space each number
      There for we have to add 1 as we reduce the land to avoid error
      %0s or %0f or %0d will give error.
      */
      //The above line we use to monitor the spacing of each line to maintain the pyramid shape as the number and lines increase
      for(int m = 0; m <= l; m++){
        System.out.printf("%4d", (int)Math.pow(2,m));
          if(m == l ){
            //After getting to the max value, 
            //this starts printing back the code to the least number again
            for(int u = (m - 1); u >= 0; u--){
              System.out.printf("%3d", (int)Math.pow(2,u));
            }
          }
      }
      System.out.println(); //This takes the cusor to a new line.
    }
  }
}
