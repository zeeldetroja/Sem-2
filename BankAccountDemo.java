import java.util.*;

class BankAccount{
	int AccountNo;
	String UserName;
	String Email;
	String AccountType;
	int AccountBalance;


	public void getAccountDetails(){
		Scanner sc = new Scanner(System.in);
			AccountNo = sc.nextInt();
			UserName = sc.nextLine();
			Email = sc.nextLine();
			AccountBalance = sc.nextInt();
			AccountType = sc.nextLine();
	}

	public void  displayAccountDetails(){
		System.out.println(AccountNo);
		System.out.println(UserName);
		System.out.println(Email);
		System.out.println(AccountType);
		System.out.println(AccountBalance);
	}
}

public class BankAccountDemo{
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		a1.getAccountDetails();
		a1.displayAccountDetails();
	}
}