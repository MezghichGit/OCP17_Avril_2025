package day15_14052025;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


//Le 0 dans le pattern force la présence d'un chiffre même s'il est zéro.

//Le # signifie que le chiffre est optionnel (présent seulement si nécessaire).

//La virgule , est un séparateur de milliers.

//Le point . est un séparateur décimal.
public class Q7 {

	public static void main(String[] args) {
		String pattern = "#,###,000.0#";  
		var message = DoubleStream.of(5.21, 8.49, 1234)
				.mapToObj(v -> new DecimalFormat(pattern).format(v)) 
				.collect(Collectors.joining("> <"));
		System.out.println("<" + message + ">");

	}

}
