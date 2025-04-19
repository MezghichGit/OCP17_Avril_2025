package day4_le19042025.instanceOf;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		boolean res1 = c instanceof A;
		boolean res2 = b instanceof C;
		System.out.println(res1);
		System.out.println(res2);
		//boolean res3 = d instanceof C; // does not compile
		
		boolean res3 = b instanceof Vehicule;
		System.out.println(res3);

	}

}
