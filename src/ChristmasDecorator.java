//Joshua Lini 10-23-19
public abstract class ChristmasDecorator implements ChristmasItem {
	
	public double cost;
	public String name;
	
	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public String getName() {
		return name;
	}

}
