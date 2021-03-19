package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Sample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime thisTime = LocalTime.now();
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("toda is "+ today);
		System.out.println("this time is "+ thisTime);
		System.out.println("current date and time is "+ currentDateTime);
		
		LocalDate someDay = LocalDate.of(2019, Month.APRIL, 1);
		LocalTime someTime = LocalTime.of(10, 6);
		LocalDateTime otherDateTime = LocalDateTime.of(2019, Month.MARCH, 31, 23, 29);
		System.out.println("some day is "+ someDay);
		System.out.println("some time is "+ someTime);
		System.out.println("other date time is "+ otherDateTime);
		
		LocalDateTime someDateTime = someDay.atTime(someTime);
		LocalDate whatWasTheDate = someDateTime.toLocalDate();
		System.out.println("some date time is "+ someDateTime);
		System.out.println("what was the date is "+ whatWasTheDate);
	}

}
