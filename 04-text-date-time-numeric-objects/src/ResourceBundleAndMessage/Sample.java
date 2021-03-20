package ResourceBundleAndMessage;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Sample {

	public static void main(String[] args) {
		String product = "Tea";
		String date = "Tuesday 31 Mar 2020";
		String price = "2,75 €";
		String rate = "6.5 %";
		Locale locale = Locale.FRANCE;
		ResourceBundle msg = ResourceBundle.getBundle("resources/messages", locale);
		String offerPattern = msg.getString("offer");
		String msfFormatted = MessageFormat.format(offerPattern, product, price, rate, date);
		System.out.println(msfFormatted);
		
		product = "Cha";
		date = "segunda-feira 01 abr 2019";
		price = "R$ 2,75";
		rate = "6.5 %";
		locale = new Locale("pt", "BR");
		msg = ResourceBundle.getBundle("resources/messages", locale);
		offerPattern = msg.getString("offer");
		msfFormatted = MessageFormat.format(offerPattern, product, price, rate, date);
		System.out.println(msfFormatted);

	}

}
