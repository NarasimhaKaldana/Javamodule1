package oopsday3.atm.menu;
import java.util.Scanner;

//import oopsday2.atm.Account;
 //import oopsday2.atm.BankofAmerica2;
public class BankMenu {
  //  public static void main(String args[]) {
    	BankofAmerica2 boa = new bankofAmerica2();
    	public BankMenu() {
    		Account a1 = new Account(101,"John Deo","savings",500);
    	    Account a2 = new Account(102,"Jone Deo","savings",700);
    	    Account a3 = new Account(103,"Jason Deo","savings",850);
    	    Account a4 = new Account(104,"Jane Deo","savings",250);
    	    Account a5 = new Account(105,"Jonas Deo","pension",650);
    	       
    	    		   boa.addAccount(a1);
    	               boa.addAccount(a2);
    	               boa.addAccount(a3);
    	               boa.addAccount(a4);
    	               boa.addAccount(a5); 
    	}
    	
		/*
		 * System.out.println("1.Create account"); System.out.println("2.deposit");
		 * System.out.println("3.withdraw"); System.out.println("4.Balanceenquiry");
		 * System.out.println("5.exit");
		 */
    	public void menu() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("enter your choice 1...5");
    	choice = scanner.nextInt();
    	switch (choice) {
    	case 1:{
    		System.out.println("Enter actno");
    		int actno = scanner.nextInt();
    		boa.displayAccount(actno);
    		break;
    		
    	}
    	case 2:{
    		System.out.println("Enter actno");
    		int actno = scanner.nextInt();
    		double balance = boa.deposite(200,101);
    		System.out.println(balance);
    		break;
    	}
    	case 3:{
    		System.out.println("Enter actno");
    		
    		break;
    		
    	}
    	case 4:{
    		break;
    		
    	}
    	case 5:
    	{
    		break loop;
    	}
    	}
    	while(choice !=5);
    }
}
