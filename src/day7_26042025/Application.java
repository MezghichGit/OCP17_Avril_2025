package day7_26042025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		/*
		List<String> list = new ArrayList<>(); // empty list
		list.add("Fluffy"); // [Fluffy]
		list.add("Webby"); // [Fluffy, Webby]
		String[] array = new String[list.size()]; // empty array
		System.out.println(array[0]);
		 */
		
		int tab[]= {10,3,5,2};
		//Arrays.sort(tab); // 2 3 5 10
		System.out.println(Arrays.binarySearch(tab, 10));
		System.out.println(Arrays.binarySearch(tab, 5)); //2
		System.out.println(Arrays.binarySearch(tab, 4)); //-3
		System.out.println(Arrays.binarySearch(tab, 0)); // -1
		System.out.println(Arrays.binarySearch(tab, 12)); // -5
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(null);
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
		//System.out.println(Collections.binarySearch(list, 3));
		Integer x = list.get(4); // ordinaire
		int xu = list.get(4); // Unboxing
		

	}

}
