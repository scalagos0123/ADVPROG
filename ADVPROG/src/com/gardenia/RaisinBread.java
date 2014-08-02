package com.gardenia;
import java.util.ArrayList;


public class RaisinBread extends SlicedBread {
	private static int counter = 0;
	
	public RaisinBread() {
		super();
		Raisin raisin = new Raisin();
		this.ingredients = new ArrayList<Ingredients>();
		ingredients.add(raisin);
	}
	
	protected void incrementCounter() {
		RaisinBread.counter++;
	}
	
	public int getCounter() {
		return RaisinBread.counter;
	}
}
