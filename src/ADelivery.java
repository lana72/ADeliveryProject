import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ADelivery {

	public class CDeliveryJTest {
		CDelivery Cobj = new CDelivery();

		@Test
		public void PriceForDistanceLessThan10KM() {
			Assert.assertEquals(10, Cobj.PriceforDistance(8));

		}

		@Test
		public void PriceForDistanceGreaterThan10KM() {
			Assert.assertEquals(25, Cobj.PriceforDistance(12));
		}

		@Test
		public void PriceForDistanceAndStairsForLessThan10KM() {
			Assert.assertEquals(20, Cobj.PriceForDistanceAndStairs(8));

		}

		@Test
		public void PriceForWeekEnd() {
			Assert.assertEquals(50, Cobj.PriceForWeekEnd());
		}
	}

}
