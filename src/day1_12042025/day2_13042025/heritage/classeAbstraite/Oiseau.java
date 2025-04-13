package day1_12042025.day2_13042025.heritage.classeAbstraite;

public class Oiseau extends Animal{

	@Override//redefinition d'une méthode de la classe mère
	public void seDeplacer() {
		System.out.println("Je vol");
	}

}
