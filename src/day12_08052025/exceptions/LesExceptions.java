package day12_08052025.exceptions;

import java.io.IOException;

public class LesExceptions {
	
	public static void display1() throws IOException{}  // Checked exceptions

	public static void display2() throws IllegalArgumentException{// Unchecked Exceptions
		throw new IllegalArgumentException("juste pour tester");
	}  
	
	public static void main(String[] args) {
		display2();
		try {
			display1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int x = 10;
		//int y = 10;
		int y = 0;
		try {
		System.out.println(x/y);
		}catch(ArithmeticException ae) 
		{
			System.out.println("Un problème arithmétique : "+ ae.getMessage());
			ae.printStackTrace();
			return;
		}
		finally {
		System.out.println("Suite du programme");
		}

	}

}
