
public enum AccountType {
	savingsAccount("SA"),currentAccount("CA");
	private String name;
	AccountType(String str){
		name=str;
	}
	public String getType() {
		return name;
	}

}
