package com.ninja.training;

import java.util.Scanner;

public class Pet_Decisions {
	public static void main(String[] args) {
		Scanner scr =  new Scanner(System.in);
		
		//Using scanner for getting input from the user
		System.out.println("Enter the number of limbs and i will guess your pet: ");
		int noOflimbs = scr.nextInt();
		scr.close();
		
		//If
		System.out.println("\nIF STATEMENT");
		if(noOflimbs >= 0 && noOflimbs <= 4 && !(noOflimbs == 1)) {
			System.out.println("You have a pet with " +noOflimbs + " limbs.");
		}
		
		//If Else (Nested if)
		System.out.println("\nIF ELSE STATEMENT");
		if(noOflimbs >= 0 && noOflimbs <= 4 && !(noOflimbs == 1)) {
			System.out.println("You have a pet with " +noOflimbs + " limbs.");
		} else 
		{
			System.out.println(" Sorry, I could not find a pet with "+noOflimbs+" limbs");

		}
		 
		// If Else If
		//With just 1 LOC, this bracket is not necessary. But its best practice to use brackets always to avoid unintentional bugs.
		System.out.println("\nIF ELSE IF STATEMENT");
		
		if(noOflimbs == 0) {
			System.out.println("Your pet is a fish.");
		} else if(noOflimbs == 2) {
			System.out.println("Your pet is a parrot.");
		} else if(noOflimbs == 3) {
			System.out.println("Your pet is a bunny.");
		} else if(noOflimbs == 4) System.out.println("Your pet is a dog or a cat.");
		else {
			System.out.println("Sorry i could not find a pet with " + noOflimbs + " limbs.");
		}
		
		
		// Ternary Operator

		System.out.println("\nTERNARY / SHORTHAND IF STATEMENT");
		boolean isDogOrFish = (noOflimbs == 4 || noOflimbs == 0) ? true : false;
		if (isDogOrFish)
		System.out.println(" Yes!!! You have a Dog or a Fish");
		else
		System.out.println(" Oh No!! You do not have a pet dog or a fish!");
	}

}
