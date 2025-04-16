package day3_le16042025;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Main {

	public static void info() throws ArithmeticException, ClassCastException, IllegalArgumentException {
		System.out.println("Hello Wolrd");
		throw new IllegalArgumentException();
	}

	public static void call() throws Exception { // Checked exception
		System.out.println("Hello Wolrd");
		throw new Exception();
	}

	public static void sendMsg() throws IOException { // Checked exception
		System.out.println("Hello Wolrd");
		//throw new FileNotFoundException();
		throw new IOException();
	}

	public static void main(String[] args) {
		try {
			sendMsg();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		info();
		try {
			call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * StringBuilder sb = new StringBuilder("OCP"); sb.append("17");
		 * System.out.println(sb); LocalDate ld = LocalDate.of(2025, Month.APRIL, 10);
		 * System.out.println(ld); System.out.println(ld.plusDays(10)); ld =
		 * ld.plusDays(10); System.out.println(ld);
		 */
		/*
		 * int x = 10; int y = 0; try { System.out.println(x/y); //return; }
		 * catch(ArithmeticException ae) { System.out.println("Oups un problème :"
		 * +ae.getMessage()); ae.printStackTrace(); } finally {
		 * System.out.println("Fin du programme"); }
		 */
		/*
		 * int tab[] = new int [3]; System.out.println(tab[0]);
		 * System.out.println(tab[1]); System.out.println(tab[2]);
		 */
		int tab[] = { 10, 20, 4 };
		System.out.println(tab[1]);
		System.out.println(tab.length);
		String ch = "OCP";
		System.out.println(ch.length());

		ArrayList<Integer> notes = new ArrayList<>();
		System.out.println(notes.size());

	}

}
