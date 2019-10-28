package holiday_decorations;
//Joshua Lini 10-27-19
public class Lights extends ChristmasDecorator {
	
	private double cost;
	private String name;

	public Lights(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 5.0;
		this.name = "Lights";
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
