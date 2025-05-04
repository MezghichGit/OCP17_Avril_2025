package day11_04052025;

public class String_vs_StringBuilder {

	public static void main(String[] args) {
		String formation = "OCP";
		StringBuilder b = new StringBuilder(formation);
		b.append("FullStack_Spring_Angular");
		b.append("Certif_Spring");
		b.append("CKA");
		formation = b.toString();
		System.out.println(formation);

	}

}
