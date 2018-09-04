import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map =  new HashMap<>();
		map.put(123, "Mumbai");
		map.put(234, "Pune");
		map.put(345, "Nagpur");
		map.put(456, "Chennai");
		map.put(567, "Delhi");
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		if(map.containsKey(345))
			System.out.println("contains key");
		if(map.containsValue("Chennai"))
			System.out.println("contains value");
		
		map.remove(345);
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		Iterator<Map.Entry<Integer, String>> itrEntry = entry.iterator();
		while (itrEntry.hasNext()) {
			Map.Entry<Integer, String> record = itrEntry.next();
			System.out.println(record.getKey() + " : " + record.getValue());
		}
	}
}