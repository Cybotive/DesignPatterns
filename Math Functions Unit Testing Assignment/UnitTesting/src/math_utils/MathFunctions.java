package math_utils;

public class MathFunctions {
	public int sumFrom1ThruN(int n) {
		if(n < 1) { throw new IllegalArgumentException("n may not be less than 1"); }
		
		int sum = 1;
		
		for(int i = 2; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public int power(int base, int exp) {
		if(base < 0 || exp < 0) { throw new IllegalArgumentException("base and/or exponent may not be negative"); }
		
		if(exp == 0) {
			return 1;
		}
		
		int result = base;
		
		for(int i = 1; i < exp; i++) {
			result *= base;
		}
		
		return result;
	}
}
