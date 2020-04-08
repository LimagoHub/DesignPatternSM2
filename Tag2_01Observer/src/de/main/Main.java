package de.main;

import de.tiere.Schwein;

public class Main {

	private Metzger metzger = new Metzger();
	private Spediteur spediteur = new Spediteur();
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Schwein piggy = new Schwein("Miss Piggy");
		piggy.addPigTooFatListener(e->metzger.schlachten(e));
		piggy.addPigTooFatListener(e->spediteur.fahren(e));
		piggy.addPropertyChangedListener(e->System.out.println(e));
		for (int i = 0; i <15; i++) {
			piggy.fressen();
		}
	}
//	class SchweineMetzgerAdapter implements PigTooFatListener {
//
//		@Override
//		public void pigTooFat(Schwein fettesSchwein) {
//			metzger.schlachten(fettesSchwein);
//			
//		}
//		
//	}
}

class Spediteur {
	public void fahren(Object ware) {
		System.out.println("Wir fahren auf der Autobahn!");
	}
}

class Metzger {

	
	public void schlachten(Object fettesSchwein) {
		System.out.println("Messer wetz!");
		
	}
	
}
