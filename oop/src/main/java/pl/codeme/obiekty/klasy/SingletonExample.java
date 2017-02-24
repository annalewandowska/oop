package pl.codeme.obiekty.klasy;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton ex1, ex2;
		
		// Nie zadziała!
		// ex1 = new Singleton();
		
		ex1 = Singleton.getInstance();
		ex2 = Singleton.getInstance();

		System.out.println(ex1);
		System.out.println(ex2);
	}

}
