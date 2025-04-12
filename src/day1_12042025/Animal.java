package day1_12042025;

public class Animal {
	// attributs d'instance
	int age;
	String espece;
	double poids;
	// attribut de clase
	static int maxAge = 100;

	

	// bloc 1 d'initialisation d'instance
	{
		System.out.println("Initialization...");
	}

	// bloc 2 d'initialisation d'instance
	{
		System.out.println("Démarrage...");
	}

	// bloc d'initialisation de classe
	static {
		System.out.println("static bloc...");
	}

	public Animal(int age, String espece, double poids) {
		//super();
		//this(); //appel au constructeur par défaut
		this.age = age;
		this.espece = espece;
		this.poids = poids;
		System.out.println("Constructeur avec paramètres");
	}
	
	public Animal() {
		this(10,"Chien",12.5);
		System.out.println("Constructeur par défaut");
		
	}

	// méthodes d'instance
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", espece=" + espece + ", poids=" + poids + "]";
	}
	// méthodes static

	public static void getMaxAge() {
		System.out.println(maxAge);
	}
}
