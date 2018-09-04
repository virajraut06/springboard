
public class Employee {
	private int empno;
	String ename;
	String job;
	double salary;
	int deptNo;
	
	public Employee(int empno, String ename, String job, double salary, int deptNo) {
		this.empno = empno;
		this.ename = ename; 
		this.job = job;
		this.salary = salary;
		this.deptNo = deptNo;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public String getJob() {
		return job;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptNo="
				+ deptNo + "]";
	}
	
	
}
