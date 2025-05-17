package day16_17052025;
import java.io.IOException;
import java.nio.file.*;
public class TestFiles {

	public static void main(String[] args) {
		try {
			
			//Files.copy(Paths.get("C:\\Users\\Amine\\Desktop\\ocp\\ocp17"), 
					//Paths.get("C:\\Users\\Amine\\Desktop\\ocp\\ocp17\\ocp17-save"));
			
		
			Files.copy(Paths.get("C:\\Users\\Amine\\Desktop\\ocp\\ocp17\\note.txt"),
				Paths.get("C:\\Users\\Amine\\Desktop\\ocp\\ocp17\\ocp17-save\\note.txt"));
			
			
		} catch (IOException e) {
			// Handle file I/O exception...}
		}

	}

}
