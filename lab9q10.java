class MyActionListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  if(e.getSource() == addButton) {
			  tm.addRow(new Book(nameTextfield.getText(),Integer.parseInt(numberTextfield.getText())));
		  } else if(e.getSource() == removeButton) {
			  int index = table.getSelectedRow();
			  if (index >= 0) {
				  tm.removeRow(index);
			  }
		  } else {
			  File myFile = new File(filenameTextfield.getText());
			  Scanner sc;
			try {
				sc = new Scanner(myFile);
				
				
				while(sc.hasNext()) {
				    String book = sc.nextLine();
				    String[] name = book.split(",");
				    if(name.length > 0) {
				        tm.addRow(new Book(name[0],Integer.parseInt(name[1])));
				    }
				    
				}
				
					  
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			  
			  	  
		  }
	  }
  }
