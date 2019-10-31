package math_utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MathFunctionsPowerTest {
	
	private static MathFunctions mathFunctions;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mathFunctions = new MathFunctions();
	}

	@Test
	void testPower_Base1Exponent1() {
		assertEquals(1, mathFunctions.power(1, 1));
	}
	
	@Test
	void testPower_Base2Exponent1() {
		assertEquals(2, mathFunctions.power(2, 1));
	}
	
	@Test
	void testPower_Base2Exponent0() {
		assertEquals(1, mathFunctions.power(2, 0));
	}
	
	@Test
	void testPower_Base0Exponent2() {
		assertEquals(0, mathFunctions.power(0, 2));
	}
	

	@Test
	void testPower_Base0Exponent0() {
		assertEquals(1, mathFunctions.power(0, 0));
	}
	
	@Test
	void testPower_Base1ExponentNegative1() {
		assertThrows(IllegalArgumentException.class, () -> {mathFunctions.power(1, -1);});
	}
	
	@Test
	void testPower_BaseNegative1Exponent1() {
		assertThrows(IllegalArgumentException.class, () -> {mathFunctions.power(-1, 1);});
	}

}
