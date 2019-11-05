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
		boolean otherGreaterDen = false;
		
		if(fraction.getDen() > this.getDen()) {
			otherGreaterDen = true;
		}
		
		double numTemp = this.getNum();
		double denTemp = this.getDen();
		
		if(otherGreaterDen) {
			numTemp = (numTemp / denTemp) * fraction.getDen();
			
			return (int)(Math.round(numTemp) - fraction.getNum());
		}
		else {
			numTemp = fraction.getNum();
			denTemp = fraction.getDen();
			
			numTemp = (numTemp / denTemp) * this.getDen();
			
			return (int)(Math.round(numTemp) - fraction.getNum());
		}
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
}
