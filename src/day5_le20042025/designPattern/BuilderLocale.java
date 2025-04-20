package day5_le20042025.designPattern;

import java.util.Locale;

public class BuilderLocale {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale loc = new Locale("en","US");
		System.out.println(loc);
		// creation d'un objet Locale via le Builder design pattern
		Locale lc = new Locale.Builder().setLanguage("en").setRegion("US").build();

	}

}
