package holiday_decorations;
//Joshua Lini 10-28-19
public class Star extends ChristmasDecorator { //TODO Add only-one functionality

	private double cost;
	private String name;

	public Star(ChristmasItem CItem){
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
