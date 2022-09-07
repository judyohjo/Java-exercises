class Author implements Comparable<Author> {
	private String name;
	private String email;
	public Author (String name, String email) {
		this.name = name;
		this.email = email;
	}
	public void setName(String n) { name = n; }
	public String getName() {
		return name;
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

	public int compareTo(Author other) {
	    int count=0;
	    if(this.getName().charAt(0) < other.getName().charAt(0)) {
	        count = (this.getName().charAt(0) - other.getName().charAt(0));
	    } else if(this.getName().charAt(0) == other.getName().charAt(0)) {
	        count = 0;
	    } else if(this.getName().charAt(0) > other.getName().charAt(0)){
	        count = (this.getName().charAt(0) - other.getName().charAt(0));
	    }
	    return count;
	}
}
