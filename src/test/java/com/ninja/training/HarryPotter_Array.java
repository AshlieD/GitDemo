package com.ninja.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.*;
import java.util.Date;
import java.util.Scanner;

public class HarryPotter_Array {
	static int movieNum[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	static String movieName[] = { "Harry Potter and the Philosopher's Stone", "Harry Potter and the Chamber of Secrets",
			"Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
			"Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince",
			"Harry Potter and the Deathly Hallows – Part 1", "Harry Potter and the Deathly Hallows – Part 2" };
	static int releaseYear[] = {2001, 2002, 2004, 2005, 2007, 2009, 2010, 2011};
	
	
	public static void main(String[] args) throws ParseException {
		HarryPotter_Array obj = new HarryPotter_Array();
		
		//How many years elapsed between first and last movie of Harry Potter?
		int timeElapsed = releaseYear[7] - releaseYear[0];
		System.out.println(timeElapsed);
		
		
		//Calculate using formula and print answer in years and months.
		int totalNumOfMovies = movieNum.length;
		System.out.println(totalNumOfMovies);
		float yearsMovRelease = (2011 - 2001)/(float)totalNumOfMovies;
		System.out.println(yearsMovRelease);
		
		//Period period = Period.ofMonths().normalized();
		//Extract the number of years and of months.

		//int years = period.getYears();
		//int months = period.getMonths();

		
		//Date date = new Date();
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		 Date d1 = sdf.parse("2011");
         Date d2 = sdf.parse("2001");
		
         long difference_In_Time = d2.getTime() - d1.getTime();
		System.out.println(difference_In_Time);*/
		
		float difference_In_Years = (yearsMovRelease / (1000l * 60 * 60 * 24 * 365));
		System.out.println(difference_In_Years);
		//float diff = (difference_In_Years/8);
		//System.out.println(diff);*/
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy"); Date date1 =
		 * sdf.parse("2011"); Date date2 = sdf.parse("2001");
		 * 
		 * System.out.println("date1 : " + sdf.format(date1));
		 * System.out.println("date2 : " + sdf.format(date2));
		 * 
		 * 
		 * long yearsMovRelease = date1.compareTo(date2);
		 * System.out.println(yearsMovRelease);
		 */
		
		//Get a number as input from user and print the name of the movie.
		//obj.getMovieName();
		
		//If user enters input as 1, print ”First movie”,  8, print “Last movie”. For anything else, print “Not First or Last movie”
		//obj.FirstORLastMovie();
		
		//Keep getting input from user and print the name of the movie till the user enters an invalid input.
		//obj.keepGettingInput();
		
		//Create a single for loop to print all the data in the format [Movie Number, Movie name, Year Of Release]
		//obj.getAllDataSameFormat();
		
		//Keep getting input from user  for 5 times. Store all the inputs given by the user in an array.
		//Loop through the array using For Each loop and print all the movie names entered by the user.
		//obj.storeUserInputArray();
	
	}
	
	public void getMovieName() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Select a movie by entering numbers from(1- 8): ");
		int inputCount = scr.nextInt();
		int index = inputCount - 1;
		
		scr.close();
		System.out.println(movieName[index]);
		
	}
	
	public void FirstORLastMovie() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Select a movie by entering numbers from(1- 8): ");
		int inputCount = scr.nextInt();
		
		if (inputCount == 1) {
			System.out.println("First Movie");
		} else if (inputCount == 8) {
			System.out.println("Last Movie");
		} else System.out.println("Not First or Last Movie");
		
		scr.close();
	}
	
	public void keepGettingInput() {
		Scanner scr = new Scanner(System.in);
		int inputCount = 0;
		
		while(inputCount >=0 && inputCount < 8) {
			System.out.println("Select a movie by entering numbers from(1- 8): ");
		    inputCount = scr.nextInt();
		    int index = inputCount - 1;
			
			if(index <= 7) {
			System.out.println(movieName[index]);
			System.out.println();
			} else System.out.println("No more Harry Potter Movies");
		}
		scr.close();
			
	}
	
	public void getAllDataSameFormat() {
		
		for(int i=0; i<movieNum.length; i++) {
			System.out.println(movieNum[i] + ", " + movieName[i] + ", " + releaseYear[i]);
		}
	}
	
	public void storeUserInputArray() {
		int inputCount[] = new int[5];
		int maxCount = 0 ;
		Scanner scr = new Scanner(System.in);
		
		
		while(maxCount < 5) {
			
		System.out.println("Enter any number from (1 - 8) we will get you the movie name: ");
		inputCount[maxCount] = scr.nextInt();
		maxCount ++;
		
		}
		
		scr.close();
		for(int single: inputCount) {
			System.out.println(movieName[single -1]);
		}
	}
}
