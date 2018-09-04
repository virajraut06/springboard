
public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeFactory1 employeeFactory1 = Employee::new;
		Employee employee = employeeFactory1.getEmployee();
		System.out.println(employee);
		
		EmployeeFactory2 employeeFactory2 = Employee::new;
		Employee employee2 = employeeFactory2.getEmployee("Suresh", "Vice President");
		System.out.println(employee2);
	}
}
