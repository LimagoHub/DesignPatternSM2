package de.singleton;

public class Singleton {
	
	
	private static Singleton instance = new Singleton(); // Eager
	
	
	
	
	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
		return instance;
	}

	private Singleton () {
		
	}
	
	public void log(String message) {
		System.out.println(message);
	}

}
