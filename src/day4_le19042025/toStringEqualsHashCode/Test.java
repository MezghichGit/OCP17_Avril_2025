package day4_le19042025.toStringEqualsHashCode;

public class Test {

	public static void main(String[] args) {
		Animal a1 = new Animal(1,"wolf",2);
		Animal a2 = new Animal(1,"wolf",2);
		//toString()
		System.out.println(a1);
		System.out.println(a1.toString());
		//equals()
		System.out.println(a1.equals(a2));
		Personne p = new Personne();
		System.out.println(a1.equals(p));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}
