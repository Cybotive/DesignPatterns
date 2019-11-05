//Joshua Lini 11-4-19
//TODO description
package fraction;

public class Fraction {
	
	private int numerator;
	private int denominator;

	public Fraction(int num, int den) {		
		if(den == 0) { throw new IllegalArgumentException("The denominator with the value of 0 is not permitted"); }
		
		if(den < 0) {
			den *= -1;
			num *= -1;
		}
		
		int gcd = getGcd(num, den);
		
		numerator = num / gcd;
		denominator = den / gcd;
	}
	
	private int getGcd(int num, int den) {
		int gcd = num;
		if (den > num) {
			gcd = den;
		}
		
		if(num < 0) {
			num *= -1;
		}
		
		while(num % (gcd-1) == 0 && den % (gcd-1) == 0)//TODO WIP true/false is backwards
		{
			gcd--;
		}
		
		return gcd;
	}

	public int getNum() {
		return numerator;
	}

	public int getDen() {
		return denominator;
	}

	public int compareTo(Fraction fraction) {
		// TODO Auto-generated method stub
		return -1;
	}

	public Fraction add(Fraction fraction) {
		// TODO Auto-generated method stub
		return null;
	}

	public Fraction multiply(Fraction fraction) {
		// TODO Auto-generated method stub
		return null;
	}

	public double realValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//TODO Equals and HashCode

}