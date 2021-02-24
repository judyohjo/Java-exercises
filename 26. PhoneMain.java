
public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.info();
		
		Phone bluePhone = new Phone("Saphire");
		bluePhone.info();
		
		Phone galaxyS9 = new Phone("Cobalt blue", "GalaxyS9");
		galaxyS9.info();
		
		//Object variable = Apple
		Phone samsung = new Phone("Purple", "Apple", 2000);
		samsung.info();

	}

}
