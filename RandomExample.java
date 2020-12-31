
public class RandomExample {

	public static void main(String[] args) {
		
		double r = Math.random();
		System.out.println("Random value: " + r);
		
		int rn = (int)(r * 10);
		System.out.println("Integer random number: " + rn);
		System.out.println("-------------------");
		
		System.out.println("*** Travelling places to go ***");
		if (r > 0.66) {
			System.out.println("Let's go to New Zealand!!");
		} else if (r > 0.33) {
			System.out.println("Let's go to Australia!!");
		} else {
			System.out.println("Let's stay home!!");
		}

	}

}
