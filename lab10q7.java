class FamilyTreeModel implements TreeModel {
	private Person root;
	private ArrayList<TreeModelListener>  treeModelListeners;
 //complete this 
    public FamilyTreeModel(Person newRoot) {
        this.root = newRoot;
        treeModelListeners =  new ArrayList<TreeModelListener>();
    }
    public Object getChild(Object parent, int index) {
    	Object child = null;
    	if(parent instanceof Person) {
    		Person newPerson = (Person) parent;
    		child = newPerson.getChildAt(index);
    	}
    	return child;
    }
    public int getChildCount(Object parent) {
    	int childcount = 0;
    	if(parent instanceof Person) {
    		Person newPerson = (Person) parent;
    		childcount = newPerson.getSize();
    	} 
    	return childcount;
    }
    public int getIndexOfChild(Object parent, Object child) {
    	return (Integer) child;
    }
    public Object getRoot() {
        return root;
    }
    public boolean isLeaf(Object node) {
    	return !(node instanceof Person);
    }
 
  public void addTreeModelListener(TreeModelListener l) {
    treeModelListeners.add(l);
  }
  public void removeTreeModelListener(TreeModelListener l) {
    treeModelListeners.remove(l);
  }
  protected void fireTreeNodesRemoved(Object source, Object[] path,int[] childIndices,Object[] children) {
    final TreeModelEvent event = new TreeModelEvent(source, path, childIndices, children);
    for (final TreeModelListener l : treeModelListeners)
      l.treeNodesRemoved(event);
  }
  protected void fireTreeNodesInserted(Object source, Object[] path,int[] childIndices,Object[] children) {
    final TreeModelEvent event = new TreeModelEvent(source, path, childIndices, children);
    for (final TreeModelListener l : treeModelListeners)
      l.treeNodesInserted(event);
  }
  public void valueForPathChanged(TreePath path, Object newValue) {}
}
