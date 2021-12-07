package com.ninja.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeDiffInYears {
	public static void main(String[] args) throws ParseException {
/*		String startDate = "2011 01 02";
		String passedDate = "2001 02 29"; */
		
		String startDate = "2011";
		String passedDate = "2001";
	
	//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy"); 
		 Date date1 = sdf.parse("2011");
		 Date date2 = sdf.parse("2001");

		float elapsedDays = date1.compareTo(date2);
		float diffInYears = elapsedDays /8;
		System.out.println(diffInYears); 
	}

}
