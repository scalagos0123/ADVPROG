package com.computerstore;

public class CPU extends ComputerPart {
	private String CoreModel;
	
	public CPU(int serialNo, String manufacturer, double price, 
			String coremodel) {
		
		this.SerialNo = serialNo;
		this.Manufacturer = manufacturer;
		this.Price = price;
		this.CoreModel = coremodel;
	}
	
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
