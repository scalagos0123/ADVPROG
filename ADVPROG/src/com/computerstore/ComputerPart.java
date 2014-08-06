package com.computerstore;

public abstract class ComputerPart {
	protected int SerialNo;
	protected String Manufacturer;
	protected double Price;
	
	public abstract void displayOtherSpecs();
	
	public int getSerialNo() {
		return SerialNo;
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


	public void displayCommonSpecs() {
		System.out.println(this.getSerialNo());
		System.out.println(this.getManufacturer());
		System.out.println(this.getPrice());
	}

}
