package Day6_QCM;

public interface BigCat {
	abstract String getName();
	static int hunt() { getName(); return 5; }
	default void climb() { rest(); }
	private void roar() { getName(); climb(); hunt(); }
	private int rest() { return 2; };
}
