class Ticket {
	private String nameOfEvent;
	private double price;
	private java.util.Date date;
	private int seatNumber;
	
	public Ticket() {
	}
	public Ticket(String nameOfEvent, double price, int seatNumber) {
		this.nameOfEvent = nameOfEvent;
		this.price = price;
		this.seatNumber = seatNumber;
		this.date = new java.util.Date();
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public java.util.Date getDate() {
		return date;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
}
