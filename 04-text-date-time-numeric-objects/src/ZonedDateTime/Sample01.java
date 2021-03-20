
package ZonedDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Sample01 {

	public static void main(String[] args) {
		ZoneId london = ZoneId.of("Europe/London");
//		ZoneId london = ZoneId.of("GMT+2");
//		ZoneId london = ZoneId.of("UTC-05:00");
//		ZoneId london = ZoneId.systemDefault();
		ZoneId la = ZoneId.of("America/Los_Angeles");
		LocalDateTime someTime = LocalDateTime.of(2019, Month.APRIL, 1, 7, 14);
		ZonedDateTime londonTime = ZonedDateTime.of(someTime, london);
		ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
		
		System.out.println("london is "+ london);
		System.out.println("la is "+ la);
		System.out.println("someTime is "+ someTime);
		System.out.println("londonTime is "+ londonTime);
		System.out.println("laTime is "+ laTime);

	}

}
