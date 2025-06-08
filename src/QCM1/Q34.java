package QCM1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q34 {

	public static void main(String[] args) {
		List<String> cars = List.of("Dodge", "Aston Martin", "Chevrolet", "BMW");
		List<String> temp = cars.stream()
		    .map(e -> e.substring(1, e.length())) // line 1: removes first character
		    .sorted(Comparator.reverseOrder())   // line 2: sorts in reverse
		    .collect(Collectors.toList());       // result collected but unused

		System.out.println(temp.get(0));
		System.out.println(cars.get(0));


	}

}
