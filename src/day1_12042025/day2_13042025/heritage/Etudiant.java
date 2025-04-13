package day1_12042025.day2_13042025.heritage;

public class Etudiant extends Personne {
	String nom = "Etudiant";
	int numInscription;
	String university;
	public Etudiant(String nom, int age, int numInscription, String university) {
		super(nom, age); // appel au constructeur parent avec paramètre de la classe mère
		this.numInscription = numInscription;
		this.university = university;
	}
	
	public Etudiant() {
		super(); // appel au constructeur parent par défaut de la classe mère
		System.out.println("Constructeur Etudiant");
	}
	
	public void getNomComplet() {
		System.out.println(this.nom +" "+super.nom);
	}
}
