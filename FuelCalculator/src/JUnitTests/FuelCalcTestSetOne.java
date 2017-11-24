package JUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.FuelCalcBL;

public class FuelCalcTestSetOne 
{
	@Test
	public void test() 
	{
		FuelCalcBL fc;
		
		// test 1
		fc = new FuelCalcBL(300, 15, 30);
		assertEquals(45, fc.TotalFuelConsumption, 0);
		assertEquals(1350, fc.TotalSum, 0);
		
		// test 2
		fc = new FuelCalcBL(453.3, 11.7, 28.8);
		assertEquals(53, fc.TotalFuelConsumption, 0.0361);
		assertEquals(1527, fc.TotalSum, 0.44);
		
		// test 3
		fc = new FuelCalcBL(-30, 0, -23000);
		assertEquals(0, fc.TotalFuelConsumption, 0);
		assertEquals(0, fc.TotalSum, 0);
	}
}
