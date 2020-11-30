//Joshua Lini 10-27-19
import java.util.Stack;
import holiday_decorations.*;

public class TreeTester {

	public static void main(String[] args) {
		treeTestA();
		treeTestB();
	}
	
	private static void printTree(ChristmasItem decoratedTree) {
		Stack<String> printStack = new Stack<String>();
		double totalCost = 0.0;
		
		try {
			while(true) {
				printStack.push(((ChristmasDecorator)decoratedTree).getName());
				totalCost += ((ChristmasDecorator)decoratedTree).getCost();
				
				decoratedTree = ((ChristmasDecorator)decoratedTree).getDecoratedItem();
			}
		}
		catch (ClassCastException e) {
			//move on, we hit the base Tree
		}
		
		if(printStack.size() == 0) {
			System.out.print(decoratedTree.getName() + " tree with no decorations");
		}
		else {
			System.out.print(decoratedTree.getName() + " tree decorated with");
		}
		
		for(; 0 < printStack.size();) {
			System.out.print(", " + printStack.pop());
		}
		
		System.out.println(" costs $" + (totalCost + decoratedTree.getCost()));
	}
	
	private static void treeTestA() {
		System.out.println("Start of treeTestA");
		ChristmasItem fraserTree = new FraserFir();
		printTree(fraserTree);
		
		fraserTree = Star.wrap(fraserTree);
		printTree(fraserTree);
		
		fraserTree = new Ruffles(fraserTree);
		printTree(fraserTree);
		
		fraserTree = Star.wrap(fraserTree); //should return its input
		printTree(fraserTree);
		
		fraserTree = new BallsRed(fraserTree);
		printTree(fraserTree);
		
		fraserTree = new BallsSilver(fraserTree);
		printTree(fraserTree);
		
		fraserTree = new BallsBlue(fraserTree);
		printTree(fraserTree);
		
		fraserTree = Star.wrap(fraserTree);
		printTree(fraserTree);
		
		fraserTree = new Ribbons(fraserTree);
		printTree(fraserTree);
		
		fraserTree = new Lights(fraserTree);
		printTree(fraserTree);
		
		fraserTree = new Leds(fraserTree);
		printTree(fraserTree);
		
		fraserTree = Star.wrap(fraserTree);
		printTree(fraserTree);
	}
	
	private static void treeTestB() {
		System.out.println("Start of treeTestB");
		ChristmasItem[] treeArray = new ChristmasItem[4];
		
		treeArray[0] = new Leds(new FraserFir());
		treeArray[1] = new Leds(new DouglasFir());
		treeArray[2] = new Leds(new BalsamFir());
		treeArray[3] = new Leds(new CoBlueSpruce());
		
		for(ChristmasItem CItem : treeArray) {
			printTree(CItem);
		}
	}

}
