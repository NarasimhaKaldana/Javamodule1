package firsttest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TellerTest {
	
	Teller teller = new Teller();

	@Test(expected = IllegalArgumentException.class)
	public void testValidateUnacceptedCurrency() {
        teller.validateTransaction("AUSD", 100); 
	}
	@Test(expected = InvalidTransactionAmountSException.class)
	public void testValidateUnacceptedCurrency() {
        teller.validateTransaction("AUSD", 100); 

}
}