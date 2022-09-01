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
	
	public String toString() {
		return String.format("MySubCylinder: height=%.2f, %s", this.height, super.toString());
	}
	
	public double getVolume() {
		double volume = Math.PI * (super.getRadius() * super.getRadius()) * this.height;
		return volume;
	}
	
	public double getSurfaceArea() {
		double surfaceArea = (2 * Math.PI * super.getRadius() * this.height) + (2 * Math.PI * (super.getRadius() * super.getRadius()));
		return surfaceArea;
	}
}
