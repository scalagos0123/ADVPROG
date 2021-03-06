package com.computerstore;

public class OS extends ComputerPart {
	private String Name;

	public OS(int serialNo, String manufacturer, double price, 
			String name) {
		
		this.SerialNo = serialNo;
		this.Manufacturer = manufacturer;
		this.Price = price;
		this.Name = name;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void displayOtherSpecs(){ 
		System.out.println(this.getName());
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
		System.out.println(this.getSerialNo());
		System.out.println(this.getManufacturer());
		System.out.println(this.getPrice());
		System.out.println(this.getName());
	}
	}
