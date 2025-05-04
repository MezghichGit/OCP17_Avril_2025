package day11_04052025.LocaleExample;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatting {

	public static void main(String[] args) {
		/*
		double price = 48;
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat de = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(us.format(price));
		System.out.println(fr.format(price));
		System.out.println(de.format(price));
		*/
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		DateTimeFormatter fullDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(date.format(fullDateTime));
		
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(date.format(mediumDateTime));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(date.format(shortDateTime));
	}

}
