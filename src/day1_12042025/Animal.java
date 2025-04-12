package day1_12042025;

public class Animal {
	//attributs d'instance
	int age;
	String espece;
	double poids;
	//attribut de clase
	static int maxAge = 100;
	//méthodes d'instance
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
	//méthodes static
	
	public static void getMaxAge()
	{
		System.out.println(maxAge);
	}
}
