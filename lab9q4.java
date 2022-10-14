class MyActionListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  if(e.getSource() == addButton) {
			  petComboBox.addItem(petTextfield.getText());
		  } else if(e.getSource() == removeButton) {
			  int index = petComboBox.getSelectedIndex();
			  if(index >= 0) {
			      petComboBox.removeItemAt(index);
			  }
		  }
		  else if(e.getSource() == petComboBox) {
		      output.append((String)petComboBox.getSelectedItem() + "\n");
		  }
	  }
  }
