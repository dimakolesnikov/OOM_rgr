package JUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.FuelCalcBL;

public class FuelCalcTestSetTwo 
{
	@Test
	public void test() 
	{
		FuelCalcBL fc;
		
		// test 1
		fc = new FuelCalcBL(200, 32, 35);
		assertEquals(64, fc.TotalFuelConsumption, 0);
		assertEquals(2240, fc.TotalSum, 0);
		
		// test 2
		fc = new FuelCalcBL(323.4, 12.3, 31.2);
		assertEquals(39, fc.TotalFuelConsumption, 0.7783);
		assertEquals(1241, fc.TotalSum, 0.07985);
		
		// test 3
		fc = new FuelCalcBL(-324, -3, 0);
		assertEquals(0, fc.TotalFuelConsumption, 0);
		assertEquals(0, fc.TotalSum, 0);
	}
}
