package com.ninja.training;

import java.util.Scanner;

public class Pet_Switch {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		// Using scanner for getting input from the user
		System.out.println("Enter the number of limbs and i will guess your pet: ");
		int noOfLegs = scr.nextInt();
		scr.close();
		
		switch(noOfLegs) {
		case 0:
			System.out.println("Let me guess.. you have a fish.");
			break;
		
		case 2:
			System.out.println("Let me guess.. you have a parrot.");
			break;
		
		case 3:
			System.out.println("Let me guess.. you have a bunny.");
			break;
		
		case 4:
			System.out.println("Let me guess.. you have a dog or cat.");
			break;
		
		default: 
			System.out.println("Oh Sorry!! i cant guess.");
		
		}
		

	}
}
