package sdp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcTest {
	@Test
	public void addTest() {
		assertEquals(Calc.add(2, 3),5);
	}
	
	@Test
	public void subTest() {
		assertEquals(Calc.sub(10, 4),6);
	}
	
	@Test
	public void mulTest() {
		assertEquals(Calc.mul(2, 3),6);
	}
	
	@Test
	public void divTest() {
		assertEquals(Calc.div(10, 2),5);
	}
}
