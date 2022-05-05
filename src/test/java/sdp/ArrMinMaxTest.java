package sdp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrMinMaxTest {
	@Test
	public void getMinMaxTest() {
		int[] arr = {10,20,30,40,50,60,70,80};
		int[] res;
		int[] correctAns = {10, 80};
		res = ArrMinMax.getMinMax(arr);
		assertEquals(res[0],correctAns[0]);
		assertEquals(res[1],correctAns[1]);
	}

}
