
public class Triangle extends Polygon{
	@Override
	public void calcArea(double l, double w) {
		area = 0.5 * l * w;
		System.out.println("Triangle: "+area);
	}
	public void triangle() {
		System.out.println("triangle");
	}
}
