package day7_26042025;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypes {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("amine");
		names.add("seif");
		names.add(12);
		names.add(true);
		for(Object o : names) {
			String temp = (String)o;
			System.out.println(temp.toUpperCase());
		}


	}

}
