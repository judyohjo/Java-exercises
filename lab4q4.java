public class MySubLine extends Point {
	
	private Point endPoint;
	
	public MySubLine() {
		this.endPoint = new Point(0, 0);
	}
	
	public MySubLine(int x1, int y1, int x2, int y2) {
		super(x1, y1);
		this.endPoint = new Point(x2, y2);
	}
	
	public MySubLine(Point newStartPoint, Point newEndPoint) {
		super(newStartPoint);
		this.endPoint = newEndPoint;
	}
	
	public int getEndX() {
	    return this.endPoint.x;
	}
	
	public int getEndY() {
	    return this.endPoint.y;
	}
	
	public void setEndLocation(int x, int y) {
	    this.endPoint.x = x;
	    this.endPoint.y = y;
	}
	
	public double getLength() {
	    int x_diff = super.x - this.endPoint.x;
		int y_diff = super.y - this.endPoint.y;
		double x_squared = Math.pow(x_diff, 2);
		double y_squared = Math.pow(y_diff, 2);
		double distance2 = x_squared + y_squared;
		double distance = Math.sqrt(distance2);
		return distance;
	}
	
	public String toString() {
		return String.format("%s to %s", super.toString(), endPoint);
	}
}
