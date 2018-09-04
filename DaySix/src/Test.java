
public class Test {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		System.out.println(test1.getClass().getName());
		String str1 = "Hello World Hello";
		String str2 = "Hello World";
		str2 = str1.toUpperCase();
		System.out.println(str1);
		System.out.println(str2);
		String str3 = new String("Hello World");
		String str4 = new String("Hello World");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		String list[] = str1.split(" ");
		String pal = "";
		for(int i=list.length-1; i>=0;i--) {
			pal += (list[i]+" ");
		}
		System.out.println(pal);
		if(str1.equals(pal.trim()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
