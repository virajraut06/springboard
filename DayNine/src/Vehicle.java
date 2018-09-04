
public interface Vehicle {
	public void drive();
	public void displayInfo();
	public default void blowHorn() {
		System.out.println("Honk Honk!!");
	}
}
