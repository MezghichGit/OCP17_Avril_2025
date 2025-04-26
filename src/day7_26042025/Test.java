package day7_26042025;

import java.util.ArrayList;

public class Test {
	
	public static <T> void info(T t) { // méthode generique
		System.out.println(t);
	}

	public static void main(String[] args) {
		info("OCP");
		info(20);
		info(true);
		
		/*
		Ordinateur o1 = new Ordinateur();
		Container<Ordinateur,String> co = new Container<>();
		co.addElement(o1);
		co.info();
		ArrayList<String>as;*/

	}

}
