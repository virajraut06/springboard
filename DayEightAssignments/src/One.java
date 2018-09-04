import java.util.TreeSet;

public class One {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(10);
		treeSet.add(15);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(20);
		System.out.println("Elements less than 7");
		for(Integer obj:treeSet) {
			if(obj<7) {
				System.out.println(obj);
			}
		}
	}
}
