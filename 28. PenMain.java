
public class PenMain {

	public static void main(String[] args) {
		
		Pen blackPen = new Pen();
		
		blackPen.color = "Black";
		blackPen.price = 1;
		
		blackPen.write();
		blackPen.info();
		
		Pen redPen = new Pen();
		redPen.color = "Red";
		redPen.price = 2;
		
		redPen.write();
		blackPen.write();
		redPen.write();
		
		System.out.println(redPen);
		System.out.println(blackPen);
		
		Pen bluePen = new Pen();
		bluePen.color = "Blue";
		bluePen.write();
	}

}
