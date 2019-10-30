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
		return 0;//TODO
	}
}
