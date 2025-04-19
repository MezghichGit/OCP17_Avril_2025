package day4_le19042025.expressionLambda;

public class Test {

	public static void main(String[] args) {
		Calcul c = (double a, double b) -> {return a + b;}; //expression versode
		
		Calcul c2 = (a, b) ->a*b; // expression réduite
		
		System.out.println(c.operation(10, 20));
		System.out.println(c2.operation(10, 20));

	}

}
