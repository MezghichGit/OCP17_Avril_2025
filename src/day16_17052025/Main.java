package day16_17052025;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		Files.isDirectory(Paths.get("/canine/coyote/fur.jpg"));
		Files.isRegularFile(Paths.get("/canine/types.txt"));
		Files.isSymbolicLink(Paths.get("/canine/coyote"));


	}

}
