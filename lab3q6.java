public class Author {
	
	private String name;
	private String email;
	
	public Author() {
		this.name = "";
		this.email = "";
	}
	
	public Author(String newName, String newEmail) {
		this.name = newName;
		this.email = newEmail;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		return String.format("%s at %s", name, email);
	}
}
