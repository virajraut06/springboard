import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(42);
		list.add(15);
		list.add(25);
		list.add(86);
		list.add(56);
		
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				t += 20;
				System.out.println(t);
			}
			
		});
		
		System.out.println("Original");
		for(Integer lobj:list) {
			System.out.println(lobj);
		}
	}
}
