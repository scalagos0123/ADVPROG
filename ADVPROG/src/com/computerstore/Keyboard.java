package com.computerstore;

public class Keyboard extends Peripheral {
	private String Type;

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
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
