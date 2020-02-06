import java.util.InputMismatchException;
import  java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		Person p1 = new Person("Chika", "353899616949", "samuelemyrs@gmail.com");
//		Person p2 = new Person();
//		
//		System.out.println(p1.getName());
//		p2.setName("Samuel");
//		p2.setEmail(p1.getEmail());
//		p2.setPhone("0805577448822");
//		System.out.println(p2.toString());
		GroceryItem banana = new GroceryItem("banana", 200, 1.5);
		GroceryItem apple = new GroceryItem("apple", 200, 0.8);
		
		apple.sell();
		apple.sell();
		System.out.println(apple.totalSales());
		
		Video gifted = new Video();
		Video familiar = new Video("Familiar", "Jake Jones", "Religious", 34.5);
		
		familiar.borrow();
		familiar.borrow();
		familiar.returned();
		System.out.print(familiar.information() + "\n");
		familiar.borrow();
		System.out.print(familiar.information() + "\n");
		System.out.println();
		BookShop books = new BookShop();
		int opt = 0;
		do {
			try {
				opt = menuShow();
				switch(opt) {
				case 1:
					addBooks(books);
					break;
				case 2:
					sellingBook(books);
					break;
				case 3:
					addStock(books);
					break;
				case 4:
					checkStock(books);
					break;
				case 5:
					stockDisplay(books);
					break;
			}
				
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Invalid Input!\nOnly Numbers between 1 - 6 is accepted\n");
				
			}
			
			
		} while (opt != 6);
		
		
		
		
//		initBook(books);
//		books.sellBook("Learn Java");
//		Books b = books.checkStock("MySql");
//		if(b != null) {
//			b.display();
//		} else {
//			System.out.println("Not FOund");
//		}
			
	}
	public static void checkStock(BookShop books) {
		// TODO Auto-generated method stub
		
	}
	public static void stockDisplay(BookShop books) {
		// TODO Auto-generated method stub
		books.displayStock();
		
	}
	public static void addStock(BookShop books) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String bookName = "";
		System.out.println("Enter Book Title: ");
		bookName = input.nextLine();
		books.updateStock(bookName, 20);
		
	}
	public static void sellingBook(BookShop books) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String bookName = new String();
		System.out.println("Enter Book Title: ");
		bookName = input.nextLine();
		boolean sold = books.sellBook(bookName);
		if(sold) {
			System.out.println("Sold");
		} else {
			System.out.println("Out of Stock");
		}
	}
	public static void addBooks(BookShop books) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String bookName;
		System.out.println("Enter Book Title: ");
		bookName = input.nextLine();
		System.out.println("Enter Quantity: ");
		int quantity = input.nextInt();
		System.out.println("Enter Price: ");
		double price = input.nextDouble();	
		Books b = new Books(bookName, quantity, price);
		books.addBook(b);
		Books b1;
		
	}
	
	
	public static int menuShow() {
		Scanner input = new Scanner(System.in);
		int opt;
		System.out.println("******************Welcome to Our Bookshop******************");
		System.out.println("Please read the instruction carefully and make a choice");
		System.out.println("  1. Add new book");
		System.out.println("  2. Sell Book");
		System.out.println("  3. New Stock");
		System.out.println("  4. Check Stock");
		System.out.println("  5. Display Stock");
		System.out.println("  6. Exit");
		System.out.println("*************************************************************");
		System.out.println("Enter Your Choice: ");
		opt = input.nextInt();
		
		return opt;
		
	}
	

}
