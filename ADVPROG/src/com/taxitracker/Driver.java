package com.taxitracker;

public class Driver {
	private String firstName;
	private String lastName;
	private int money;
	
	public Driver(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.money = 1800;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
