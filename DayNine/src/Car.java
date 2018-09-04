
public class Car implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Driving car!");
	}

	@Override
	public void displayInfo() {
		System.out.println("This is car!");
	}
	
}
