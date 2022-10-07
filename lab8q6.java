class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(clickButton.getText() == "Smile") {
			clickButton.setText("Sad");
		} else {
			clickButton.setText("Smile");
		}
	}

}
