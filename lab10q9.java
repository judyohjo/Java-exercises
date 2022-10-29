 class MyMockListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        if(e.getSource() == addButton) {
			    tm.addNode(tree.getSelectionPath(), nameTextfield.getText());
			    for (int i: tree.getSelectionRows()) {
			        tree.expandRow(i);
			    }
			    
	        } else if(e.getSource() == removeButton) {
	        	if(tree.getSelectionPath() != null) {
	        		 tm.removeNode(tree.getSelectionPath());
	        	}
	            
	        }
	    }
  }
