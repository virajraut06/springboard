import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Yudhishtir", 30));
		persons.add(new Person("Arjun", 28));
		persons.add(new Person("Bhim", 26));
		persons.add(new Person("Nakul", 22));
		persons.add(new Person("Sahadev", 21));
		
		Person p = new Person();
		Collections.sort(persons, p::compareByName);
		System.out.println(persons);
		
		Collections.sort(persons, Person::compareByAge);
		System.out.println(persons);
		
	}
}