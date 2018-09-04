import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> navigableSet = new TreeSet<>();
		navigableSet.add(20);
		navigableSet.add(30);
		navigableSet.add(50);
		navigableSet.add(70);
		navigableSet.add(10);
		navigableSet.add(90);
		navigableSet.add(60);
		navigableSet.add(80);
		System.out.println(navigableSet);
		System.out.println(navigableSet.ceiling(10));
		System.out.println(navigableSet.ceiling(90));
		System.out.println(navigableSet.higher(10));
		System.out.println(navigableSet.higher(90));
		System.out.println(navigableSet.floor(6));
		System.out.println(navigableSet.floor(20));
		System.out.println(navigableSet.lower(6));
		System.out.println(navigableSet.lower(12));
		System.out.println("---------------------------");
		
		SortedSet<Integer> sortedSet = navigableSet.headSet(50);
		System.out.println(sortedSet);
		NavigableSet<Integer> navigableSet2 = navigableSet.headSet(50, true);
		System.out.println(navigableSet2);
		System.out.println("---------------------------");
		
		SortedSet<Integer> sortedSet3 = navigableSet.tailSet(50);
		System.out.println(sortedSet3);
		NavigableSet<Integer> navigableSet3 = navigableSet.subSet(20, false, 70, true);
		System.out.println(navigableSet3);
		System.out.println("---------------------------");
	}
}
