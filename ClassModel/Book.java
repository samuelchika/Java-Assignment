

class Book {
	private String title;


	private String author;
	private String publisher;
	private String category;
	private String isbn;
	private String yearOfPublication;
	private int price;
	private int numOfPages;
	
	public Book() {	
	}
	
	public Book(String author, String publisher, String category, String isbn, String yearOfPublication, int price, int numOfPages) {	
		this.author = author;
		this.publisher = publisher;
		this.category = category;
		this.isbn = isbn;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.numOfPages = numOfPages;
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
}
