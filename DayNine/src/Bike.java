
public class Bike implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Riding bike!");
	}

	@Override
	public void displayInfo() {
		blowHorn();
		System.out.println("This is bike!");
	}

	
}
