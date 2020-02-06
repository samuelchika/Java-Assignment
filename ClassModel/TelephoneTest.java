
public class TelephoneTest {
	public static void main(String[] args) {
		Tele tele = new Tele();
		
		TelephoneDetails t = new TelephoneDetails("Zoe", "Chika", "089999999");
		TelephoneDetails t2 = new TelephoneDetails("Amaka", "Chi", "0899997865");
		TelephoneDetails t1 = new TelephoneDetails("Samue", "Chika", "089456999");
		TelephoneDetails t3 = new TelephoneDetails("Chioma", "Joyce", "045656999");
		TelephoneDetails t4 = new TelephoneDetails("Zze", "Chika", "089219999");
		
		if(tele.addPhone(t)) {
			System.out.println(t.getNumber() + " was added Success");
		} else {
			System.out.println("Sorry");
		}
		if(tele.addPhone(t1)) {
			System.out.println(t1.getNumber() + " was added Success");
		} else {
			System.out.println("Sorry");
		}
		if(tele.addPhone(t3)) {
			System.out.println(t3.getNumber() + " was added Success");
		} else {
			System.out.println("Sorry");
		}
		if(tele.addPhone(t2)) {
			System.out.println(t2.getNumber() + " was added Success");
		} else {
			;
		}
		if(tele.addPhone(t4)) {
			System.out.println(t2.getNumber() + " was added Success");
		} else {
			;
		}
		System.out.println();
		System.out.println("Existing Users");
		tele.listDirectory();
		if(tele.deleteEntry("0899997865")) {
			System.out.println("Successfully Deleted");
		} else {
			;
		}
		System.out.println("Existing Users after delete");
		tele.listDirectory();
		System.out.println("Get Number of Chioma Joyce");
		System.out.println(tele.getNumber("Chioma", "Joyce"));
	}
}
