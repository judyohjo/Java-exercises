class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
	  if(e.getSource() == btnJump) {
		  squareOne = new OverlapSquare(rand.nextInt(80), rand.nextInt(50));
		  squareTwo = new OverlapSquare(rand.nextInt(80), rand.nextInt(50));
		  if(squareOne.overlaps(squareTwo)) {
			  squareOne.overlaps(squareTwo);
		  } 
	  }
      repaint();
    }
}
