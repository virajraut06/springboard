
public class AnimalMain {
	public static void main(String[] args) {
		Animal animal;
		
		animal = new Dog();
		animal.speak();
		animal.eat();
		
		animal = new Cat();
		animal.speak();
		animal.eat();
	}
}
