package java8;

import java.time.*;
public class DateTime {

	public static void main(String[] args) {
		//Date
		LocalDate today = LocalDate.now();
		System.out.println("Todays date: "+today);
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println("kolkata date: "+todayKolkata);
		LocalTime time = LocalTime.now();
		System.out.println("Time: "+time);
		
		LocalTime specificTime = LocalTime.of(12,20,25,40);
		System.out.println("Local Time: "+specificTime);
	}

}
