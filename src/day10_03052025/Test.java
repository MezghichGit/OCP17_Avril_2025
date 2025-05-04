package day10_03052025;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		//randoms.limit(10).forEach(System.out::println);
		oddNumbers.limit(10).forEach(System.out::println);
		
		
		Stream<String> stream = Stream.of("w", "o","f", "l", "f");
		//Set<String> set = stream.collect(Collectors.toSet());
		List<String> list = stream.collect(Collectors.toList());
		System.out.println(list); // [f, w, l, o]
		IntStream is = IntStream.empty();
		is.sum();

	}

}
