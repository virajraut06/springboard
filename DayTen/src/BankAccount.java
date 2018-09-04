
public class BankAccount {
	private int accNo;
	private String accName;
	private double accBal;
	
	public BankAccount(int accNo, String accName, double accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getAccBal() {
		return accBal;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	
}
