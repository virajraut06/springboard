
public class AnonymousDemo {
	public static void main(String[] args) {
		AnInterface anInterface = new AnInterface() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("m1");
			}
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("m2");
			}
		};
		
		anInterface.m1();
		anInterface.m2();
	}
}
