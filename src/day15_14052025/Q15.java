package day15_14052025;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q15 {

	public static void main(String[] args) {
		var f = DateTimeFormatter.ofPattern("hh 'o''clock'");
		System.out.println(f.format(LocalTime.now()));

	}

}
