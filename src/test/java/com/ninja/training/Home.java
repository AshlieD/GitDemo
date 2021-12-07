package com.ninja.training;

public class Home {

	private String name;
	private double area;
	private int noOfRooms;
	private int noOfFloors;
	
	public void setName(String homeName) {
		this.name = homeName;
	}
	
	public void setArea(double homeArea) {
		this.area = homeArea;
	}
	
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	
	public String getName() {
		return name;
	}
	
	public double getArea() {
		return area;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}
	
	public void cleanUp() {
		System.out.println(name + " is cleaned");
	}
	
	public void paintIt() {
		System.out.println(name + " is painted");
	}
	
}
