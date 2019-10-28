package holiday_decorations;
//Joshua Lini 10-27-19
public class Ruffles extends ChristmasDecorator {
	
	private double cost;
	private String name;

	public Ruffles(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 1.0;
		this.name = "Ruffles";
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
