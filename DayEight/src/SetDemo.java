import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set;
		set = new HashSet<>();
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(60);
		set.add(50);
		System.out.println("HashSet: " + set);
		for(Integer obj:set) {
			System.out.println("Element: " + obj);
		}
		set = new LinkedHashSet<>();
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(60);
		set.add(50);
		System.out.println("LinkedHashSet: " + set);
		Iterator<Integer> itrSet = set.iterator();
		System.out.println(itrSet.getClass().getName());
		System.out.println("Iterator:");
		while(itrSet.hasNext()) {
			System.out.println(itrSet.next());
		}
		set = new TreeSet<>();
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(60);
		set.add(50);
		System.out.println("TreeSet: " + set);
		for(Integer obj:set) {
			System.out.println("Element: " + obj);
		}
	}
}
