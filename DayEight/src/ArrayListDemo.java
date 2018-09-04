import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println(list.size() + " : " + list);
		list.add(new Integer(10)); //till jdk 1.4
		list.add(20); //from jdk 1.5
		System.out.println(list.size() + " : " + list);
		list.add(30);
		list.add(40);
		list.add(20);
		System.out.println(list.size() + " : " + list);
		list.remove(2);
		System.out.println(list.size() + " : " + list);
		list.set(0, 30);
		System.out.println(list.size() + " : " + list);
		list.add(2, 10);
		System.out.println(list.size() + " : " + list);
		if(list.contains(10))
			System.out.println("Element found");
		else
			System.out.println("Element not found");
		for(int obj:list) {
			System.out.println("Element:" + obj);
		}
	}
}
