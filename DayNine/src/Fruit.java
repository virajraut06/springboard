
public class Fruit {
	private String name, color;
	private int calories, price;
	
	public Fruit(String name, int calories, int price, String color) {
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getCalories() {
		return calories;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", calories=" + calories + ", price=" + price + "]";
	}
	
	
}
