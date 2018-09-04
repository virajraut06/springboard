
public class Student extends Person{
	private int std;
	private char grade;
	public Student(String name, int age, String address, int std, char grade) {
		super(name, age, address);
		this.std = std;
		this.grade = grade;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
