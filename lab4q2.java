public class MyLine {
	
	private Point startPoint;
	private Point endPoint;
	
	public MyLine() {
		this.startPoint = new Point(0, 0);
		this.endPoint = new Point(0, 0);
	}
	
	public MyLine(int x1, int y1, int x2, int y2) {
		this.startPoint = new Point(x1, y1);
		this.endPoint = new Point(x2, y2);
	}
	
	public MyLine(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public int getX() {
		return this.startPoint.x;
	}
	
	public int getY() {
		return this.startPoint.y;
	}
	
	public void setX(int x) {
		this.startPoint.x = x;
	}
	
	public void setY(int y) {
		this.startPoint.y = y;
	}
	
	public int getEndX() {
		return this.endPoint.x;
	}
	
	public int getEndY() {
		return this.endPoint.y;
	}
	
	public void setEndX(int x) {
		this.endPoint.x = x;
	}
	
	public void setEndY(int y) {
		this.endPoint.y = y;
	}
	
	public double getLength() {
		int x_diff = this.startPoint.x - this.endPoint.x;
		int y_diff = this.startPoint.y - this.endPoint.y;
		double x_squared = Math.pow(x_diff, 2);
		double y_squared = Math.pow(y_diff, 2);
		double distance2 = x_squared + y_squared;
		double distance = Math.sqrt(distance2);
		return distance;
	}
	
	public String toString() {
		return String.format("%s to %s", startPoint, endPoint);
	}
}
