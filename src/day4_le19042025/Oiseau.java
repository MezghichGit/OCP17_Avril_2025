package day4_le19042025;

import java.io.IOException;

public class Oiseau extends Animal{

	@Override
	public void info() throws IOException{
		System.out.println("Oiseau");
	}
	@Override
	protected Oiseau getAnimal(){
		System.out.println("Animal");
		return new Oiseau();
	}
}
