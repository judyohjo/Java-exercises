class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == jtfEnter) {
		    words.add(jtfEnter.getText());
		    System.out.println(jtfEnter.getText());
		    jtfEnter.setText("");
	    } else if (e.getSource() == btnGet) {
		    for(int i=0; i<words.size(); i++) {
			    if(words.get(i).length() == 4) {
				    display.append(words.get(i) + "\n");
			    }
		    }
        }
    }
}
