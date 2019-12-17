/**
 * Write a class that contains the following two methods:
 *      The formula for the conversion is:

meter = 0.305 * foot
foot = 3.279 * meter

Write a test program that invokes these methods to display the following tables:
 */

/**
 * @author EZEJA
 *
 */

public class Q9 {

	/**
	 * @param args
	 */
	final static double meters = 3.279; //Declaring of Static Values for meters
	final static double foots = 0.305; //Declaring of Static values for foots
	public static double footToMeter(double foot) {
		double meter;
		meter = foots * foot;
		return meter;
	}
	public static double meterToFoot(double meter) {
		double foot;
		foot = meters * meter;
		return foot;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s%12s%5s%9s%12s\n", "Feet", "Meters", "|", "Meters", "Feet");
		System.out.println("------------------------------------------");
		for (double i = 1, j = 20; i <= 10; i++, j = j + 5 ) {
			System.out.printf("%4.1f%12.3f%5s%9.1f%12.3f\n", i, footToMeter(i), "|", j, meterToFoot(j));
		}

	}

}
