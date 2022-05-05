package sdp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InfixPostFixTest {
	@Test
	public void infixToPostFixTest() {
		assertEquals(InfixPostFix.infixToPostFix("A+D*F-S%E*C"),"ADF*+S%EC*-");
	}
}
