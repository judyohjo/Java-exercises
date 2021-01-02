
public class IfExample1 {

	public static void main(String[] args) {
		
		int point = (int)(Math.random() * 101);
		System.out.println("Score: " + point);
		
		if(point >= 60) {
			System.out.println("The score is over 60.");
			System.out.println("You passed the test.");
		} else {
			System.out.println("The score is under 60.");
			System.out.println("You didn't pass the test.");
		}
		System.out.println("Well done.");

	} // end main

} // end class
