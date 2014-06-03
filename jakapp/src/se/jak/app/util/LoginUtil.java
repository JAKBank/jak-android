package se.jak.app.util;

public class LoginUtil {
	/**
	 * Check ssn against the Luhn algorithm.
	 */
	public static boolean checkLuhn(String ssn) {
	    int sum = 0;
	    boolean alternate = false;
	    
	    for (int i = ssn.length() - 1; i >= 0; --i) {
	        int n = Integer.parseInt(ssn.substring(i, i + 1));
	        if (alternate) {
	            n *= 2;
	            if (n > 9) {
	                n = (n % 10) + 1;
	            }
	        }
	        
	        sum += n;
	        alternate = !alternate;
	    }
	    
	    return (sum % 10 == 0);
	}
}
