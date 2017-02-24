package pl.codeme.obiekty.klasy;

import java.io.Serializable;

import pl.codeme.wyjatki.NieWskoczylBiegException;

public abstract class Samochod implements Pojazd, Serializable /* extends Object <- wykonywane niejawnie! */ {
	private int kierownica;
	private int drzwi;
	private int silnik;
	protected int predkosc;
	private String wlasciciel;
	
	public static int zanieczyszczenie = 100;
	
	static {
		System.out.println("Ładuję klasę samochod");
	}

	protected int lans = 0;

	public Samochod(String wlasciciel) {
		super();
		this.wlasciciel = wlasciciel;
	}

	public Samochod() {
		wlasciciel = "Fabryka";
	}
	
	public int getKierownica() {
		return kierownica;
	}

	public void setKierownica(int kierownica) {
		this.kierownica = kierownica;
	}

	public int getDrzwi() {
		return drzwi;
	}

	public void setDrzwi(int drzwi) {
		this.drzwi = drzwi;
	}

	public int getSilnik() {
		return silnik;
	}

	public void setSilnik(int silnik) {
		this.silnik = silnik;
	}

	public int getPredkosc() {
		return predkosc;
	}

	public void setPredkosc(int predkosc) {
		this.predkosc = predkosc;
	}

	public String getWlasciciel() {
		return wlasciciel;
	}
	
	public void setWlasciciel(String wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

	public abstract void przyspiesz() throws NieWskoczylBiegException;
	
	@Override
	public String toString() {
		return "Samochod [kierownica=" + kierownica + ", drzwi=" + drzwi + ", silnik=" + silnik + ", predkosc="
				+ predkosc + ", wlasciciel=" + wlasciciel + "]\n" + super.toString();
	}
	
	
}
