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
	
	public double distance(int i, int j) {
		this.x = this.x - i;
		this.y = this.y - j;
		double x_squared = Math.pow(x, 2);
		double y_squared = Math.pow(y, 2);
		double distance2 = x_squared + y_squared;
		double distance = Math.sqrt(distance2);
		return distance;
	}
	
	public double distance(MyPoint p) {
		int x_diff = this.x - p.x;
		int y_diff = this.y - p.y;
		double x_squared = Math.pow(x_diff, 2);
		double y_squared = Math.pow(y_diff, 2);
		double distance2 = x_squared + y_squared;
		double distance = Math.sqrt(distance2);
		return distance;
	}
	
	public double distance() {
		this.x = x;
		this.y = y;
		double x_squared = Math.pow(x, 2);
		double y_squared = Math.pow(y, 2);
		double distance2 = x_squared + y_squared;
		double distance = Math.sqrt(distance2);
		return distance;
		
	}
}
