class MyActionListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	if(e.getSource() == addButton) {
	    		listModel.insertElementAt(numberTextfield.getText(), listModel.getSize());
	    	
	    	} else if (e.getSource() == removeButton) {
	    		int index = numberList.getSelectedIndex();
		    	listModel.remove(index);
	    	}
	    }
	}
