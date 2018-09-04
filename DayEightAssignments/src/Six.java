import java.util.TreeSet;

public class Six {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(10);
		treeSet.add(15);
		treeSet.add(13);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(20);
		System.out.println("TreeSet before removing first element");
		for(Integer obj:treeSet) {
			System.out.println(obj);
		}
		
		System.out.println("TreeSet after removing first element: "+treeSet.first());
		treeSet.remove(treeSet.first());
		for(Integer obj:treeSet) {
			System.out.println(obj);
		}
	}
}
