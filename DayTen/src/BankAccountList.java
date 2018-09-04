import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class BankAccountList {
	
	public static void main(String[] args) {
		List<BankAccount> bankAccounts = new ArrayList<>();
		bankAccounts.add(new BankAccount(1001, "Vishal", 50000));
		bankAccounts.add(new BankAccount(1002, "Amit", 75000));
		bankAccounts.add(new BankAccount(1003, "Sanket", 150000));
		bankAccounts.add(new BankAccount(1004, "Nisarg", 58000));
		bankAccounts.add(new BankAccount(1005, "Shivam", 52600));
		bankAccounts.add(new BankAccount(1006, "Sagar", 72000));
		bankAccounts.add(new BankAccount(1007, "Sachin", 26000));
		bankAccounts.add(new BankAccount(1008, "Dinesh", 81000));
		bankAccounts.add(new BankAccount(1009, "Ankit", 200000));
		bankAccounts.add(new BankAccount(1010, "Steve", 45200));
		
		System.out.println("Highest balance");
		System.out.println(bankAccounts.stream().sorted(comparing(BankAccount::getAccBal).reversed()).collect(toList()).subList(0, 1));
		System.out.println("Account holder name starts with A");
		System.out.println(bankAccounts.stream().filter(bacc -> bacc.getAccName().startsWith("A")).sorted(comparing(BankAccount::getAccBal).reversed()).collect(toList()));
		System.out.println("Least balance");
		System.out.println(bankAccounts.stream().sorted(comparing(BankAccount::getAccBal)).collect(toList()).subList(0, 1));
		System.out.println("Highest balance + name starting with A");
		System.out.println(bankAccounts.stream().filter(bacc -> bacc.getAccName().startsWith("A")).sorted(comparing(BankAccount::getAccBal).reversed()).collect(toList()).subList(0, 1));
		
	}
}
