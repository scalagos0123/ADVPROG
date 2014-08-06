package com.computerstore;

import java.util.ArrayList;

public class Bundle {
	private ArrayList<ComputerPart> bundle;
	
	public Bundle() {
		this.bundle = new ArrayList<ComputerPart>();
	}
	
	public void addComputerPart(ComputerPart part) {
		this.bundle.add(part);
	}
	
	public ArrayList<ComputerPart> getBundle() {
		return bundle;
	}
	
	public int bundleSize() {
		return bundle.size();
	}

	public void setBundle(ArrayList<ComputerPart> bundle) {
		this.bundle = bundle;
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < this.bundle.size(); i++) {
			totalPrice += this.bundle.get(i).getPrice();
		}
		
		return totalPrice;
	}
	
	public void displayPartsSpecs() {
		for (int i = 0; i < this.bundle.size(); i++) { 
			this.bundle.get(i).displayPartsSpecs();

		}
	}
}
