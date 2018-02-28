package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraTest.class, CalculadoraTestDivisiónParam.class, CalculadoraTestMultiplicaParam.class,
		CalculadoraTestParam.class, CalculadoraTestRestaParam.class })
public class AllTests {

}
