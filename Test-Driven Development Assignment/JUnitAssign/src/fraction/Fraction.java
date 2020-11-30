/*Joshua Lini 11-4-19
 * Description: This class is a container for fractions.
 * This class was built via test-driven-development.
 * This class includes methods for adding, multiplying, and other functionality.*/

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
		if(num < 0) {
			num *= -1;
		}
		
		if(den < 0) {
			den *= -1;
		}
		
		int gcd = 1;
		
		for(int i = 1; i <= den; i++) {
			if((double)num % i == 0 && (double)den % i == 0) {
				gcd = i;
			}
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
		int numThis = this.numerator * fraction.getDen();
		int numOther = fraction.getNum() * this.denominator;
		
		return numThis - numOther;
	}

	public Fraction add(Fraction fraction) {
		if(fraction == null) { throw new IllegalArgumentException("Cannot perform math operations on a null fraction object!"); }
		
		if(this.denominator == fraction.getDen()) {
			return new Fraction(this.numerator + fraction.getNum(), this.denominator);
		}
		
		int thisNum = this.numerator * fraction.getDen();
		int otherNum = fraction.getNum() * this.denominator;
		int denom = this.denominator * fraction.getDen();
		
		return new Fraction(thisNum + otherNum, denom);
	}

	public Fraction multiply(Fraction fraction) {
		if(fraction == null) { throw new IllegalArgumentException("Cannot perform math operations on a null fraction object!"); }
		
		return new Fraction(this.numerator * fraction.getNum(), this.denominator * fraction.getDen());
	}

	public double realValue() {
		return (double)this.numerator / this.denominator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
}
