package JUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.FuelCalcBL;

public class FuelCalcTestSetFour 
{
	@Test
	public void test() 
	{
		FuelCalcBL fc;
		
		// test 1
		fc = new FuelCalcBL(100, 40, 50);
		assertEquals(40, fc.TotalFuelConsumption, 0);
		assertEquals(2000, fc.TotalSum, 0);
		
		// test 2
		fc = new FuelCalcBL(123.2, 23.1, 35.3);
		assertEquals(28, fc.TotalFuelConsumption, 0.45921);
		assertEquals(1004, fc.TotalSum, 0.60977);
		
		// test 3
		fc = new FuelCalcBL(0, 0, -45);
		assertEquals(0, fc.TotalFuelConsumption, 0);
		assertEquals(0, fc.TotalSum, 0);
	}
}
