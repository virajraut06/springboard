
public class GreetingsDemo {
	public static void main(String[] args) {
		Greetings greetings1 = () -> System.out.println("Good Morning");
		Greetings greetings2 = () -> System.out.println("Good Afternoon");
		Greetings greetings3 = () -> System.out.println("Good Evening");
		
		greetings1.greet();
		greetings2.greet();
		greetings3.greet();
		
		System.out.println("-----------------");
		
		Operations operations1 = (int a, int b) -> {
			int c = a+b;
			System.out.println("Addition: "+c);
		};
		
		Operations operations2 = (int a, int b) -> {
			int c = a-b;
			System.out.println("Subtraction: "+c);
		};
		
		Operations operations3 = (int a, int b) -> {
			int c = a*b;
			System.out.println("Multiplication: "+c);
		};
		
		operations1.operate(2, 3);
		operations2.operate(7, 3);
		operations3.operate(5, 3);
	}
}