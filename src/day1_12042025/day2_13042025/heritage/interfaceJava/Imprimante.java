package day1_12042025.day2_13042025.heritage.interfaceJava;

public interface Imprimante {
	public static final double dureeVie=10;
	final double dureeVieSupp=5;
	public void imprimer(); // version 7 et avant
	
	//version 8 : on peut avoir des méthodes concretes
	
	public default void info() {
		infos3();
		System.out.println("Une imprimante abstraite");
	}
	
	public default void info2() {
		infos3();
		System.out.println("Une imprimante de pc");
	}
	
	public static void display() {
		System.out.println("Une imprimante via static");
	}

	//version 9 : On peut déclarer des méthodes private
	private void infos3() {
		System.out.println("Une imprimante");
		System.out.println("Une imprimante interface");
	}
	private static void displayPrivate() {
		System.out.println("Une imprimante via static private");
	}
}
