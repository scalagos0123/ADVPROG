<<<<<<< HEAD
package com.computerstore;

public class CPU extends ComputerPart {
	private String CoreModel;
	
	public String getCoreModel() {
		return CoreModel;
	}

	public void setCoreModel(String coreModel) {
		CoreModel = coreModel;
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
	
	public void displayCommonSpecs() {
		System.out.println(getSerialNo());
		System.out.println(getManufacturer());
		System.out.println(getPrice());
	}

	public void displayOtherSpecs(){ 
		System.out.println(getCoreModel());
	}
	
}
=======
package com.computerstore;

public class CPU extends ComputerPart {
	private String CoreModel;
	
	public String getCoreModel() {
		return CoreModel;
	}

	public void setCoreModel(String coreModel) {
		CoreModel = coreModel;
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
	
	public void displayCommonSpecs() {
		System.out.println(getSerialNo());
		System.out.println(getManufacturer());
		System.out.println(getPrice());
	}

	public void displayOtherSpecs(){ 
		System.out.println(getCoreModel());
	}
	
	public void displayPartSpecs() {
		System.out.println(getSerialNo());
		System.out.println(getManufacturer());
		System.out.println(getPrice());
		System.out.println(getCoreModel());
	}
}
>>>>>>> origin/master
