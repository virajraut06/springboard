import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Four {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(10);
		treeSet.add(15);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(20);
		System.out.println("Enter a number:");
		int num = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Elements strictly greater than "+num+":");
		for(Integer obj:treeSet) {
			if(obj>num) {
				System.out.println(obj);
			}
		}
	}
}