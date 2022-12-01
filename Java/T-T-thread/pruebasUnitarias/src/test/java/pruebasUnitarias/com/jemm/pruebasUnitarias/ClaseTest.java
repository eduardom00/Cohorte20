package pruebasUnitarias.com.jemm.pruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.jemm.pruebasUnitarias.Calculadora;

public class ClaseTest {
	@Test
	void pruebaSuma() {
		Calculadora calc = new Calculadora(true);
		assertEquals(5, calc.suma(2, 2));
	}
}
