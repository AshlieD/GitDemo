package com.ninja.training;

public class DemoHome {

	public static void main(String[] args) {
		
		Home home1 = new Home();
		//Home home1 = null;
		home1.setName("The Barn");
		home1.setArea(3000);
		home1.setNoOfRooms(5);
		home1.setNoOfFloors(2);
		
		System.out.println("Home Details: ");
		System.out.println("Name: " + home1.getName());
		System.out.println("Area: " + home1.getArea());
		System.out.println("No. of rooms: " + home1.getNoOfRooms());
		System.out.println("No. of floors: " + home1.getNoOfFloors());
		System.out.println("-------------------------------------");
		
		Home home2 = new Home();
		home2.setName("The BrickHouse");
		home2.setArea(2000);
		home2.setNoOfRooms(3);
		home2.setNoOfFloors(1);
		
		System.out.println("Home Details: ");
		System.out.println("Name: " + home2.getName());
		System.out.println("Area: " + home2.getArea());
		System.out.println("No. of rooms: " + home2.getNoOfRooms());
		System.out.println("No. of floors: " + home2.getNoOfFloors());
		System.out.println("-------------------------------------");
		
		home1.cleanUp();
		home2.paintIt();
		
	}
}
