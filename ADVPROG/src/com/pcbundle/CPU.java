package com.pcbundle;

public class CPU {
	private String sn;
	private String manufacturer;
	private double price;
	private String coreModel;
	
	public String getSn() {
		return sn;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public String getCoreModel() {
		return coreModel;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCoreModel(String coreModel) {
		this.coreModel = coreModel;
	}
}
