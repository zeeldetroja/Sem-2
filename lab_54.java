import java.util.scanner;

class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	float accountbalance;


	public void getAccountDetails(){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter account no=")
		accountNo = sc.nextInt();

		System.out.println("enter user name=");
		userName = sc.nextLine();
		sc.nextLine();

		System.out.println("enter email =");
		email = sc.nextLine();
		sc.nextLine();

		System.out.println("enter accounttype =");
		accountNo = sc.nextLine();
		sc.nextLine();

		System.out.println("enter account balance =");
		account balance = sc.nextFloat();
	}

	public void displayAccountDetails(){
		System.out.println(" ");
		\

		System.out.println("account no=" + accountno);

		System.out.println("user name=" + userName);

		System.out.println("email=" + eamil);

		System.out.println("account type=" + accounttype);

		System.out.println("account balance=" + accountbalance);
	}


}