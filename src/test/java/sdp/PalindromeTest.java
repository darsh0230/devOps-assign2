package sdp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {
	@Test
	public void addTest() {
		assertEquals(Palindrome.checkPalindrome(12321),true);
		assertEquals(Palindrome.checkPalindrome(2321),false);
	}
}
