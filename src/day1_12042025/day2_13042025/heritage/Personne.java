package day1_12042025.day2_13042025.heritage;

public class Personne {
	String nom="Personne";
	int age;
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	
	public Personne() {
		super();
		System.out.println("Constructeur Personne");
	}
}
