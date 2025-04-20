package day5_le20042025.designPattern.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestImmutable {

	public static void main(String[] args) {
		//List<String> myFoods = Arrays.asList("meat","fish");
		
		List<String> myFoods = new ArrayList<>();
		myFoods.add("meat");
		myFoods.add("fish");
		Animal a = new Animal("Chat",2,myFoods);
		System.out.println(a.getFoods());
		myFoods.clear();
		System.out.println(a.getFoods());
		
		
		//List<String> x = a.getFoods();
		//System.out.println(a.getFoods());
		//System.out.println(x);
		
		//x.clear();
		//System.out.println(x);
		//System.out.println(a.getFoods());

	}

}
