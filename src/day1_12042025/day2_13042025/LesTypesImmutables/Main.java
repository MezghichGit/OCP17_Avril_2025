package day1_12042025.day2_13042025.LesTypesImmutables;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		String nom = "amine"; //immutable : inchangeable
		
		StringBuilder sb = new StringBuilder("amine"); // mutable : modifiable
		
		
		System.out.println(nom.concat(" mezghich"));
		//nom = nom.concat(" mezghich");
		System.out.println(nom);
		
		System.out.println(sb.append(" mezghich"));
		System.out.println(sb);
		
		////////////////////////// les classes du package java.time sont toutes immutables
		
		//LocalDate ld = LocalDate.now();
		LocalDate ld = LocalDate.of(2025, Month.APRIL, 20);
		System.out.println(ld.plusDays(2));
		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(13, 00);
		System.out.println(lt.minusMinutes(30));
		System.out.println(lt);
		
		String nom1 = "Amine";
		String nom2 = "Amine";
		System.out.println(nom1 == nom2);
		System.out.println(nom1.hashCode());
		System.out.println(nom2.hashCode());
	}

}
