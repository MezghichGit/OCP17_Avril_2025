package day14_11052025.serialization_example;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<Animal>();
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				Object object = in.readObject(); // appel de constructeur??
				if (object instanceof Animal) {
					animals.add((Animal) object);
				}
			}
		} catch (EOFException e) {
			// Fin de fichier atteinte
			System.out.println("Fin du fichier...");
		}
		return animals;
	}

	public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Animal animal : animals) {
				out.writeObject(animal);
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Tommy Tiger", 5, 'T'));
        animals.add(new Animal("Peter Penguin", 8, 'P'));
        File dataFile = new File("animal.data");
        createAnimalsFile(animals, dataFile); // serialization
        System.out.println(getAnimals(dataFile)); // deserialization
    }


}
