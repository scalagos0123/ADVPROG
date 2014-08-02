package com.gardenia;
import java.util.ArrayList;

public class SlicedBread {
	private static int counter = 0;
	private int slice;
	protected ArrayList<Ingredients> ingredients;
	
	public SlicedBread () {
		this.ingredients = new ArrayList<Ingredients>();
		
		Flour flour = new Flour();
		Egg egg = new Egg();
		Yeast yeast = new Yeast();
		Water water = new Water();
		
//		Chocolate chocolate = new Chocolate();
//		Cherry cherry = new Cherry();
//		Butterscotch butterscotch = new Butterscotch();
//		Wheat wheat = new Wheat();
//		Raisin raisin = new Raisin();
		
		ingredients.add(flour);
		ingredients.add(water);
		ingredients.add(egg);
		ingredients.add(yeast);
		
		incrementCounter();
	}
	
	protected void incrementCounter() {
		SlicedBread.counter++;
	}
	
	public static int getCounter() {
		return SlicedBread.counter;
	}
	
	public void purchase() {
		SlicedBread.counter++;
	}
	
	public void purchase(int x) {
		SlicedBread.counter += x;
	}
	
	public void displayIngredients() {
		for (Ingredients i : this.ingredients) {
			System.out.println(i.getClass().getName());
		}
	}
	
	public int slice() {
		this.slice = 20;
		
		return slice + 1;
	}
	
	public int slice(int slices) {
		this.slice = slices;
		
		return slice + 1;
	}
	
	
}
