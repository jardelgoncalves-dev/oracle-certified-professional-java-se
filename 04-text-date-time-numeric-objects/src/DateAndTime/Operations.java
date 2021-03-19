package DateAndTime;

import java.time.LocalDateTime;

public class Operations {

	public static void main(String[] args) {
		// LocalDateTime, LocalTime e LocalDate sao imutaveis
		LocalDateTime current = LocalDateTime.now();
		LocalDateTime different = current.withMinute(14).withDayOfMonth(20).plusHours(12);
		int year = current.getYear();
		boolean  before = current.isBefore(different);
		System.out.println("current is " + current);
		System.out.println("different is " + different);
		System.out.println("year is " + year);
		System.out.println("before is " + before);
		
		

	}

}
