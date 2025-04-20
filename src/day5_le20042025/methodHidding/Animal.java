package day5_le20042025.methodHidding;

public class Animal {

	// méthode static
	
	protected static void info() {
		System.out.println("Animal");
	}
	/*
	protected void info() {
		System.out.println("Animal");
	}
	*/
	public void displayAnimal() {
		info();
	}
}
