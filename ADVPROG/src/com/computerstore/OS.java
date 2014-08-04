package com.computerstore;

public class OS extends ComputerPart {
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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
