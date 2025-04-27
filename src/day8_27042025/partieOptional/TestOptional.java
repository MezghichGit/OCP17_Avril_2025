package day8_27042025.partieOptional;

import java.util.Optional;

public class TestOptional {

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {
		Optional<Double> res1 = average(90,100);
		Optional<Double> res2 = average();
		System.out.println(res1);
		System.out.println(res2);
		
		if(res2.isPresent())
		{
			System.out.println(res2.get());
		}
		else System.out.println("Vide");
		
		res2.ifPresent(System.out::println);
	}

}
