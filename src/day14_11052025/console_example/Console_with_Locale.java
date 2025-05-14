package day14_11052025.console_example;

import java.io.Console;
import java.util.Locale;
public class Console_with_Locale {

	public static void main(String[] args) {
		Console console = System.console();
		console.writer().format(new Locale("fr", "CA"),"Hello World"); 

	}

}
