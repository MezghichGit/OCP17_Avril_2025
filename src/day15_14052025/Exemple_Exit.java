package day15_14052025;

public class Exemple_Exit {

	public static void main(String[] args) {
		try {
		throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Ok");
			//return;
			System.exit(0);
		}
		finally
		{
			System.out.println("Fin du programme");
	    }

	}

}
