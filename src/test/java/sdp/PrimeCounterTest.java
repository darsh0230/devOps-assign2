package sdp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCounterTest {
	@Test
	public void addTest() {
		int arr[] = {1, 3, 6, 7, 4};
		assertEquals(PrimeCounter.getPrimeCount(arr),3);
	}
}
