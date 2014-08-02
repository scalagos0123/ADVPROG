import java.util.*;
public class ChocolateBread extends SlicedBread {
	private static int counter = 0;
	
	public ChocolateBread() {
		super();
		this.ingredients = new ArrayList<Ingredients>();
		Chocolate chocolate = new Chocolate();
		ingredients.add(chocolate);
	}
	
	protected void incrementCounter() {
		ChocolateBread.counter++;
	}
	
	public int getCounter() {
		return ChocolateBread.counter;
	}
	
}
