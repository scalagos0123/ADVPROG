
public class Flour extends Ingredients {
	private static int counter = 0;
	
	public Flour() {
		Flour.counter++;
	}

	@Override
	public void displayFlavor() {
		System.out.println("Bland");
		
	}
}
