package day1_12042025.day2_13042025.heritage.classeAbstraite;

public interface Voiture {
	public default void deplacer() {
		System.out.println("Depalcement sur 4 roues");
	}
}
