package pl.codeme.obiekty.klasy;

public class Tablice {

	public static void main(String[] args) {
		int tablica[] = new int[50];
		
		System.out.println(args[0]);
		
		int n = 7;

		for (int el : tablica ) {
			System.out.println(el);
		}
		
//	Point screen[][] = new Point[100][200];
		
		getTable2(tablica, n);
	
		for(int i=0; i<tablica.length; i++) {
			System.out.print(' ');
			System.out.print(tablica[i]);
		}

		System.out.println("\n" + n);
	}

	private static int[] getTable(int length, int n) {
		int tab[] = new int[length];
		int i;
		
		tab[0] = 1;
		
		for(i=1; i<length; i++) {
			tab[i] = tab[i-1] + n;
		}

		return tab;
	}
	
	private static void getTable2(int tab[], int n) {
		int i;
		
		tab[0] = 1;
		for(i=1; i<tab.length; i++) {
			tab[i] = tab[i-1] + n;
		}
		
		n = 1000;
	}
	
	void g() {
	char screen[][] = new char[10][20];
	
	int x,y;
	for(y=0;y<screen.length; y++) {
		for(x=0; x<screen[y].length; x++) {
			screen[y][x] = 'x';
		}
	}

	screen[5][7] = 'O';
	
	for(y=0;y<screen.length; y++) {
		for(x=0; x<screen[y].length; x++) {
//			System.out.print(screen[y][x]);
		}
//		System.out.println();
	}
	}
}
