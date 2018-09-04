
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class StreamBuilders {
	public static List<String> getNamesWithA(List<String> names){
		return names.stream()
				.filter(s -> s.startsWith("A"))
				.sorted()
				.map(String::toUpperCase)
				.collect(toList());
	}
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Ajit");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		System.out.println(getNamesWithA(memberNames));
	}
}
