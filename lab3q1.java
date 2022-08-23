public class Pig {
	private static String name;
	private static int age;
	
	public Pig() {
		name = "";
		age = 0;
	}

	public Pig(String string, int i) {
		name = string;
		age = i;
	}

	public void setName(String string) {
		this.name = string;
	}
	
	public void setAge(int i) {
		if(i < 0) {
			age = age;
		} else {
			this.age = i;
		}
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void speak() {
		System.out.printf("%s says Oink.", name);
		
	}
	
	public String toString() {
		return String.format("%s is %d years old.", name, age);
	}
}
