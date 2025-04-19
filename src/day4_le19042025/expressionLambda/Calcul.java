package day4_le19042025.expressionLambda;

@FunctionalInterface
public interface Calcul {

	//public void info();
	public double operation(double x, double y); // une méthode abstraite
	
	public default void info() {
		System.out.println("Interface fonctionnelle");
	}
}
