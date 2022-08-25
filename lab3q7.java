public class Gleep {
	
	private String name;
	private int weight;

	public Gleep(String string, int i) {
		this.name = string;
		this.weight = i;
	}
	
	public void eat(int i) {
		weight += (i*2);
		System.out.println("Yummy");
		
	}

	public void move() {
		if(weight < 100) {
			System.out.println("OK, OK, I'm moving.");
		} else {
			System.out.println("Too fat to move.");
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return String.format("A %.2f kg Gleep called %s.", (double) weight, name);
	}
}
