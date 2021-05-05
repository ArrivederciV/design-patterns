package singleton;

public class Singleton {

	/*
	 * 1)pravi se constructora private
	 * 2)suzdava se instance;
	 * 3)getInstance(); ako nqma da se suzdade
	 */
	private static Singleton instance;
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void postMessage(String message) {
		System.out.println("Posted message: " + message);
	}
}
