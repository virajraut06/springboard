
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int a,b,c;
		a = 10;
		b = 10;
		try {
			c = a/b;
			System.out.println("C is "+c);
			String str = "Hello";
			System.out.println(str.charAt(10));
		}
		catch(ArithmeticException ae) {
			System.out.println("divide by zero");
			ae.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("Wrong string index.");
		}
		catch(Exception e) {
			System.out.println("generic");
		}
		finally {
			System.out.println("Aali lahar, kela kahar!");
		}
	}
}
