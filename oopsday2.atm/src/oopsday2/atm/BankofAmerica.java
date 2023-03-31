package oopsday2.atm;

public class BankofAmerica implements BankingIface {
	
	private Account account = new Account(1001,"John Doe","salary",500);

	@Override
	public double withdraw(double amount) {
		
		account.setBalane(account.getBalane()-amount);
		return account.getBalane();
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public double deposit(double amount) {
		
		account.setBalane(account.getBalane()+amount);
		return account.getBalane();
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public double balanceEnquiry(int acno) {
		
		return account.getBalane();
		// TODO Auto-generated method stub
		//return 0;
	}

}
