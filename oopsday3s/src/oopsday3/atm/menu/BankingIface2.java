package oopsday3.atm.menu;

import oopsday3.atm.Exceptions.InsufficientFundException;

public interface BankingIface2 {
public abstract double withdraw (double amount, int actno)throws InsufficientFundException;
public abstract double deposit (double amount, int actno)throws InsufficientFundException;
public abstract double bankingEnquiry(int actno);

}
