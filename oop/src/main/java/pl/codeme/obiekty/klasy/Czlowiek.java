package pl.codeme.obiekty.klasy;

import java.io.Serializable;

public class Czlowiek implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int wiek = 30;
	private int wzrost = 175;
	
	private /*transient*/ Oko[] oczy;
	
	public Czlowiek(){
		oczy = new Oko[2];
		oczy[0] = new Oko("Zielone");
		oczy[1] = new Oko("Czerwone");
		
	}
	public Oko getOko(int ktore){
		return oczy[ktore];
	}
	
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	public int getWzrost() {
		return wzrost;
	}
	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}
	
	
}
