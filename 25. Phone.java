
public class Phone {

	//Variables
	String colour;
	String model;
	int price;
	
	void Pen() {}
	void Pen(String c) {
		
	}
	
	Phone() {
//		System.out.println("Calling the constructor!");
		colour = "Grey";
		model = "Samsung";
		price = 500000;
	}
	
	Phone(String pColour, String pModel) {
		colour = pColour;
		model = pModel;
		price = 900000;
	}
	
	Phone(String pColour, String pModel, int pPrice) {
		colour = pColour;
		model = pModel;
		price = pPrice;
	}
	
	
	Phone(String pColour) {
		colour = pColour;
		model = "Galaxy S21";
		price = 250000;
	}
	
	//Calling the Method
	void info() {
		System.out.println("======== Information about the phone ========");
		System.out.println("Colour: " + colour);
		System.out.println("Model: " + model);
		System.out.println("Price: $" + price);
		System.out.println("========================");
	}
}
