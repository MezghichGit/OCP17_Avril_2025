package day5_le20042025.designPattern.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Animal { // pour eviter l'overriding
	
	public Animal(String espece, int age, List<String> foods) { // laisser que les constructeurs
		super();
		this.espece = espece;
		this.age = age;
		this.foods =  new ArrayList<>(foods);
	}
	private final String espece; // pour éviter l'accès depuis l'exterieur de la classe
	private final int age;
	private final List<String>foods; // mutable object
	
	public String getEspece() {
		return espece;
	}
	public int getAge() { // enlever les setters
		return age;
	}
	public List<String> getFoods() {
		return new ArrayList<>(foods);
	}

}
