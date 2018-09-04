
public class Polygon {
	double area;
	public void calcArea(double l,double w) {
		area = (l*2)+(w*3)*(0.25*l*w);
		System.out.println("Polygon: "+area);
	}
}
