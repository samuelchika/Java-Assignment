import java.util.Scanner;
public class DiaryTest {
	public static void main(String[] args) {
		DiaryData diary = new DiaryData();
		Diary d = new Diary("Samuel", "098765432","samuelemyrs@gmail.com", "26/11/1993");
		Diary d1 = new Diary("Samuel", "098765432","samuelemyrs@gmail.com", "26/11/1993");
		Diary d2 = new Diary("Chika", "34567890","chika@gmail.com", "26/11/1997");

		if(diary.addContact(d)) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
		if(diary.addContact(d2)) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
		diary.displayContact("Samuel");
		diary.displayAll();
		System.out.println("After Changing Samuel Email");
		diary.changeEmail("Samuel", "samuel@hotmail.com");
		diary.displayAll();
		System.out.println(showMenu());
		
	}
	// Stoped at creating the showMenu. create the do while loop and exception.
	public static int showMenu() {
		Scanner input = new Scanner(System.in);
		int opt = 0;
		System.out.println("----- ( Welcome to Samuel Chika Diary ) ------");
		System.out.println("Below are the Available Actions available: ");
		System.out.println(" 1. Create New Contact!");
		System.out.println(" 2. Change Email");
		System.out.println(" 3. Change Phone");
		System.out.println(" 4. Show Contact Details");
		System.out.println(" 5. Delete Contact");
		System.out.println(" 6. Delete all contact");
		opt = input.nextInt();
		return opt;
	}
	public static void newContact(DiaryData diary) {
		//we prompt user for his details, get all the details and push it.
		
	}
	public static void changeEmail () {
		//we prompt for the person name and then email address
	}
	public static void changePhone () {
		
	}
	public static void contactDetails() {
		//prompt user to enter the name of the contact to show details
	}
	public static void allContacts(DiaryData diary) {
		diary.deleteAll();
	}
	public static void deleteContact() {
		//we request for the number to delete.
	}
}

