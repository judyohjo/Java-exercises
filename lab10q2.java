class Duck implements Animal {
	
	public String getAnimal() {
		return "Duck";
	}
	public String getSound() {
		return "Squeks";
	}
}
class Cat implements Animal {
	public String getAnimal() {
		return "Cat";
	}
	public String getSound() {
		return "Meow";
	}
}
class Dog implements Animal {
	public String getAnimal() {
		return "Dog";
	}
	public String getSound() {
		return "Woof";
	}
}
class AnimalFactory {
	public Animal createAnimal(AnimalType animalType) {
		Animal newAnimal = new Duck();
		switch(animalType) {
		case DUCK: 
			newAnimal = new Duck();
			break;
		case CAT:
			newAnimal = new Cat();
			break;
		case DOG: 
			newAnimal = new Dog();
			break;
		}
		return newAnimal;
	}
}
