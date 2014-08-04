package com.computerstore;

public class Keyboard extends Peripheral {
	private String Type;

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
<<<<<<< HEAD
	public void displayCommonSpecs() {
		System.out.println(this.getSerialNo());
		System.out.println(this.getManufacturer());
		System.out.println(this.getPrice());
	}
	public void displayOtherSpecs(){ 
		System.out.println(this.getType());
=======
	
	public void setPrice(double price) {
		this.Price = price;
	}
	
	public void setSerialNo(int SerialNo) {
		this.SerialNo = SerialNo;
	}
	
	public void setManufacturer(String Manufacturer) {
		this.Manufacturer = Manufacturer;
>>>>>>> origin/master
	}
}
