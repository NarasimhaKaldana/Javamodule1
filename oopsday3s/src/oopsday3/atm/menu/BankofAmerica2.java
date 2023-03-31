package oopsday3.atm.menu;

public class BankofAmerica2 implements BankingIface2 {
	private Account []accounts = new Account[5];
	private int accountIndex=0;
public BankofAmerica2() {
	// TODO Auto-generated constructor stub
}
	public Account[] getAccount() {
		return accounts;
	}

	public void setAccount(Account[] account) {
		this.accounts = account;
	}

	public BankofAmerica2(Account[] account) {
		super();
		this.accounts = accounts;            
	}
    
	public void addAccount(Account a1) {
		if(this.accountIndex < accounts.length)
		accounts[this.accountIndex++] = a1;
		else
			System.out.println("Operation not allowed");
	}
	
	
	
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double deposit(double amount) {
		// TODO Auto-generated method stub          
		return 0;
	}

	public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
