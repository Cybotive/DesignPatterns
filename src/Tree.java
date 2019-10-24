//Joshua Lini 10-23-19
public abstract class Tree implements ChristmasItem {
	
	private double cost;
	private String name;

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
