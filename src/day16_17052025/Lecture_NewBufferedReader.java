package day16_17052025;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lecture_NewBufferedReader {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Amine\\Desktop\\ocp\\ocp17\\note.txt");
		try (BufferedReader reader = 
				Files.newBufferedReader(path,Charset.forName("US-ASCII")))
		{// Read from the stream
			String currentLine = null;
			while((currentLine = reader.readLine()) != null)
				System.out.println(currentLine);
			} catch (IOException e) {
				// Handle file I/O exception...
				
			} 
		}

}
