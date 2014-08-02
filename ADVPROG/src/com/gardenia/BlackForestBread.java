package com.gardenia;

public class BlackForestBread extends SlicedBread {
	private static int counter = 0;
	public BlackForestBread() {
		super();
		Chocolate chocolate = new Chocolate();
		Cherry cherry = new Cherry();
		ingredients.add(chocolate);
		ingredients.add(cherry);
	}
	
	protected void incrementCounter() {
		BlackForestBread.counter++;
	}
	
	public static int getCounter() {
		return BlackForestBread.counter;
	}
}
