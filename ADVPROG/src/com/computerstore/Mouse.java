<<<<<<< HEAD
package com.computerstore;

public class Mouse extends Peripheral {
	private int DPI;

	public int getDPI() {
		return DPI;
	}

	public void setDPI(int dPI) {
		DPI = dPI;
	}

	public void displayCommonSpecs() {
		System.out.println(this.getSerialNo());
		System.out.println(this.getManufacturer());
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
}
=======
package com.computerstore;

public class Mouse extends Peripheral {
	private int DPI;

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
>>>>>>> origin/master
