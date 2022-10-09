private class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if(btnGet.getText() == "Get") {
			display.append(poems[jcbRow.getSelectedIndex()][jcbColumn.getSelectedIndex()]);
			  
		}
	}
}
