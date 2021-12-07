package com.ninja.training;

import java.util.Scanner;

public class MovieNameUserInput {
	static int movieNum[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	static String movieName[] = { "Harry Potter and the Philosopher's Stone", "Harry Potter and the Chamber of Secrets",
			"Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
			"Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince",
			"Harry Potter and the Deathly Hallows – Part 1", "Harry Potter and the Deathly Hallows – Part 2" };
	static int releaseYear[] = {2001, 2002, 2004, 2005, 2007, 2009, 2010, 2011};
	
public static void main(String[] args) {
	
	Scanner scr = new Scanner(System.in);
	// Using scanner for getting input from the user
	System.out.println("Select a movie by entering numbers from(1- 8) ");
	int inputCount = scr.nextInt();
	scr.close();
	
	int index = inputCount - 1;
	System.out.println(movieName[index]);
	
}
}
