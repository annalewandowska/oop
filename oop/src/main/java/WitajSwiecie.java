
public class WitajSwiecie {

	public static void main(String[] args) {

		byte b;
		short c;
	    long l;
		int x = 10;
		
		float f;
		double y = 1.2;
		
		String imie = "Marek";
		
		Boolean prawda = true;
		
		char znak = 'o';
		char innyZnak = 13;
	
		
		znak = 'u';
		prawda = false;
		
		f = (2*1.4F)+4/20;
		
		y = y * x + 10;
		x = (int)y;
		b = (byte)x;

		System.out.print("*");
		System.out.println("Witaj" + innyZnak + "świecie" + ' ' + x);

//		imie = "Nie Marek";
//		if (imie == "Marek" && (znak == 'u' || znak == 'o')) {
//			int zmienna;
//			System.out.println("Cześć Marek!");
//			zmienna = 10;
//		} else {
//			System.out.println("Gdzie poszedł Marek?");
//		}

//		for(x=0, b=10; x<10; x++, b--) {
//			System.out.println("" + x + ' ' + b);
//		}
		
		/*
		x = 0;
		do {
			if (x % 6 == 0) {
				System.out.println("X: " + x);
			}
			
			if (x == 100) {
				break;
			}
			
			x++;
		} while(true);
		*/
		
		WitajSwiecie obj = new WitajSwiecie();
		obj.linia(10);
		obj.linia(20);
		obj.linia(5);
	}

	private void linia(int dl) {
		int i;
		for(i=0; i<dl; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	private static void kwadrat(int wys, int szer) {
		
	}
}
