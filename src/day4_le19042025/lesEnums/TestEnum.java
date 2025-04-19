package day4_le19042025.lesEnums;

public class TestEnum {

	public static void main(String[] args) {
		Jour j = Jour.LUNDI;
		
		switch(j) {
		case LUNDI : Jour.LUNDI.getNB(); break;
		case MARDI : Jour.LUNDI.getNB(); break;
		case MERCREDI : Jour.LUNDI.getNB(); break;
		}
		System.out.println(Jour.DIMANCHE.ordinal());
		
		Jour.DIMANCHE.getNB();

	}

}
