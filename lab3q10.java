public class Book {
	private String name;
	private ArrayList<Author> authors = new ArrayList<Author>();
	private double price;
	private int quantityInStock;
	private int count = 0;
	
	public Book(String newName, double newPrice) {
		this.name = newName;
		this.price = newPrice;
	}
	
	public Book(String newName, double newPrice, int newQuantityInStock) {
		this.name = newName;
		this.price = newPrice;
		this.quantityInStock = newQuantityInStock;
	}
	
	public Book(String newName, ArrayList<Author> newAuthors, double newPrice) {
		this.name = newName;
		this.authors = newAuthors;
		this.price = newPrice;
	}
	
	public Book(String newName, ArrayList<Author> newAuthors, double newPrice, int newQuantityInStock) {
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
	
	public void setAuthors(ArrayList<Author> c) {
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
	
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}
    
	public String toString() {
		for(int i=0; i<authors.size(); i++) {
			count++;
		}
		if(authors.size() == 1) {
			return String.format("%s by %d author", name, count);
		} else {
			return String.format("%s by %d authors", name, count);
		}
		
	}
	
	public void printAuthors() {
		for(int i=0; i<authors.size(); i++) {
			System.out.println(authors.get(i));
		}
	}
}
