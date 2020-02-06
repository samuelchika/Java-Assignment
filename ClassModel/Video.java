class Video {
	private String name;
	private String director;
	private String category;
	private double price;
	private boolean borrowed = false;
	
	public Video() {
		
	}
	public Video(String name, String director, String category, double price) {
		this.name = name;
		this.director = director;
		this.category = category;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double checkPrice() {
		return price;
	}
	public void changePrice(double price) {
		this.price = price;
	}
	public boolean checkBorrowed() {
		return borrowed;
	}
	public void borrow() {
		if(this.borrowed == true) {
			System.out.println("Video on Loan");
		} else {
			this.borrowed = true;
		}
	}
	public void returned() {
		//(this.borrowed == false) ? System.out.println("This Video is not out") : false;
		if(this.borrowed == false) {
			System.out.println("Video in Stock");
		} else {
			this.borrowed = false;
		}
	}
	
	public String information() {
		return "Video Information: [name = '" + name + "', director = '" + director + "', category = '" + category + "', price = '" + price
				+ "', borrowed = '" + borrowed + "']";
	}
	
}
