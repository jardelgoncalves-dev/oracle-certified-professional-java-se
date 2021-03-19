package DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class InstantsDurationsAndPeriods {

	public static void main(String[] args) {
		// Instant, Period e Duration sao imutaveis
		LocalDate today = LocalDate.now();
		LocalDate  foolsDay = LocalDate.of(2019, Month.APRIL, 1);
		Instant timestamp = Instant.now();
		int nanoSecondsFromLastSecond = timestamp.getNano();
		Period howLong = Period.between(foolsDay, today);
		Duration twoHours = Duration.ofHours(2);
		long seconds = twoHours.minusMinutes(15).getSeconds();
		int days = howLong.getDays();
		System.out.println("today is " + today);
		System.out.println("fools day is " + foolsDay);
		System.out.println("timestamp is " + timestamp);
		System.out.println("nano seconds from last second is " + nanoSecondsFromLastSecond);
		System.out.println("how long is " + howLong);
		System.out.println("two hours is " + twoHours);
		System.out.println("seconds is " + seconds);
		System.out.println("days is " + days);

	}

}
