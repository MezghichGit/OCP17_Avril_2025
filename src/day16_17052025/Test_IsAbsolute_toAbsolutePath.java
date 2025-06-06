package day16_17052025;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test_IsAbsolute_toAbsolutePath {

	public static void main(String[] args) {
		
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? "+path1.isAbsolute());
		System.out.println("Absolute Path1: "+path1.toAbsolutePath());
		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is Absolute? "+path2.isAbsolute());
		System.out.println("Absolute Path2 "+path2.toAbsolutePath()); 
		System.out.println("+++++");
		System.out.println(Paths.get("/stripes/zebra.exe").isAbsolute());
		System.out.println(Paths.get("C:/goats/Food.java").isAbsolute());

	}

}
