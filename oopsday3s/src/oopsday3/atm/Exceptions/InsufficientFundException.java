package oopsday3.atm.Exceptions;

public class InsufficientFundException extends Exception {
	public InsufficientFundException(String msg) {
		
	
	 super(msg);
}
@Override
public String getMessage() {
	return super.getMessage();
}
}
