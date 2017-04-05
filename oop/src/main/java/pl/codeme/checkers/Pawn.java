package pl.codeme.checkers;

public class Pawn {
	
	private boolean ladyPawn = false;
	private Player player;

	
	public Pawn(Player player) {
		this.player = player;
		player.addPawn(this);
	}

	public boolean isLadyPawn() {
		return ladyPawn;
	}

	public void setLadyPawn(boolean ladyPawn) {
		this.ladyPawn = ladyPawn;
	}

	public Player getPlayer() {
		return player;
	}
	
//
//	public void setPlayer(Player player) {
//		this.player = player;
//	}
	
	
}
