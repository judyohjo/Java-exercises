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
	
	public void setX(int i) {
		if(i < 0) {
			this.x = x;
		} else {
			this.x = i;
		}
	}
	
	public void setY(int j) {
		if(j < 0) {
			this.y = y;
		} else {
			this.y = j;
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setXY(int newx, int newy) {
		if(newx < 0) {
			this.x = x;
		} else {
			this.x = newx;
		}
		if(newy < 0) {
			this.y = y;
		} else {
			this.y = newy;
		}
	}
	
	public int[] getXY() {
		int[] int_list = new int[] {this.x, this.y};
		return int_list;
	}
}
