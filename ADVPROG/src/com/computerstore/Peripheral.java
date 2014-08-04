package com.computerstore;

public abstract class Peripheral extends ComputerPart {
	private double Latency;
	
	public double getLatency() {
		return Latency;
	}

	public void setLatency(double latency) {
		Latency = latency;
	}
	
}
