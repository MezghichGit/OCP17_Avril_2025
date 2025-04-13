package day1_12042025.day2_13042025.heritage.classeAbstraite;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animals[] = new Animal[4]; // création d'un tableau d'objets de type Animal

		animals[0] = new Serpent();
		animals[1] = new Oiseau();
		animals[2] = new Poisson();
		animals[3] = new Chien();
		
		for(Animal animal : animals)
		{
			animal.seDeplacer();
		}
	}

}
