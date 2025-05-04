package day9_30042025;

import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		List<?> q = List.of("mouse", "parrot");
		var v = List.of("mouse", "parrot");

		v.set(0, "ocp");
		System.out.println(v);
		q.removeIf(String::isEmpty);
		q.removeIf(s -> s.length() == 4);
		
		v.removeIf(String::isEmpty);
		v.removeIf(s -> s.length() == 4);

	}

}
