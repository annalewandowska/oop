package pl.codeme.checkers;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private PawnColour colour;
	
	private List<Pawn> pawns = new ArrayList<Pawn>();

	public Player(String imie, PawnColour colour) {
		this.name = imie;
		this.colour = colour;
	}

	public Player getPlayer(){
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public PawnColour getColour(){
		return colour;
	}
	
	public void addPawn(Pawn pawn){
		pawns.add(pawn);
	}
	
	public void removePawn(Pawn pawn){
		pawns.remove(pawn);
	}
	
	public boolean hasPawns(){
		return pawns.size() > 0;
	}
	
}
