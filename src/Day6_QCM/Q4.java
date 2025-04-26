package Day6_QCM;

public interface Q4 {

	int moy = 10; //final public static
	
	//Version 8
	default public void display() {}
	public static void display2() {
		info2();
	}
	
	
	public static void display3() {
		info2();
	}
	
	
	//Version 9
	private void info() {}
	private static void info2() {
		System.out.println("Hello");
		System.out.println("Bonjour");
		System.out.println("Hola");
	}
}
