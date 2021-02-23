
//설계용 클래스 (라이브러리 클래스)는 메인메서드를 작성하지 않습니다.
public class Pen {
	
	//객체의 속성을 나타내는 것을 필드(멤버변수)라고 부릅니다.
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
