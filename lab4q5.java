public class MyCylinder {
	private MyCircle2D base = new MyCircle2D();
	private int height = 1;
	
	public MyCylinder() {
		base.setX(0);
		base.setY(0);
	}
	
	public MyCylinder(double newRadius) {
		base.setX(0);
		base.setY(0);
		base.setRadius(newRadius);
	}
	
	public MyCylinder(double newRadius, int newHeight) {
		base.setX(0);
		base.setY(0);
		base.setRadius(newRadius);
		this.height = newHeight;
	}
	
	public MyCylinder(int x, int y, double newRadius, int newHeight) {
		base.setX(x);
		base.setY(y);
		base.setRadius(newRadius);
		this.height = newHeight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public double getRadius() {
		return base.getRadius();
	}
	
	public int getX() {
		return base.getX();
	}
	
	public int getY() {
		return base.getY();
	}
	
	public void setHeight(int height2) {
		this.height = height2;
	}
	
	public void setRadius(double radius2) {
		base.setRadius(radius2);
	}
	
	public void setX(int x) {
		base.setX(x);
	}
	
	public void setY(int y) {
		base.setY(y);
	}
}
