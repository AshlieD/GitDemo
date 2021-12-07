package com.ninja.training;

import java.util.Arrays;

public class Pet_Arrays {
	public static void main(String[] args) {
		String[] petAnimal = { "Fish", "Parrot", "Bunny", "Cat", "Dog" };
		String petNameArray[] = { "Baby Shark", "EverGreen", "Hoppity", "Meow", "Spott" };
		int petWeight[] = { 200, 750, 3500, 5000, 10000 };
		int noOfLimbs[] = { 0, 2, 3, 4, 4 };
		
		int index = Arrays.binarySearch(petAnimal, "Bunny");
		System.out.println("Index is : " + index);
		int bunnyWeight = petWeight[index];
		System.out.println("Bunny Weight is : " + bunnyWeight);
		
		System.out.println("\nFOR LOOP");
		for (int position = 0; position < petNameArray.length; position++) {
			System.out.println("Pet Animal Name at Index " + position + " is : " + petNameArray[position]);
		} // End of For Loop

		System.out.println("\nFOR EACH LOOP");
		for (String individualPetName : petNameArray) {
			System.out.println("Pet Name is : " + individualPetName);
		} // End of For Each Loop
	}// End of method main
}// End of class
