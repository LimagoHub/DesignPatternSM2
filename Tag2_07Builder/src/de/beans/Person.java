package de.beans;

public class Person {
	
	private String anrede="Divers", vorname="Unklar", nachname="Mustermann", strasse="Meine Strasse", ort="Ffm", plz="60000";
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Person(String anrede, String vorname, String nachname, String strasse, String ort, String plz) {
		super();
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.strasse = strasse;
		this.ort = ort;
		this.plz = plz;
	}



	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [anrede=");
		builder.append(anrede);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append(", strasse=");
		builder.append(strasse);
		builder.append(", ort=");
		builder.append(ort);
		builder.append(", plz=");
		builder.append(plz);
		builder.append("]");
		return builder.toString();
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	public static class PersonBuilder {
		private Person person = new Person();
		
		public PersonBuilder anrede(String anrede) {
			person.setAnrede(anrede);
			return this;
		}
		public PersonBuilder vorname(String vorname) {
			person.setVorname(vorname);
			return this;
		}
		public PersonBuilder nachname(String nachname) {
			person.setNachname(nachname);
			return this;
		}
		public PersonBuilder strasse(String strasse) {
			person.setStrasse(strasse);
			return this;
		}
		public PersonBuilder ort(String ort) {
			person.setOrt(ort);
			return this;
		}
		public PersonBuilder plz(String plz) {
			person.setPlz(plz);
			return this;
		}
		
		public Person build() {
			// Validierung
			return person;
		}
	}

}
