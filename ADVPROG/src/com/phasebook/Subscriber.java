package com.phasebook;
import java.util.*;

public class Subscriber {
	private String name;
	private String specialty;
	private double rating;
	private ArrayList<Subscriber> devWatch;
	
	public Subscriber (String name, String specialty) {
		this.name = name;
		this.specialty = specialty;
		this.rating = 0;
		this.devWatch = new ArrayList<Subscriber>();
	}
	
	public void upVote(Subscriber s) {
		double amountToAdd = (5 - s.getRating()) * 0.05;
		
		if (s.getRating() > 5) {
			amountToAdd = 0;
		}
		
		s.setRating(s.getRating() + amountToAdd);
	}
	
	public void downVote(Subscriber s) {
		double amountToDeductFromOtherSub = (5 - s.getRating() * 0.03);
		double amountToDeductFromSelf = (5 - this.rating * 0.02);
		
		if (s.getRating() < 0 || this.rating < 0) {
			amountToDeductFromOtherSub = 0;
			amountToDeductFromSelf = 0;
		}
		
		this.rating = this.rating - amountToDeductFromSelf;
		s.setRating(amountToDeductFromOtherSub);
	}
	
	public void addWatchers(Subscriber s) {
		this.devWatch.add(s);
		
	}

	public String getName() {
		return name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public double getRating() {
		return rating;
	}

	public ArrayList<Subscriber> getDevWatch() {
		return devWatch;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setDevWatch(ArrayList<Subscriber> devWatch) {
		this.devWatch = devWatch;
	}

}
