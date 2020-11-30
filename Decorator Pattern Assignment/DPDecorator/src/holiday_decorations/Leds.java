package holiday_decorations;
//Joshua Lini 10-28-19
public class Leds extends ChristmasDecorator {
	
	private double cost;
	private String name;

	public Leds(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 10.0;
		this.name = "LEDs";
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
