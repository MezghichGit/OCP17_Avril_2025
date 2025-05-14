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

public class Test_Serialization_Etudiant {
	public static List<Etudiant> getEtudiants(File dataFile) throws IOException, ClassNotFoundException {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				Object object = in.readObject(); // appel de constructeur??
				if (object instanceof Etudiant) {
					etudiants.add((Etudiant) object);
				}
			}
		} catch (EOFException e) {
			// Fin de fichier atteinte
			System.out.println("Fin du fichier...");
		}
		return etudiants;
	}

	public static void createEtudiantsFile(List<Etudiant> etudiants, File dataFile) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Etudiant etudiant : etudiants) {
				out.writeObject(etudiant);
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants.add(new Etudiant("Amine", 25, 1));
        etudiants.add(new Etudiant("Peter", 28, 2));
        File dataFile = new File("etudiants.data");
        createEtudiantsFile(etudiants, dataFile); // serialization
        System.out.println("********* Début du processus de déserialization... *********");
        System.out.println(getEtudiants(dataFile)); // deserialization
    }

}
