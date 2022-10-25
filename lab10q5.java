class MyActionListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
	      String[] string = new String[]{};
		  if(e.getSource() == loadButton) {
			  File myFile = new File(filenameTextfield.getText());
			  Scanner sc;
			try {
				sc = new Scanner(myFile);
				while(sc.hasNext()) {
				    String country = sc.nextLine();
				    String[] countryname = country.split(":");
				    String[] countryNode = countryname[1].split(",");
				    
				    if(countryname.length > 0) {
				    	tm.insertNodeInto(createCountryNode(countryname[0], countryNode), root, tm.getChildCount(root));

				    }

				}
				    
				
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			  
			  	  
		  
		  }
	  }
  }
