class BookListModel<Book> extends AbstractListModel {
	  private ArrayList<Book> bookList;
	  public BookListModel() {
		 bookList = new ArrayList<Book>();
	  }
	  public int getSize() {
		  return bookList.size();
	  }
	  public Book getElementAt(int index) {
		  return bookList.get(index);
	  }
	  public void addElement(Book element) {
		  bookList.add(element);
		  if(bookList.contains(element)) {
			  fireIntervalAdded(this, 0, 1);
		  }
	  }
	  public void removeElementAt(int index) {
		  bookList.remove(index);
		  fireIntervalRemoved(this, 0, 1);
	  }
	  
	  
  }
