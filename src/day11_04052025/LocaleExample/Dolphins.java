package day11_04052025.LocaleExample;

import java.util.Locale;
import java.util.ResourceBundle;

public class Dolphins {

	public static void main(String[] args) {
		
		Locale fr = new Locale("fr");
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle b = ResourceBundle.getBundle("Dolphins");
		System.out.println(b.getString("nom"));
		System.out.println(b.getString("name"));
		System.out.println(b.getString("age"));
	

	}

}
