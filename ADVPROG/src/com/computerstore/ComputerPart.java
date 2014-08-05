package com.computerstore;

public abstract class ComputerPart {
	protected int SerialNo;
	protected String Manufacturer;
	protected double Price;
	
	public int getSerialNo() {
		return SerialNo;
	}
	
	public void displayCommonSpecs() {
		
	}
	
	public void displayOtherSpecs() {
		
	}

	
	public String getManufacturer() {
		return Manufacturer;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setSerialNo(int serialNo) {
		SerialNo = serialNo;
	}
	
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public void setPrice(double price) {
		Price = price;
	}
	
	public void displayPartsSpecs() {
		this.displayCommonSpecs();
		this.displayOtherSpecs();
	}
}
