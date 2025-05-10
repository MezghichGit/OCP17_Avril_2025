package day13_10052025.part3_Try_With_Ressources;

import java.io.BufferedReader;

public class Exemple_Try_With_Ressources {
	BufferedReader rb;
	public static void main(String[] args) throws Exception {
		try (MyRessource r1 = new MyRessource("r1"); 
				MyRessource r2 = new MyRessource("r2");
				RS r3 = new RS()) {
			r1.display();
			r2.display();

		}
		//finally { r3.close(); r2.close(); r1.close()} //implicitement

	}

}
