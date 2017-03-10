package pl.codeme.obiekty.klasy;

public class PrzykladEnum {

	public static void main(String[] args) {
		MarkaSamochodu ms;
		ms = MarkaSamochodu.AUDI;
		
		switch (ms){
			case AUDI: 
				System.out.println("Audi"); 
				break;
			case BMW: 
				System.out.println("BMW");
			case FIAT: 
				System.out.println("Fiat");
				default: 
					System.out.println("Default");
		}
		System.out.println("Lans: " + ms + ": " + ms.getLans());
		MarkaSamochodu.AUDI.getLans();
	}
	


}
