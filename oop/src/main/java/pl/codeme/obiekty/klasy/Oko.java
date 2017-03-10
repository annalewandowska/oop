package pl.codeme.obiekty.klasy;

import java.io.Serializable;

public class Oko implements Serializable{

	
	private static final long serialVersionUID = 96521090515788713L;
	private String kolor;
	
	public Oko(String kolor){
		this.kolor = kolor;
	}
	
	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}
}
