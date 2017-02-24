package pl.codeme.obiekty.klasy;

public class IteratorExample {

	public static void main(String[] args) {
		SquareRoot sq = new SquareRoot(10);

		for (Object liczba : sq) {
			System.out.println(liczba);	
		}
	}

}
