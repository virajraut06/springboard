
public class UseAbstract extends AbstractDemo{
	public void calc(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	public UseAbstract() {
		super();
	}
	public static void main(String[] args) {
		UseAbstract us = new UseAbstract();
		us.calc(5, 7);
	}
}
