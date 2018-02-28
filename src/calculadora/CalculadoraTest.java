package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calcu;
	
	@Before
	public void creaCalculadora() {
		calcu = new Calculadora(20,30);
		System.out.println("Inicio prueba");
	}
	
	@After
	public void borraCalculadora() {
		calcu = null;
		System.out.println("Fin prueba");
	}
	
	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora(20, 30);
		int res = calcu.suma();
		assertEquals(50,res);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora(20,30);
		int res = calcu.resta();
		assertEquals(-10,res);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora calcu = new Calculadora(20,30);
		int res = calcu.multiplicacion();
		assertEquals("Fallo en la multiplicación",600,res);
	}

	@Test
	public void testDivision() {
		Calculadora calcu = new Calculadora(8,2);
		int res = calcu.division();
		assertEquals("Fallo en la división",4,res);
	}
	
	@Test
	public void testDivCero() {
		try {
			Calculadora calcu = new Calculadora(8,0);
			int res = calcu.division();
			fail(("FALLO, debería haber lanzado la excepción"));
		} catch(ArithmeticException e) {
			// PRUEBA SATISFACTORIA
		}
	}

}
