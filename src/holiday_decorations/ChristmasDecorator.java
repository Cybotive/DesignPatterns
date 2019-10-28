package holiday_decorations;
//Joshua Lini 10-23-19
public abstract class ChristmasDecorator implements ChristmasItem {
	
	private ChristmasItem decoratedItem;
	
	public ChristmasDecorator(ChristmasItem CItem) {
		if(CItem == null) { throw new IllegalArgumentException("CItem may not be null."); }
		
		this.decoratedItem = CItem;
	}
	
	public ChristmasItem getDecoratedItem() {
		return decoratedItem;
	}

}
