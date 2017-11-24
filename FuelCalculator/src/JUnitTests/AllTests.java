package JUnitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FuelCalcTestSetFour.class, FuelCalcTestSetOne.class, FuelCalcTestSetThree.class,
		FuelCalcTestSetTwo.class })
public class AllTests {

}
