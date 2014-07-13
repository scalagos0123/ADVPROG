package com.taxitracker;

import java.util.*;

public class TaxiManager {
	private Driver driver;
	private Taxi taxi;
	private ArrayList<Taxi> taxiList;
	private ArrayList<Driver> driverList;
	private ArrayList<Driver> roster1;
	private ArrayList<Driver> roster2;
	private ArrayList<Taxi> taxiRoster1;
	
	public TaxiManager() {
		this.driver = driver;
		this.taxi = taxi;
		this.taxiList = new ArrayList<Taxi>();
		this.driverList = new ArrayList<Driver>();
		this.roster1 = new ArrayList<Driver>();
		this.roster2 = new ArrayList<Driver>();
		
	}

	public Driver getDriver() {
		return driver;
	}

	public Taxi getTaxi() {
		return taxi;
	}

	public ArrayList<Taxi> getTaxiList() {
		return taxiList;
	}

	public ArrayList<Driver> getDriverList() {
		return driverList;
	}

	public ArrayList<Driver> getRoster1() {
		return roster1;
	}

	public ArrayList<Driver> getRoster2() {
		return roster2;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}

	public void setTaxiList(ArrayList<Taxi> taxiList) {
		this.taxiList = taxiList;
	}

	public void setDriverList(ArrayList<Driver> driverList) {
		this.driverList = driverList;
	}

	public void setRoster1(ArrayList<Driver> roster1) {
		this.roster1 = roster1;
	}

	public void setRoster2(ArrayList<Driver> roster2) {
		this.roster2 = roster2;
	}
	
	public void hireDriver(String firstName, String lastName) {
		Driver d = new Driver(firstName, lastName);
		this.driverList.add(d);
		
		if (this.roster1.size() == this.roster2.size() || this.roster1.size() < this.roster2.size()) {
			roster1.add(d);
		} else if (this.roster1.size() > this.roster2.size()) {
			roster2.add(d);
		}
	}
	
	public void purchaseTaxi(String plateNo) {
		Taxi t = new Taxi(plateNo);
		this.taxiList.add(t);
	}
	
	public void startDay() {
		
	}
	
	public void endDay() {
		
	}
}
