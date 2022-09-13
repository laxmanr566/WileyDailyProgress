
public class BankAccountApp {
public static void main(String... args) {
	BankAccount b1=new BankAccount(1,"Laxman Ramancha",1000);
	BankAccount b2=new BankAccount(2,"Srija",5453);
	BankAccount b3=new BankAccount(3,"Somu",3333);
	BankAccount.displayTotalBalance();
	
	b1.withdrawAmount(5000);
	BankAccount.displayTotalBalance();
	
	b2.withdrawAmount(2343);
	System.out.println(b2.getCurrentBalance());
	BankAccount.displayTotalBalance();
	
	b3.depositAmount(2999);
	System.out.println(b3.getCurrentBalance());
	BankAccount.displayTotalBalance();
	
	b1.depositAmount(3343);
	BankAccount.displayTotalBalance();
	System.out.println(b1.getCurrentBalance());
	
	b3.withdrawAmount(4999);
	System.out.println(b3.getCurrentBalance());
	BankAccount.displayTotalBalance();

	BankAccount.displayTotalBalance();
}


}
