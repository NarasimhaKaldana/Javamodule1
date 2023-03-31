package firsttest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TellerTest {
	
	Teller teller = new Teller();

	@Test(expected = IllegalArgumentException.class)
	public void testValidateUnacceptedCurrency1() {
        teller.validateTransaction("AUSD", 100); 
	}
	@Test(expected = InvalidTransactionAmountException.class)
	public void testValidateUnacceptedCurrency() {
        teller.validateTransaction("AUSD", 100); 

}
}