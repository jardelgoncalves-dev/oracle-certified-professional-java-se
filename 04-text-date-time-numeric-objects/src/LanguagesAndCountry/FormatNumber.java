package LanguagesAndCountry;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumber {
	public static void main(String[] args) throws Exception {
		BigDecimal price = BigDecimal.valueOf(2.75);
		Double tax = 0.2;
		int quantity = 12345;
		Locale locale = new Locale("en", "GB");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		String formattedPrice =currencyFormat.format(price);
		String formattedTax = percentageFormat.format(tax);
		String formattedQuantity = numberFormat.format(quantity);
		
		System.out.println("price: " + formattedPrice 
				+ " tax: "+ formattedTax 
				+ "  quantity: " + formattedQuantity
		);
		
		
		// parse
		Double priceParse = (Double)currencyFormat.parse("£2.75");
		Double taxParse = (Double) percentageFormat.parse("20%");
		int quantityParse = numberFormat.parse("12,345").intValue();
		
		System.out.println("##### parse #####\nprice: " + priceParse 
				+ " tax: "+ taxParse 
				+ "  quantity: " + quantityParse
		);
	}
}
