package pl.codeme.checkers;

public class Board {

	private Pawn[][] board = new Pawn[8][8];
	
	public Board(Player player1, Player player2){
		//set pawns for player1
		for(int j = 0; j < 3; j++)
			for(int i = 0; i + j < 8; i+=2){
				board[j][i + j] = new Pawn(player1);
			}
		
//		board[0][0] = new Pawn(player1);
//		board[0][2] = new Pawn(player1);
//		board[0][4] = new Pawn(player1);
//		board[0][6] = new Pawn(player1);
		
		//set pawns for player2
		board[7][1] = new Pawn(player2);
		board[7][3] = new Pawn(player2);
		board[7][5] = new Pawn(player2);
		board[7][7] = new Pawn(player2);
	}
	
	public Pawn[][] getBoard(){
		
		return board;
	}
}
