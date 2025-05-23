package day9_30042025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Platypus {
	String name;
    int beakLength;

    public String getName() {
        return name;
    }

    // Assume getters/setters/constructors provided
    public Platypus(String name, int beakLength) {
        this.name = name;
        this.beakLength = beakLength;
    }

    public int getBeakLength() {
        return beakLength;
    }

    public String toString() {
        return "" + beakLength;
    }
	public static void main(String[] args) {
	
	
	        Platypus p1 = new Platypus("Paula", 3);
	        Platypus p2 = new Platypus("Peter", 5);
	        Platypus p3 = new Platypus("Peter", 7);

	        List<Platypus> list = Arrays.asList(p1, p2, p3);

	        // Sort by beakLength
	        //Collections.sort(list, Comparator.comparing(Platypus::getBeakLength).reversed());
	        //Collections.sort(list, Comparator.comparing(Platypus::getName).thenComparingInt(Platypus::getBeakLength).reversed());
	        Collections.sort(list, Comparator.comparing(Platypus::getName)
	                .thenComparing(
	                       Comparator.comparing(Platypus::getBeakLength).reversed()));
	        
	        Collections.sort(list, Comparator.comparing (Platypus::getName)
	        		.thenComparing(
	        				Comparator.comparing(Platypus::getBeakLength)).reversed());
	        System.out.println(list);
}
}
