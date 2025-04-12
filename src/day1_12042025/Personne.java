package day1_12042025;

public class Personne {

	public Personne() {
		System.out.println("constructeur");
	}
	
	public void finalize() {
		System.out.println("destructeur");
	}
}
