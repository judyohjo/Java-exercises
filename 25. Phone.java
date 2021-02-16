
public class Phone {

	//Variables
	String color;
	String model;
	int price;
	
	void Pen() {}
	void Pen(String c) {
		
	}
	
	/*
	 * 생성자: 생성자는 객체가 생성될때 실행해야할 로직을 
	 * 작성할 수 있습니다. 생성자는 선언해야만 호출할 수 있으며
	 * 생성자를 하나도 선언하지 않을 경우 자동으로 기본생성자가 선언됩니다.
	 */
	Phone() {
//		System.out.println("생성자가 호출됨!");
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
