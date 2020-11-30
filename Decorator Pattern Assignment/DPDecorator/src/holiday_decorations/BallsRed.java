package holiday_decorations;
//Joshua Lini 10-28-19
public class BallsRed extends ChristmasDecorator {

	private double cost;
	private String name;

	public BallsRed(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 1.0;
		this.name = "Balls Red";
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
