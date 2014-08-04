package com.computerstore;

public class Monitor extends ComputerPart {
	private String Resolution;

	public String getResolution() {
		return Resolution;
	}

	public void setResolution(String resolution) {
		Resolution = resolution;
	}
	public void displayCommonSpecs() {
		System.out.println(this.getSerialNo());
		System.out.println(this.getManufacturer());
		System.out.println(this.getPrice());
	}
	public void displayOtherSpecs(){ 
		System.out.println(this.getResolution());
	}
}
