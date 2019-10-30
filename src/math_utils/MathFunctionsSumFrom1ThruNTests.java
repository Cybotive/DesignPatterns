package math_utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MathFunctionsSumFrom1ThruNTests {
	
	private static MathFunctions mathFunctions;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mathFunctions = new MathFunctions();
	}
	
	@Test
	void testSumFrom1ThruN_NIs1() {
		assertEquals(1, mathFunctions.sumFrom1ThruN(1));
	}
	
	@Test
	void testSumFrom1ThruN_NIs2() {
		assertEquals(3, mathFunctions.sumFrom1ThruN(2));
	}
	
	@Test
	void testSumFrom1ThruN_NIs10() {
		assertEquals(55, mathFunctions.sumFrom1ThruN(10));
	}
	
	@Test
	void testSumFrom1ThruN_NIs0() {
		assertThrows(IllegalArgumentException.class, () -> {mathFunctions.sumFrom1ThruN(0);});
	}
	
	@Test
	void testSumFrom1ThruN_NIsNegative1() {
		assertThrows(IllegalArgumentException.class, () -> {mathFunctions.sumFrom1ThruN(-1);});
	}
}
