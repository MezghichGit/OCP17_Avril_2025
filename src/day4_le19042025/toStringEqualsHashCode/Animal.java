package day4_le19042025.toStringEqualsHashCode;

public class Animal {

	int id;
	String nom;

	public Animal(int id, String nom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
	}

	int age;

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nom=" + nom + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal))
			return false;
		else {
			Animal temp = (Animal) obj;
			return this.id == temp.id && this.nom.equals(temp.nom) && this.age == temp.age;
		}
	}
	
	@Override
	public int hashCode() {
		return 7*this.age*this.nom.length();
	}

}
