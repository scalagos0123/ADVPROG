package com.computerstore;

public class Monitor extends ComputerPart {
	private String Resolution;

	public Monitor(int serialNo, String manufacturer, double price, 
			String resolution) {
		
		this.SerialNo = serialNo;
		this.Manufacturer = manufacturer;
		this.Price = price;
		this.Resolution = resolution;
	}
	
	public String getResolution() {
		return Resolution;
	}

	public void setResolution(String resolution) {
		Resolution = resolution;
	}

	public void displayOtherSpecs(){ 
		System.out.println(this.getResolution());
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
		System.out.println(this.getResolution());
	}
}
