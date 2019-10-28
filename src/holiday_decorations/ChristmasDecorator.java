package holiday_decorations;
//Joshua Lini 10-23-19
public abstract class ChristmasDecorator implements ChristmasItem {
	
	private double cost;
	private String name;
	private ChristmasItem CItem;
	
	public ChristmasDecorator(ChristmasItem CItem) {
		if(CItem == null) { throw new IllegalArgumentException("CItem may not be null."); }
		
		this.CItem = CItem;
	}
	
	public abstract ChristmasItem getDecoratedItem();

}
