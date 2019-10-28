//Joshua Lini 10-27-19
import java.util.Stack;
import holiday_decorations.*;

public class TreeTester {

	public static void main(String[] args) {
		ChristmasItem fraserTree = new FraserFir();
		ChristmasDecorator decoratedFraser = new Ruffles(fraserTree);
		ChristmasDecorator decoratedFraserTwo = new Ruffles(decoratedFraser);
		
		printTree(fraserTree);
		printTree(decoratedFraser);
		printTree(decoratedFraserTwo);
	}
	
	/*private static void printTree(ChristmasItem treeObj) {
		System.out.println(treeObj.getName() + " without decorations costs $" + treeObj.getCost());
	}*/
	
	private static void printTree(ChristmasItem decoratedTree) {
		Stack<String> printStack = new Stack<String>();
		double totalCost = 0.0;
		
		try {
			while(true) {
				printStack.add(((ChristmasDecorator)decoratedTree).getName());
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
		
		for(String s : printStack) {
			System.out.print(", " + s);
		}
		
		System.out.println(" costs $" + (totalCost + decoratedTree.getCost()));
	}

}
