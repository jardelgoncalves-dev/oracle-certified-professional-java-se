package LanguagesAndCountry;

import java.util.Locale;

public class Sample01 {

	public static void main(String[] args) {
		Locale fr = new Locale("fr");
		Locale uk = new Locale("en", "GB");
		Locale ukEuro = new Locale("en", "GB", "EURO");
		Locale ptBReal = new Locale("pt", "BR", "REAL");
		Locale caribean = new Locale("dr", "029");
		Locale current = Locale.getDefault();
		
		System.out.println("fr is " + fr);
		System.out.println("uk is " + uk);
		System.out.println("uk euro is " + ukEuro);
		System.out.println("pt brazil Real is " + ptBReal);
		System.out.println("caribean is " + caribean);
		System.out.println("current is " + current);

	}

}
