
public class Employee {
	private String name;
	private String designation;
	
	public Employee() {
		name = "Ramesh";
		designation = "Manager";
	}
	
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
	
	
}
