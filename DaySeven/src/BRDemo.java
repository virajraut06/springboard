import java.io.*;
public class BRDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string:");
		String str = bufferedReader.readLine();
		System.out.println("You typed - "+str);
	}
}
