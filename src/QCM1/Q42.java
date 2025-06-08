package QCM1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Q42 {

	public static void main(String[] args) {
		Period periodOfDays = Period.ofDays(10);       // 10-day period
		Duration durationOfDays = Duration.ofDays(10); // 10-day duration
		LocalDateTime dateTime = LocalDateTime.of(1990, 01, 01, 10, 10, 10); // Jan 1, 1990, 10:10:10

		dateTime = dateTime.plus(periodOfDays.plus(durationOfDays)); 

	}

}
