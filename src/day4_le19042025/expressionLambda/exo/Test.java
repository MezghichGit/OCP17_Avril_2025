package day4_le19042025.expressionLambda.exo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		
		Supplier<StringBuilder> sp = ()->new StringBuilder("ocp");
		
		System.out.println(sp.get());
		// 1) méthode de référence par constructeur
		Supplier<StringBuilder> sp2 = StringBuilder::new; 
		
		
		
		// 2) méthode de référence par méthode static
		Supplier<LocalDate> spd = ()->LocalDate.now();
		Supplier<LocalDate> spds = LocalDate::now;
		
		System.out.println(spd.get());
		System.out.println(spds.get());
		//3) Méthode de référence basée sur une instance fixe
		
		String word = "formation OCP 17";
		
		Predicate<String> filter = ch->ch.contains("OCP");
		Predicate<String> filter2 = word::startsWith;
		Predicate<String> filter22 = word::contains;
		System.out.println(filter2.test("formation"));
		//4) Méthode de référence basée sur une instance lors du runtime
		
		Predicate<String> filter3 = ch->ch.isEmpty();
		Predicate<String> filter4 = String::isEmpty;
		System.out.println(filter4.test("formation"));
		
		
		List<String>names = Arrays.asList("chaima","manel","saida","zied");
		names.forEach(System.out::println); // méthode refrence
		
		
		names.forEach(x->System.out.println(x));
		
		
		
		Prediction p1 = ch->ch.contains("ocp");
		Prediction p2 = ch->ch.length()>4;
		
		System.out.println(p1.test("oca17"));
		System.out.println(p2.test("ocp17"));

	}

}
