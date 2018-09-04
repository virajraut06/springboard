import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBuilder {
	
	public static List<String> getEmplBySalary(List<Employee> emp){
		return emp.stream()
				.filter(e -> (e.getSalary() >20000 && e.getDeptNo() == 10))
				.sorted(comparing(Employee::getEname))
				.map(Employee::getEname)
				.collect(toList());
	}
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Onkar", "Trainer", 50000, 10));
		employees.add(new Employee(2, "Amit", "Admin", 30000, 20));
		employees.add(new Employee(3, "Rahul", "HR", 40000, 30));
		employees.add(new Employee(4, "Ajay", "Trainer", 55000, 10));
		employees.add(new Employee(5, "Karan", "Admin", 30000, 20));
		employees.add(new Employee(6, "Kumar", "HR", 40500, 30));
		employees.add(new Employee(7, "Ajit", "CEO", 50000, 100));
		employees.add(new Employee(8, "Laxman", "Trainer", 35000, 10));
		
		System.out.println(getEmplBySalary(employees));
		
	}
}