package holiday_decorations;
//Joshua Lini 10-23-19
public abstract class Tree implements ChristmasItem {
	
	private double cost;
	private String name;
	
	protected Tree(double cost, String name) {
		if(cost < 0.0) { throw new IllegalArgumentException("cost must not be negative."); }
		if(name == null) { throw new IllegalArgumentException("Tree must have a name."); }
		
		this.cost = cost;
		this.name = name;
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
