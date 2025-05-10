package day13_10052025.part3_Try_With_Ressources;

public class MyRessource implements AutoCloseable{

	String name;
	public MyRessource(String name) {
		super();
		this.name = name;
	}

	public void display()
	{
		System.out.println(this.name);
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Ma ressource est closed : "+this.name);
		
	}

}
