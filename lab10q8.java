public void addNode(TreePath selectedPath, String name) {
	    //complete this
	    Person parentNode = (Person) selectedPath.getLastPathComponent();
	  	int numberOfChildren = root.getSize();
	    Person newPerson = new Person(name);
	    parentNode.addChild(newPerson);
	    fireTreeNodesInserted(this, selectedPath.getPath(), new int[]{numberOfChildren},new Object[]{parentNode});
	}
	public void removeNode(TreePath selectedPath) {
	    //complete this
		Person selectedNode = (Person) selectedPath.getLastPathComponent();
		Person parentSelectedNode = (Person)selectedNode.getParent();
		int childIndex = parentSelectedNode.indexOf(selectedNode);
		parentSelectedNode.removeChild(selectedNode);
	    fireTreeNodesRemoved(this, selectedPath.getParentPath().getPath(), new int[]{childIndex},new Object[]{selectedNode});
	}  
