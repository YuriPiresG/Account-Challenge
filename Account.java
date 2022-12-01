
public class Account {

	private int accountNumber;
	private double accountBalance;
	private String accountUser;
	private String accountEmail;
	private int accountPhone;


	public Account(int accountNumber, double accountBalance, String accountUser, String accountEmail,
			int accountPhone) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountUser = accountUser;
		this.accountEmail = accountEmail;
		this.accountPhone = accountPhone;
	}

		public int getAccountNumber() {
			return accountNumber;
		}
		
		public double getAccountBalance() {
			return accountBalance;
		}

		
		public String getAccountUser() {
			return accountUser;
		}
		
		public String getAccountEmail() {
			return accountEmail;
		}
		
		public int getAccountPhone() {
			return accountPhone;
		}
		
		
	public void depositFunds(double depoVal) {
		this.accountBalance +=depoVal;
		System.out.println("Your new balance is: "+accountBalance);
	}

	public void withdrawFunds(double withVal) {
		this.accountBalance-=withVal;
		System.out.println("Your new balance is: "+accountBalance);
	}

		public void welcomeMessage() {
			System.out.println("Hi, "+getAccountUser()+".\n Your email is: "+getAccountEmail()+".\n Your account number(ID) is: "+getAccountNumber()+".\n Your CellPhone is: "+getAccountPhone()+".\n Your balance is: "+getAccountBalance());
		}
}
