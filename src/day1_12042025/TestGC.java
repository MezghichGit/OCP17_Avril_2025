package day1_12042025;

public class TestGC {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = p1;
		
		p1 = null;
		p2 = null;
		
		p3 = null;
		System.gc();
		System.out.println("Suite du programme");

	}

}
