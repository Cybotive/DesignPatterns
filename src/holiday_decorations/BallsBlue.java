package holiday_decorations;
//Joshua Lini 10-28-19
public class BallsBlue extends ChristmasDecorator {

	private double cost;
	private String name;

	public BallsBlue(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 2.0;
		this.name = "Balls Blue";
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
