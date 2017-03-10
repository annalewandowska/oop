package pl.codeme.obiekty;

import pl.codeme.obiekty.klasy.Bmw;
import pl.codeme.obiekty.klasy.Samochod;
import pl.codeme.wyjatki.NieWskoczylBiegException;
import pl.codeme.wyjatki.SamochodException;
import pl.codeme.wyjatki.SkrzyniaBiegowException;

public class Przyklad1 {

	public static void main(String[] args) {

		Samochod.zanieczyszczenie = 150;
		Samochod bryka1 = new Bmw();
		Samochod bryka2 = new Bmw();
		
		System.out.println("Zanieczyszczenie 1: " + bryka1.zanieczyszczenie);
		System.out.println("Zanieczyszczenie 2: " + bryka2.zanieczyszczenie);
		

		System.out.println("Zanieczyszczenie 1: " + bryka1.zanieczyszczenie);
		System.out.println("Zanieczyszczenie 2: " + bryka2.zanieczyszczenie);

//		bryka1 = new Samochod();
//		bryka2 = new Samochod();
		
		bryka2.setWlasciciel("Zbyszek");
		
		System.out.println("Bryka 1 : " + bryka1.getWlasciciel());
		System.out.println("Bryka 2 : " + bryka2.getWlasciciel());
		
		try {
			bryka1.przyspiesz();
			bryka1.przyspiesz();
		} catch (NieWskoczylBiegException ex) {
			StackTraceElement stack[] = ex.getStackTrace();
			for(int i = 0; i < stack.length; i++){
				System.out.println(stack[i].getClassName() +"->" + stack[i].getFileName() + "->" + stack[i].getMethodName() + "->"
						+ stack[i].getLineNumber());
			}
			System.out.println(ex.getMessage());
			System.out.println("NIE WSKOCZYL BIEG " + ex.getBieg());
		} catch (RuntimeException ex) {
			System.out.println("WYST¥PI£ Z£Y B£¥D!");
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
		((Bmw)bryka1).przyspiesz(5);
		System.out.println("Bryka 1 - predkosc " + bryka1.getPredkosc());
		System.out.println("Bryka 2 - predkosc " + bryka2.getPredkosc());
		
		Object bryka3 = new Bmw();
//		bryka3.lans = 100;
	}

}
