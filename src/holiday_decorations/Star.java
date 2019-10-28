package holiday_decorations;
//Joshua Lini 10-28-19
public class Star extends ChristmasDecorator {

	private double cost;
	private String name;

	private Star(ChristmasItem CItem){
		super(CItem);
		
		this.cost = 4.0;
		this.name = "Star";
	}
	
	public static ChristmasItem wrap(ChristmasItem CItem) {
		boolean hasStar = false;
		ChristmasItem temp = CItem;
		
		try {
			while(true) {
				if(temp.getName().equals("Star")) { //there could be a more dynamic way to do this, but this should be okay in this case
					hasStar = true;
					break;
				}
				temp = ((ChristmasDecorator)temp).getDecoratedItem();
			}
		}
		catch (ClassCastException e) {
			//move on, we hit the base Tree
		}
		
		if(hasStar == false) {
			return new Star(CItem);
		}
		else {
			System.out.println("Tree already has a star!");
			return CItem;
		}
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
