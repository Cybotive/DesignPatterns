package holiday_decorations;
//Joshua Lini 10-28-19
public class BallsSilver extends ChristmasDecorator {

	private double cost;
	private String name;

	public BallsSilver(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 3.0;
		this.name = "Balls Silver";
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
