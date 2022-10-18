class BookTableModel extends AbstractTableModel {
	  String[] columnNames = {"Title", "Number of Pages"};
	  private ArrayList<Book> booktable;
	  public BookTableModel() {
		 booktable = new ArrayList<Book>();
	  }
	  public int getSize() {
		  return booktable.size();
	  }
	  public Book getElementAt(int index) {
		  return booktable.get(index);
	  }
	  public void addRow(Book element) {
		  booktable.add(element);
		  if(booktable.contains(element)) {
			  fireTableRowsInserted(0, booktable.size());
		  }
	  }
	  public void removeRow(int index) {
		  booktable.remove(index);
		  fireTableRowsDeleted(0, index);
	  }
	@Override
	public int getRowCount() {
		return booktable.size();
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object record = null;
		if(columnIndex == 0) {
			record = booktable.get(rowIndex).getTitle();
		} else {
			record = booktable.get(rowIndex).getNumberOfPages();
		}
		return record;
	}
	public String getColumnName(int column) {
		return columnNames[column];
	}
  }
