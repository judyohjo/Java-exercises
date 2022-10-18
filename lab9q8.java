class MyTableModel extends AbstractTableModel {
	  Object[][] data = { {"Mary", "Campione",  "Snowboarding", new Integer(5), new Boolean(false)},
		  {"Alison", "Huml",  "Rowing", new Integer(3), new Boolean(true)},
		  {"Kathy", "Walrath", "Chasing toddlers", new Integer(2), new Boolean(false)},
		    {"Mark", "Andrews", "Speed reading", new Integer(20), new Boolean(true)},
		     {"Angela", "Lih","Teaching high school", new Integer(4), new Boolean(false)} };
	  String[] columnName = {"First Name", "Last Name","Sport", "# of Years","Vegetarian"};;
	  
	  public int getColumnCount() {
		  return columnName.length;
	  }
	  public int getRowCount() {
		  return data.length;
	  }
	  public String getColumnName(int column) {
		  return columnName[column];
	  }
	  public Object getValueAt(int rowIndex, int columnIndex) {
		  return data[rowIndex][columnIndex];
	  }
  }
