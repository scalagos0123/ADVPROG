package com.pcbundle;

public class Monitor {
	private String sn;
	private String manufacturer;
	private double price;
	private String resolution;
	
	public String getSn() {
		return sn;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public String getResolution() {
		return resolution;
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
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
}
