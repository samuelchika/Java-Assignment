/**
 * Write a program that displays the following table (note that 1 kilogram is 2.2 pounds):

Kilograms 	Pounds
1			2.2
3 			6.6
...			...
197 			433.4	
199			437.8
 */

/**
 * @author EZEJA
 *
 */
public class Q5 {

	/**
	 * @param args
	 */
	final static double pound = 2.2; //This define the pound value as a constant
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Kilograms %15s \n", "Pounds"); //using the printf method of the PrintStream class, we format our string with %lineSpace DATATYPE
		
        for (int i = 1; i <= 199; i++) {
                 double val = i *pound;  //Calculate the pound value for each kilogrammes
                    if(i % 2 != 0){ //if its an even number, it should print and skip the odd numbers
                         if(i > 10 ) { // This keeps our pound values in line with others
                             if(i > 100) {
                                  System.out.printf("%d%21.1f\n",i, val);  // with the %d%21.1f\n it formats the values of i and also the pound value, keeping it in 2 decimal places
                              } else {
                                  System.out.printf("%d%22.1f\n",i, val);
                              }                  
                         } else {
                             System.out.printf("%d%23.1f\n",i, val);
                        }
                    }
        }
	}

}
