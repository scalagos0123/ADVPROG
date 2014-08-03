package com.computerstore;

public class Peripheral extends ComputerPart {
	private double Latency;
	
	public Peripheral() {
		Mouse mouse = new Mouse();
		Keyboard keyboard = new Keyboard();
	}
	public double getLatency() {
		return Latency;
	}

	public void setLatency(double latency) {
		Latency = latency;
	}
}
