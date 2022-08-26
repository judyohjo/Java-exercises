public class Book {
	private String name;
	private Author author;
	private double price;
	private int quantityInStock;
	
	public Book(String newName, double newPrice) {
		this.name = newName;
		this.price = newPrice;
	}
	
	public Book(String newName, double newPrice, int newQuantityInStock) {
		this.name = newName;
		this.price = newPrice;
		this.quantityInStock = newQuantityInStock;
	}
	
	public Book(String newName, Author newAuthor, double newPrice) {
		this.name = newName;
		this.author = newAuthor;
		this.price = newPrice;
	}
	
	public Book(String newName, Author newAuthor, double newPrice, int newQuantityInStock) {
		this.name = newName;
		this.author = newAuthor;
		this.price = newPrice;
		this.quantityInStock = newQuantityInStock;
	}
	
	public void setName(String i) {
		this.name = i;
	}
	
	public void setAuthor(Author b) {
		this.author = b;
	}
	
	public void setPrice(double j) {
		this.price = j;
	}
	
	public void setQuantityInStock(int a) {
		this.quantityInStock = a;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}

	public String toString() {
		return String.format("%s by %s", name, author);
	}
}
