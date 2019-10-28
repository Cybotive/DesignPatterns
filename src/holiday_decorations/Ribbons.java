package holiday_decorations;
//Joshua Lini 10-27-19
public class Ribbons extends ChristmasDecorator {
	
	private double cost;
	private String name;

	public Ribbons(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 2.0;
		this.name = "Ribbons";
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
