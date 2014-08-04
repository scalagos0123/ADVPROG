package com.computerstore;

public class Keyboard extends Peripheral {
	private String Type;

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public void displayCommonSpecs() {
		System.out.println(this.getSerialNo());
		System.out.println(this.getManufacturer());
		System.out.println(this.getPrice());
	}
	public void displayOtherSpecs(){ 
		System.out.println(this.getType());
	}
	
	public void setPrice(double price) {
		this.Price = price;
	}
	
	public void setSerialNo(int SerialNo) {
		this.SerialNo = SerialNo;
	}
	
	public void setManufacturer(String Manufacturer) {
		this.Manufacturer = Manufacturer;
	}
	
	public void displayPartSpecs() {
		System.out.println(getSerialNo());
		System.out.println(getManufacturer());
		System.out.println(getPrice());
		System.out.println(getType());
	}
}
