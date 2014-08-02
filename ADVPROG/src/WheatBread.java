
public class WheatBread extends SlicedBread {
	private static int counter = 0;
	public WheatBread() {
		super();		
		Wheat wheat = new Wheat();
		this.ingredients.remove(0);
		this.ingredients.add(wheat);
	}
	
	protected void incrementCounter() {
		WheatBread.counter++;
	}
	
	public static int getCounter() {
		return WheatBread.counter;
	}
}
