package day1_12042025;

public class Utilitaire {

	public static void somme(int ...tab) {}
	public static void callNames(int x, String ...names) {}
	public static void main(String[] args) {
		somme();
		somme(10);
		somme(1,5,6,8);
		
		callNames(1,"amine");
		callNames(10);
		callNames(2,"amine","zied","ala");
	}

}
