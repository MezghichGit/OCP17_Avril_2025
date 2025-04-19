package day4_le19042025;

public class Animal {
	String espece; // package private
	
	protected int age;

	protected void info() throws Exception{
		System.out.println("Animal");
	}
	
	protected Animal getAnimal(){
		System.out.println("Animal");
		return new Animal();
	}
}
