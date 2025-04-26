package day7_26042025.LesBounds;

import java.util.ArrayList;
import java.util.List;

public class TestBounds {

	public static void main(String[] args) {
		Animal a = new Oiseau(); // upCasting
		
		List<Animal>la = new ArrayList<>();
		List<Oiseau>lo = new ArrayList<>();
		List<Canari>lc = new ArrayList<>();
		
		// On n'a pas le droit à cette opération!!! car il s'agit de collection
		la = lo;
		
		//La solution est d'utiliser les Bounds
		
		//Cas 1 :  Un_bounded
		
		List<?> l = lo;
		l = la;
		
		//Cas 2 :  Upper_Bound
		
		List<? extends Animal> l2;
		l2 = la;
		l2 = lo;
		l2 = lc;
		
		//Cas 3 :  Lower_Bound
		
		List<? super Canari> l3;
		l3 = la;
		l3 = lc;
		l3 = lo;
		

	}

}
