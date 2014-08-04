package com.computerstore;

public class Mouse extends Peripheral {
	private int DPI;

	public int getDPI() {
		return DPI;
	}

	public void setDPI(int dPI) {
		DPI = dPI;
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
}
