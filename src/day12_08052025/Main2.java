package day12_08052025;

import java.util.*;
import java.util.stream.*;

public class Main2 {
    public static void main(String[] args) {
        /*
    	List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();

        Stream.of(l1, l2, l3)
              .map(x -> x + 1) // Erreur ici : x est une liste, pas un entier
              .flatMap(x -> x.stream())
              .forEach(System.out::print);*/
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();

        Stream.of(l1, l2, l3)
              .flatMap(list -> list.stream().map(x -> x + 1))
              .forEach(System.out::print);
    	
    }
    
  
       
     
        
    }

}
