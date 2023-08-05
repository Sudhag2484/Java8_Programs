package in.sudha;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {

	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2021, 06, 01);
		System.out.println(of);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate plusMonths = date.plusMonths(04);
		System.out.println(plusMonths);
		System.out.println(date.plusYears(2));
		System.out.println(date.getDayOfYear());
		LocalDate minusDays = date.minusDays(15);
		System.out.println(minusDays);
		
		boolean leapYear = LocalDate.parse("2024-05-08").isLeapYear();
		System.out.println("Leap year "+leapYear);
		
		boolean before = LocalDate.parse("2027-08-08").isBefore(date);
		System.out.println(before);
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		Period between = Period.between(LocalDate.parse("2023-08-06"),LocalDate.now());
		System.out.println(between);
		
		Duration between2 = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(between2);
		
	}

}