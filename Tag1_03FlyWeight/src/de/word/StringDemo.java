package de.word;

import java.time.Duration;
import java.time.Instant;

public class StringDemo {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("");
		
		Instant start = Instant.now();
		for (int i = 0; i < 2_000_000; i++) {
			s.append("a");
		}
		
		String ergebnis = s.toString();
		
		Instant ende = Instant.now();
		Duration duration = Duration.between(start, ende);
		
		System.out.println(duration.toMillis());

	}

}
