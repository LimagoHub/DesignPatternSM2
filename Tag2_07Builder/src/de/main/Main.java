package de.main;

import de.beans.Person;

public class Main {

	public static void main(String[] args) {
		Person person = Person
				.builder()
				.anrede("Frau")
				.vorname("Erika")
				.build();
		
		System.out.println(person);
	}

}
