package com.pcbundle;

public class Keyboard {
	private String sn;
	private String manufacturer;
	private double price;
	private String latency;
	
	public String getSn() {
		return sn;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public String getLatency() {
		return latency;
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
	public void setLatency(String latency) {
		this.latency = latency;
	}
	
}
