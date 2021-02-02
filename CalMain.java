
public class CalMain {

	public static void main(String[] args) {
		
		//Creating Calculator 1. 
		Calculator c1 = new Calculator();
		//Creating Calculator 2.
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator();
		Calculator c4 = new Calculator();
		
		c1.add(14);
		c1.sub(7);
		c1.mul(6);
		c2.add(9);
		c2.add(15);
		c2.sub(10);
		c3.add(15);
		
		
		System.out.println("Results for Calculator 1:" + c1.result);
		System.out.println("Results for Calculator 2:" + c2.result);
		System.out.println("Results for Calculator 2:" + c3.result);

	}

}
