package com.hexa.encap;

public class Flight {
	public static String companyName;
	private int noOfPassengers; 
	private String type; //economy class, business class 
	private String FlightName; 
	private int availableSeats; 
	private String source; 
	private String destination; 
	//default constructor 
	public Flight() { 
	super(); 
	// TODO Auto-generated constructor stub 
	}
	public Flight(int noOfPassengers, String type, String flightName, int availableSeats, String source,
			String destination) {
		super();
		this.noOfPassengers = noOfPassengers;
		this.type = type;
		FlightName = flightName;
		this.availableSeats = availableSeats;
		this.source = source;
		this.destination = destination;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Flight [noOfPassengers=" + noOfPassengers + ", type=" + type + ", FlightName=" + FlightName
				+ ", availableSeats=" + availableSeats + ", source=" + source + ", destination=" + destination + "]";
	} 
	
}
	