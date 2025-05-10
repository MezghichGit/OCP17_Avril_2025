package day13_10052025.part1_Exceptions;

public class Throws_VS_Throw {

	public static void info1() throws Exception{ // Checked exception
		System.out.println("Hello World");
		throw new Exception("Beug");
	}
	
	public static void info2() throws RuntimeException{ // Unchecked exception
		System.out.println("Hello World");
		//throw new RuntimeException("Beug");
	}
	
	//public static void main(String[] args) throws Exception{  // we declare the exception
	public static void main(String[] args) {	
		try {
			info1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		info2();
		
		System.out.println("Fin du programme");
	}

}
