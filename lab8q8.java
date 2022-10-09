class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(jtfNumber1.getText());
		int num2 = Integer.parseInt(jtfNumber2.getText());
		int total = num1 + num2;
		jlbResult.setText(total + "");
	}
}
