package day14_11052025.serialization_example;

import java.io.Serializable;

public class Personne implements Serializable{

	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Personne(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Constructeur avec paramètres Personne");
	}
	
	public Personne() {
		super();
		System.out.println("Constructeur par défaut Personne");
	}
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Personne [name=" + name + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
}
