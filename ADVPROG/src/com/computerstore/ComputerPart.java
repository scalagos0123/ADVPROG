package com.computerstore;

public abstract class ComputerPart {
	protected int SerialNo;
	protected String Manufacturer;
	protected double Price;
	
	public int getSerialNo() {
		return SerialNo;
	}
<<<<<<< HEAD
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
=======
	
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
	
>>>>>>> b1904d87ff8f3d34dcffdad198749ed7bc340100
	public void setPrice(double price) {
		Price = price;
	}
}
