package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(24000000,900000);
		assertEquals(2400000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		Diezxciento diezxciento = new Diezxciento(24000000,1800000);
		assertEquals(144000.0, diezxciento.impuesto(), 0);
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		Diezxciento diezxciento = new Diezxciento(24000000,900000);
		assertEquals(21600000, diezxciento.saldoAhorro());
	}

}
