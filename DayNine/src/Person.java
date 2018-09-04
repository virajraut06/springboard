
public class Person {
	private String name;
	private Integer age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public int compareByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public static int compareByAge(Person p1, Person p2) {
		return p1.getAge().compareTo(p2.getAge());
	}
}
