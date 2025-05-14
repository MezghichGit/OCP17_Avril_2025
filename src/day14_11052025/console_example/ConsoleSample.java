package day14_11052025.console_example;

import java.io.Console;

public class ConsoleSample {
    public static void main(String[] args) {
    	System.out.println("Début");
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine("Donner une phrase");
            console.writer().println("You entered the following: " + userInput);
        }
        else
        	System.out.println("Console non disponible");
    }
}
