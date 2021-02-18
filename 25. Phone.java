
public class Phone {

	//Variables
	String color;
	String model;
	int price;
	
	void Pen() {}
	void Pen(String c) {
		
	}
	
	Phone() {
//		System.out.println("Calling the constructor!");
		color = "Grey";
		model = "Samsung";
		price = 500000;
	}
	
	Phone(String pColor, String pModel) {
		color = pColor;
		model = pModel;
		price = 900000;
	}
	
	Phone(String pColor, String pModel, int pPrice) {
		color = pColor;
		model = pModel;
		price = pPrice;
	}
	
	
	Phone(String pColor) {
		color = pColor;
		model = "Galaxy S21";
		price = 250000;
	}
	
	//Calling the Method
	void info() {
		System.out.println("======== Information about the phone ========");
		System.out.println("Colour: " + color);
		System.out.println("Model: " + model);
		System.out.println("Price: $" + price);
		System.out.println("========================");
	}
}
