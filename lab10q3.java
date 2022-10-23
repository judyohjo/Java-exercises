class MyActionListener implements ActionListener {
	  public void actionPerformed(ActionEvent e) {
		  if(e.getSource() == addButton) {
			  DefaultMutableTreeNode child = new DefaultMutableTreeNode(petTextfield.getText());
			  
			  tm.insertNodeInto(child, root, tm.getChildCount(root));
		  } else if(e.getSource() == removeButton) {
			  DefaultMutableTreeNode node = (DefaultMutableTreeNode)animalsTree.getSelectionPath().getLastPathComponent();
			  tm.removeNodeFromParent(node);
		  }
			  
	  }
  
  }
