package day14_11052025.serialization_example;

import java.io.Serializable;

public class Etudiant extends Personne implements Serializable{
	@Override
	public String toString() {
		return "Etudiant [num=" + num + "]" + super.toString();
	}
	int num;

	public Etudiant(String name, int age, int num) {
		super(name, age);
		this.num = num;
		System.out.println("Constructeur avec paramètres Etudiant");
	}
	public Etudiant() {
		System.out.println("Constructeur par défaut Etudiant");
	}

}
