package day4_le19042025.lesEnums;

public enum Jour {
	LUNDI(20), MARDI(20), MERCREDI(15), JEUDI(20), VENDREDI(3), SAMEDI(4), DIMANCHE(2);
	
	int nb;
	private Jour(int nb) {  // constructeur
		System.out.println("Constructructeur");
		this.nb = nb;
	}
	
	public void getNB()
	{
		System.out.println(this.nb);
	}
}
