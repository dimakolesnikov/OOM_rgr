package JUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.FuelCalcBL;

public class FuelCalcTestSetThree
{
	@Test
	public void test() 
	{
		FuelCalcBL fc;
		
		// test 1
		fc = new FuelCalcBL(150, 20, 25);
		assertEquals(30, fc.TotalFuelConsumption, 0);
		assertEquals(750, fc.TotalSum, 0);
		
		// test 2
		fc = new FuelCalcBL(223.4, 12.2, 33.6);
		assertEquals(27, fc.TotalFuelConsumption, 0.2548);
		assertEquals(915, fc.TotalSum, 0.76129);
		
		// test 3
		fc = new FuelCalcBL(0, 2, -2);
		assertEquals(0, fc.TotalFuelConsumption, 0);
		assertEquals(0, fc.TotalSum, 0);
	}
}
