package day1_12042025.day2_13042025.upetdonwCasting;

public class Test {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		// a = o;
		 a = new Oiseau(); // upcasting
		 o = (Oiseau) a;  // cast explicite
		 
		 System.out.println("Fin du programme");

	}

}
