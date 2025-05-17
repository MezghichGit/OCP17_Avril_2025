package day16_17052025.StreamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {
		System.out.println(Paths.get(".").toRealPath());
		Path path = Paths.get(".").toRealPath();
		try {
			Files.walk(path)
			.filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
			} 
		}

}
