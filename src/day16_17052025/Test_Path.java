package day16_17052025;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test_Path {

	public static void main(String[] args) {
		Path path1 = Paths.get("pandas", "cuddly.png");
		//System.out.println(path1.toString());

		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: " + path);
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: " + path.getName(i));
		}

	}

}
