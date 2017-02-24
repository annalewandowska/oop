package pl.codeme.obiekty.klasy;

import pl.codeme.wyjatki.NieWskoczylBiegException;
import pl.codeme.wyjatki.SamochodException;

public class Bmw extends Samochod {

	public Bmw() {
		super("Leasing");
		
		lans = 10;
	}
	
	@Override
	public void przyspiesz() throws NieWskoczylBiegException {
//		double t = 10 /0;
		throw new NieWskoczylBiegException(3);
//		System.out.println("Przyspieszam delikatnie");
//		predkosc++;
	}
	
	public void przyspiesz(int ile) {
		System.out.println("Przyspieszam z kopyta o " + ile + "km/h");
		predkosc = predkosc + ile;
	}
}
