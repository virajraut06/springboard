class A{
	public A() {
		System.out.println("Class A");
	}
}
class B extends A{
	public B() {
		System.out.println("Class B");
	}
}
class C extends B{
	public C() {
		System.out.println("Class C");
	}
}
public class MultilevelDemo {
	public static void main(String[] args) {
		C c =new C();
	}
}
