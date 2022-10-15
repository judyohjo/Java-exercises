class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == changeButton) {
			for(int i=0; i<tm.getRowCount(); i++) {
				int column = tm.findColumn("# of Years");
				int value = ((Integer) tm.getValueAt(i, column)).intValue();
				tm.setValueAt(new Integer(value+1), i, column);
			}
				
		}
	}
}
