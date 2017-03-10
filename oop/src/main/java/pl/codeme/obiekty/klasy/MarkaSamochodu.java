package pl.codeme.obiekty.klasy;

public enum MarkaSamochodu {
	BMW (5, "Niemcy"), 
	FIAT (1, "W³ochy"), 
	AUDI (4, "Niemcy"), 
	TOYOTA (2, "Japonia");
	
	private int lans;
	private String pochodzenie;
	
	private MarkaSamochodu(int lans, String pochodzenie) {
		this.lans = lans;
		this.pochodzenie = pochodzenie;
	}
	
	public int getLans(){
		return lans;
	}
	
	public String getPochodzenie(){
		return pochodzenie;
	}
}
