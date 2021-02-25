
public class Pen {
	
	String color;
	int price;
	
	//객체의 기능을 나타내는 것을 메서드(멤버 함수)라고 부릅니다.
	void write() {
		System.out.println(color);
	}
	void info() {
		System.out.println("--------- Pen's Info ---------");
		System.out.println("Colour: " + color);
		System.out.println("Price: " + price);
	}

}
