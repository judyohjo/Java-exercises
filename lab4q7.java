public class MySubCylinder extends MyCircle2D{
	
	private double height = 1.0;
	
	public MySubCylinder() {
		super();
	}
	
	public MySubCylinder(double newRadius) {
		super(newRadius);
	}
	
	public MySubCylinder(double newRadius, double newHeight) {
		super(newRadius);
		this.height = newHeight;
	}
	
	public MySubCylinder(int x, int y, double newRadius, double newHeight) {
		super(x, y, newRadius);
		this.height = newHeight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
}
