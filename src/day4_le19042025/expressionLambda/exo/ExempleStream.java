package day4_le19042025.expressionLambda.exo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExempleStream {

	public static void main(String[] args) {
		Stream<String> data = Stream.of("amine", "zied", "salim", "asma", "mehez", "emna");
		List<String> names = Arrays.asList("amine", "zied", "salim", "asma", "mehez", "emna");
		Stream<String> noms = names.stream();
		Stream<String> temp = noms.filter(x -> x.contains("m"));
		//long nb = noms.filter(x -> x.contains("m")).count();
		//System.out.println(nb);
		System.out.println(temp.count());
		System.out.println(temp.findAny());
	}

}
