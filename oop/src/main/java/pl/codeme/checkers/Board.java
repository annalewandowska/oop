package pl.codeme.checkers;

public class Board {

	private Pawn[][] board = new Pawn[8][8];
	
	public Board(Player player1, Player player2){
//		//set pawns for player1
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i + j < 8; i+=2){
				board[j][i + j] = new Pawn(player1);
			}
		}
		board[2][0] = new Pawn(player1);
		
		//set pawns for player2
		int k = 0;
		for(int j = 7; j > 4; j--) {
			for(int i = 1; i + k < 8; i+=2){
				board[j][i + k] = new Pawn(player2);
			}
			k++;
		}
		board[6][0] = new Pawn(player2);
		board[5][1] = new Pawn(player2);
		
		
//		board[0][0] = new Pawn(player1);
//		board[1][1] = new Pawn(player2);
//		board[3][3] = new Pawn(player2);
//		board[7][7] = new Pawn(player2);
	}

	
	public Pawn[][] getBoard(){
		
		return board;
	}
}
