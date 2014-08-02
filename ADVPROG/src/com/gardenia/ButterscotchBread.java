package com.gardenia;

public class ButterscotchBread extends SlicedBread {
	private static int counter = 0;
	public ButterscotchBread() {
		super();
		Butterscotch butterscotch = new Butterscotch();
		ingredients.add(butterscotch);
	}
	
	protected void incrementCounter() {
		ButterscotchBread.counter++;
	}
	
	public static int getCounter() {
		return ButterscotchBread.counter;
	}
}
