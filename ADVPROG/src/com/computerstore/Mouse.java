package com.computerstore;

public class Mouse extends Peripheral {
	private int DPI;

	public Mouse(int serialNo, String manufacturer, double price, 
			double latency, int dpi) {
		
		this.SerialNo = serialNo;
		this.Manufacturer = manufacturer;
		this.Price = price;
		this.setLatency(latency);
		this.DPI = dpi;
	}
	
	public int getDPI() {
		return DPI;
	}

	public void setDPI(int dPI) {
		DPI = dPI;
	}

	public void displayCommonSpecs() {
		System.out.println(this.getSerialNo());
		System.out.println(getManufacturer());
		System.out.println(this.getPrice());
	}
	public void displayOtherSpecs(){ 
		System.out.println(this.getDPI());
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
		System.out.println(this.getDPI());
	}
}
