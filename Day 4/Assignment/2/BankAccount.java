
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private static double totalBalance=0;
	AccountType accountType;
	
	public BankAccount(int accountId, String accountHolderName, double openingBalance,AccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType=accountType;
		System.out.println(accountType);
		if(openingBalance>0) {
			if(this.accountType.getType().equals("SA")) {
				System.out.println("inside savings");
				if(openingBalance>500) {
					this.openingBalance=this.currentBalance = openingBalance;
					totalBalance+=openingBalance;
				}
				else {
					System.out.println("opening balance should be greater than 500");
				}
			} else if(this.accountType.getType().equals("CA")) {
				
				if(openingBalance>1000) {
					this.openingBalance=this.currentBalance = openingBalance;
					totalBalance+=openingBalance;
				}
				else {
					System.out.println("opening balance should be greater than 1000");
				}
			}
		}else {
			System.out.println("Opening balance can not be less than zero");
		}
		
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	
	
	public void withdrawAmount(double amt) {
		if(this.accountType==(AccountType.savingsAccount)) {
			if(amt<=(currentBalance-500) && totalBalance>=amt) {
				this.currentBalance=this.currentBalance-amt;
				totalBalance=totalBalance-amt;
				System.out.println("Withdraw Successfull :"+amt+" deducted from "+this.accountHolderName);
			}
			else {
				if(amt>(this.currentBalance-500)) {
					System.out.println("Amount is greater than current Balance, Please try with different Amount");
				}
				else  {
					System.out.println("Amount is greater than total amount in bank , Please try with different Amount");
				}
			}
		} else if(this.accountType==(AccountType.currentAccount)) {
			if(amt<=(currentBalance-1000) && totalBalance>=amt) {
				this.currentBalance=this.currentBalance-amt;
				totalBalance=totalBalance-amt;
				System.out.println("Withdraw Successfull :"+amt+" deducted from "+this.accountHolderName);
			}
			else {
				if(amt>(this.currentBalance-1000)) {
					System.out.println("Amount is greater than current Balance, Please try with different Amount");
				}
				else  {
					System.out.println("Amount is greater than total amount in bank , Please try with different Amount");
				}
			}
		}
		
		
		
		
	}
	public void depositAmount(double amt) {
		totalBalance+=amt;
		currentBalance+=amt;
		System.out.println(amt+" deposited in "+this.accountHolderName);
	}
	 public double getCurrentBalance() {
		 return currentBalance; 
	 }
	 public static void displayTotalBalance() {
		 System.out.println("Total available cash in bank is :"+totalBalance);
	 }
	 
}
