
class GroceryItem {
	private String name; //name of the stock
	private int stockLevel = 0; // stock level 
	private double price = 0.0; //price of the stock
	private int sold = 0;
	
	public GroceryItem() {
	}
	public GroceryItem(String name, int stockLevel, double price) {
		this.name = name;
		this.stockLevel = stockLevel;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStockLevel() {
		return stockLevel;
	}
	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void sell() {
		if(stockLevel > 0) {
			stockLevel--;
			sold++;
		} else {
			System.out.print("Out of Stock");
		}
	}
	public int totalSales() {
		return sold;
	}
	public void restock(int k) {
		if(k > 0) {
			stockLevel += k;
		} else {
			;
		}
	}
	public void displayStocks() {
		System.out.println("Name: " + name);
		System.out.println("Stock Level: " + stockLevel);
		System.out.println("Price: " + price);
	}
}
