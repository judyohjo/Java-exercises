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
	
	public String toString() {
		return String.format("%s to %s", super.toString(), endPoint);
	}
}
