class MyActionListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  DefaultTableModel model = (DefaultTableModel) table.getModel();

		  if(e.getSource() == addButton) {
			  int n = model.getRowCount();
			  Object[] newRow = {n, n, n};
			  model.addRow(newRow);
		  } else if(e.getSource() == removeButton) {
			  int numRows = table.getSelectedRows().length;
			  for(int i=0; i<numRows; i++) {
				  model.removeRow(table.getSelectedRow());
			  }
			  
		  }
	  }
  }
