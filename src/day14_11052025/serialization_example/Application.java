package day14_11052025.serialization_example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("zoo.log");
		out.print(5); // PrintWriter method
		out.write(String.valueOf(5)); // Writer method : conversion de l'argument en String

	}

}
