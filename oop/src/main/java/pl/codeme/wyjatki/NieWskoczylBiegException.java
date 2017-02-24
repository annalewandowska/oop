package pl.codeme.wyjatki;

public class NieWskoczylBiegException extends SkrzyniaBiegowException {

	private int ktoryBieg;
	
	public NieWskoczylBiegException(int ktoryBieg) {
		super();
		this.ktoryBieg = ktoryBieg;
	}
	
	public int getBieg() {
		return ktoryBieg;
	}
}
