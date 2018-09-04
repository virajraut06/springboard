
public class VehicleMain {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Car car = new Car();
		
		bike.drive();
		bike.displayInfo();
		
		car.drive();
		car.displayInfo();
	}
}
