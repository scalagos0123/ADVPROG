package com.computerstore;

public class Monitor extends ComputerPart {
	private String Resolution;

	public String getResolution() {
		return Resolution;
	}

	public void setResolution(String resolution) {
		Resolution = resolution;
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
