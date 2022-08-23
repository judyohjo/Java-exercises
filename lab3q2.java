class MyPoint {
	
	public int x;
	public int y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public MyPoint(MyPoint p) {
		this.x = p.x;
		this.y = p.y;
	}

	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}
