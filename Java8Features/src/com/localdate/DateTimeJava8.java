package com.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeJava8 {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate dob = LocalDate.of(2000, 05, 19);
		System.out.println(dob);
		
		LocalDate yest = LocalDate.parse("2000-08-19");
		System.out.println(yest);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfYear());
		
		System.out.println(today.plusDays(1));
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow.getDayOfWeek());
		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday.getDayOfWeek());
	
		LocalDate leap = LocalDate.of(2023, 01, 01);
		System.out.println(leap.isLeapYear());
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
		
		System.out.println(today);
		System.out.println(today.format(pattern));
		System.out.println(LocalDate.of(2025,8,22).format(pattern));
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.toLocalTime());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
