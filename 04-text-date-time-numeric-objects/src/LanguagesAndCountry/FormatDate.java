package LanguagesAndCountry;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import javax.swing.text.DateFormatter;

public class FormatDate {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, Month.APRIL, 1);
		Locale locale = new Locale("en", "GB");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd MMM uuuu", locale);
		String result = date.format(format);
		System.out.println("date formatted: " + result);
		
		date = LocalDate.parse("Tuesday 31 Mar 2020", format);
		locale = new Locale("pt");
		format = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(locale);
		result = date.format(format);
		System.out.println("##### parse #####\ndate formatted: " + result);
		
		

	}

}
