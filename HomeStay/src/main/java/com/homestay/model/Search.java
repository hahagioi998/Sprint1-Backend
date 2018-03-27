package com.homestay.model;

import java.util.Date;

public class Search {
	private int noofGuests;
	private Date arrivalDate;
	private Date departureDate;
	private String city;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNoofGuests() {
		return noofGuests;
	}
	public void setNoofGuests(int noofGuests) {
		this.noofGuests = noofGuests;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

}
