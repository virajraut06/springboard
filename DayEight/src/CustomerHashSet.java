import java.util.HashSet;
import java.util.Set;

public class CustomerHashSet {
	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"John");
		Customer customer2 = new Customer(2,"Bob");
		Customer customer3 = new Customer(3,"Alice");
		Customer customer4 = new Customer(4,"Sam");
		Customer customer5 = new Customer(5,"Christine");
		Set<Customer> custSet = new HashSet<>();
		custSet.add(customer1);
		custSet.add(customer2);
		custSet.add(customer3);
		custSet.add(customer4);
		custSet.add(customer5);
		for(Customer cobj: custSet) {
			System.out.println("Id: "+cobj.getId()+" Name: "+cobj.getName());
		}
	}
}
