public class Book {
	private String name;
	private double price;
	private int quantityInStock;
	private Author[] authors;
	private int count=0;
	
	public Book(String newName, double newPrice) {
		this.name = newName;
		this.price = newPrice;
	}
	
	public Book(String newName, double newPrice, int newQuantityInStock) {
		this.name = newName;
		this.price = newPrice;
		this.quantityInStock = newQuantityInStock;
	}
	
	public Book(String newName, Author[] newAuthors, double newPrice) {
		this.name = newName;
		this.authors = newAuthors;
		this.price = newPrice;
	}
	
	public Book(String newName, Author[] newAuthors, double newPrice, int newQuantityInStock) {
		this.name = newName;
		this.authors = newAuthors;
		this.price = newPrice;
		this.quantityInStock = newQuantityInStock;
	}
	
	
	public void setName(String i) {
		this.name = i;
	}

	
	public void setPrice(double j) {
		this.price = j;
	}
	
	public void setQuantityInStock(int a) {
		this.quantityInStock = a;
	}
	
	public void setAuthors(Author[] c) {
		this.authors = c;
	}
	
	public String getName() {
		return name;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
	public Author[] getAuthors() {
		return authors;
	}

	public String toString() {
		for(int i=0; i<authors.length; i++) {
			count++;
		}
		if(authors.length == 1) {
			return String.format("%s by %d author", name, count);
		} else {
			return String.format("%s by %d authors", name, count);
		}
		
	}
	
	public void printAuthors() {
		for(int i=0; i<authors.length; i++) {
			System.out.println(authors[i]);
		}
	}
}
