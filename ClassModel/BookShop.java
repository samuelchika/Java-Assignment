import java.util.Vector;

class BookShop {
	private Vector stack; //when you intitalize a vector it should create one object.
	
	//each vector takes in a book as an argument
	public BookShop () {
		stack = new Vector();
	}
	
	public void addBook(Books b) {
		stack.addElement(b);
	}
	
	public boolean sellBook(String title) {
		//we have to check if the book exist before we even try to sell
		Books b;
		b = searchBook(title);
		if(b != null) {
			b.sell();
			return true;					
		} else {
			return false;
		}
	}
	public boolean updateStock(String title, int quantity) {
		Books b;
		System.out.println(title);
		String t = "" + title;
		b = searchBook(t);
		b.display();
		if(b != null && quantity > 0) {
				b.addStock(quantity);
				return true;
		} else {
			return false;
		}
		
	}
	
	public Books checkStock(String title) {
		Books b;
		b = searchBook(title);
		return b;
	}
	public void displayStock(){
		
		Books b1;
		if(stack.isEmpty()) {
			System.out.println("******** ( -- No Stock Available -- ) ********");
		} else {
			System.out.println("******** ( -- Stock List -- ) ********");
			for(int j=0;j<stack.size();j=j+1){
				b1=(Books)stack.elementAt(j);
				b1.display();
			}
		}
		
	}
	
	public Books searchBook(String title) {
		Books b = null;
		boolean found  = false;
			for(int i = 0; i < stack.size() && !found; i++) {
				b = (Books)stack.elementAt(i);
				if(title.contentEquals(b.getTitle())) {
					found = true;
				}
			}
			if(found) {
				return b;
			} else {
				return null;
			}
		
		
	}
	
}
