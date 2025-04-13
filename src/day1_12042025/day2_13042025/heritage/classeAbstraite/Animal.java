package day1_12042025.day2_13042025.heritage.classeAbstraite;

public abstract class Animal{
	
	
	public abstract void seDeplacer();
	
	public void info() {
		System.out.println("Animal");
	}
	
	String espece;
	int age;
	
	public void manger() {
		System.out.println("Je veux manger");
	}
	

}
