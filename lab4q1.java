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
	
	public String toString() {
		return String.format("%s to %s", startPoint, endPoint);
	}
}
