package day13_10052025.part2_MultiCatch_Custom_Exceptions;

public class TestMyException {

	public static void main(String[] args) {
		try {
			// if certaine condition
			throw new CannotSwimException(new IllegalArgumentException("Oups"));
		}
		catch(CannotSwimException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Hi");

	}

}
