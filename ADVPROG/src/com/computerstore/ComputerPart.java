package com.computerstore;

public class ComputerPart {
	protected int SerialNo;
	protected String Manufacturer;
	protected double Price;
	
	public ComputerPart() {
		
	}
	
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
}
