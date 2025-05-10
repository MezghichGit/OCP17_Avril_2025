package day13_10052025.part5_IO;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);
		
		File file = new File("/home/smith/data/zoo.txt");
		System.out.println(file.exists());
		File file2 = new File("D:\\SIP.xlsx");
		System.out.println(file2.exists());

	}

}
