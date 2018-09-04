
public class PolygonMain {
	 public static void main(String[] args) {
		 Polygon polygon;
		 polygon =  new Polygon();
		 polygon.calcArea(12.23, 23.34);
		 polygon =  new Rectangle();
		 polygon.calcArea(12.23, 23.34);
		 ((Rectangle)polygon).rect();
		 polygon =  new Triangle();
		 polygon.calcArea(12.23, 23.34);
		 ((Triangle)polygon).triangle();
		 
	}
}
