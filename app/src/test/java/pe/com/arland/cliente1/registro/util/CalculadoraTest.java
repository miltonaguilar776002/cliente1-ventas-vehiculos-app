package pe.com.arland.cliente1.registro.util;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.ArithmeticException;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		double esperado = 50;// 20 +30
		double resultado = Calculadora.suma(20, 30);
		assertEquals(esperado, resultado);
	}

	@Test
	void testResta() {
		double esperado = 10;// 30 -20 
		double resultado = Calculadora.resta(30, 20);
		assertEquals(esperado, resultado);
	}

	@Test
	void testMultiplicacion() {
		double esperado = 50;// 10 * 5
		double resultado = Calculadora.multiplicacion(10,5);
		assertEquals(esperado, resultado);
	}

	@Test
	void testDivision1() {
		double esperado = 5;// 50 / 10
		double resultado = Calculadora.division(50,10);
		assertEquals(esperado, resultado);
	}

	@Test
	void testDivision2() {
		double esperado = 4;// 50 / 10
		double resultado = Calculadora.division(50,10);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testDivision3() {
		double esperado = 4;// 50 / 10
		double resultado = 	Calculadora.division(50,0);
		assertEquals(esperado, resultado);
	}
	
	@Test()
	void testDivision4() {
		try {
			double esperado = 4;// 50 / 10
			double resultado = Calculadora.division(50,0);// 50 / 10
			assertEquals(esperado, resultado);
			
		} catch (Exception e) {
			if (e.getClass() == ArithmeticException.class) {
				assertEquals("No se puede dividir entre cero", e.getLocalizedMessage());
			} 
			else {
				fail("Error no controlado");
			}
			
		}
		
	}
}
