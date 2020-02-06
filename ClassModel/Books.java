
class Books {
	private String title;
	private int quantity;
	private double price;
	
	public Books(String title, int quantity, double price) {
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	
	public boolean sell() {
		if(quantity > 0) {
			quantity--;
			return true;
		} else {
			return false;
		}
	}
	public void addStock(int k) {
		if(k > 0) {
			quantity += k;
		}
	}
	public String getTitle() {
		return title;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice(){
		return price;
	}
	public void display(){
		System.out.println("Title : "+title);
		System.out.println("Quantity : "+ quantity);
		System.out.printf("Price : %.2f ",price);
		System.out.println();
	}
}
