//Joshua Lini 10-23-19
public class FraserFir extends Tree {
	
	private double cost;
	private String name;
	
	public FraserFir() {
		cost = 35.0;
		name = "Fraser Fir";
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
