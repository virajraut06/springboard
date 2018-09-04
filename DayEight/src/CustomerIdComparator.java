import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		Integer id1 = customer1.getId();
		Integer id2 = customer1.getId();
		String name1 = customer1.getName();
		String name2 = customer2.getName();
		if(id1 != id2) {
			return id1.compareTo(id2);	
		} else {
			return name1.compareTo(name2);
		}
	}
}
