//Joshua Lini 11-4-19
//TODO description
package fraction;

public class Fraction {
	
	private int numerator;
	private int denominator;

	public Fraction(int num, int den) {		
		if(den == 0) { throw new IllegalArgumentException("The denominator with the value of 0 is not permitted"); }
		
		if(den < 0) {
			denominator = den * -1;
			numerator = num * -1;
		}
		else {
			denominator = den;
			numerator = num;
		}
	}

	public Integer getNum() {
		return numerator;
	}

	public Integer getDen() {
		return denominator;
	}

	public Integer compareTo(Fraction fraction) {
		// TODO Auto-generated method stub
		return null;
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
