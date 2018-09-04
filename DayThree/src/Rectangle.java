
public class Rectangle extends Polygon{
	@Override
	public void calcArea(double l, double w) {
		area = l * w;
		System.out.println("Rectangle: "+area);
	}
	public void rect() {
		System.out.println("rect");
	}
}
