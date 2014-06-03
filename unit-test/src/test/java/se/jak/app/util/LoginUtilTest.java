package se.jak.app.util;


import static org.junit.Assert.*;

import org.junit.Test;

public class LoginUtilTest {
	@Test
	public void failOnBadNumber() throws Exception {
		//Bad number from Wikipedia
		String number = "79927398710";
		
		boolean result = LoginUtil.checkLuhn(number);
		
		assertFalse(result);
	}
	
	@Test
	public void succeedOnGoodNumber() throws Exception {
		//Bad number from Wikipedia
		String number = "79927398713";
		
		boolean result = LoginUtil.checkLuhn(number);
		
		assertTrue(result);
	}
}
