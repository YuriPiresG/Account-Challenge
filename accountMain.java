
public class accountMain {
	
	
	
public static void main(String[] args) {
	
	Account a = new Account(01, 500, "Yuri", "yuri@gov.com.br", 987651234);
	
	a.welcomeMessage();
	a.withdrawFunds(500);
	a.depositFunds(1500);
	
}
}
