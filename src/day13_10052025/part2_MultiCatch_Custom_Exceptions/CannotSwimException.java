package day13_10052025.part2_MultiCatch_Custom_Exceptions;

public class CannotSwimException extends Exception {
	
	public CannotSwimException() {
		super();
	}

	public CannotSwimException(Exception e) {
		super(e);
	}

	public CannotSwimException(String message) {
		super(message);
	}
}
