
public class Employee extends Person{
	private String company;
	private int empid;
	private String designation;
	public Employee(String name, int age, String address, String company, int empid, String designation) {
		super(name,age,address);
		this.company = company;
		this.empid = empid;
		this.designation = designation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
