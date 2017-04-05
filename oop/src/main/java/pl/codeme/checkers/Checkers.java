package pl.codeme.checkers;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Checkers {

	public static void main(String[] args) {
		
		Player player1 = new Player("Asia", PawnColour.WHITE);
		Player player2 = new Player("Anka", PawnColour.BLACK);
		
		Board boardInit = new Board(player1, player2);
		Pawn[][] board = boardInit.getBoard();
		ScreenCheckers scrCh = new ScreenCheckers();

		Player currentPlayer = player1;
		Player opponent = player2;
		
		while(player1.hasPawns() && player2.hasPawns()){
			int pozStart[] = null;

			scrCh.drawScreenCheckers(board);
			System.out.println(currentPlayer.getColour() + " player turn");
			pozStart = readStartPos(currentPlayer, board);
			readMoves(currentPlayer, opponent, board, pozStart);
			
			if(currentPlayer == player1){
				currentPlayer = player2;
				opponent = player1;
			}else {
				currentPlayer = player1;
				opponent = player2;
			}
		}
		scrCh.drawScreenCheckers(board);
		System.out.println("Zwyciê¿y³ gracz: " + opponent.getColour());
	}
	
	private static void simpleMove(Player player, Pawn[][] board, int[] pozStart, int[] move){
		int x,y;
		x = move[0];
		y = move[1];
		
		board[x][y] = board[pozStart[0]][pozStart[1]];
		board[pozStart[0]][pozStart[1]] = null;
	}
	
	private static void jumpMove(Player player, Player opponent, Pawn[][] board, int[] pozStart, int[] move){
			
		int dx = move[0] - pozStart[0];
		int dy = move[1] - pozStart[1];
		
		board[move[0]][move[1]] = board[pozStart[0]][pozStart[1]];
		board[pozStart[0]][pozStart[1]] = null;
		
		if(dx > 0 && dy > 0){
			opponent.removePawn(board[move[0] - 1][move[1] - 1]);
			board[move[0] - 1][move[1] - 1] = null;
		}
		if(dx > 0 && dy < 0){
			opponent.removePawn(board[move[0] - 1][move[1] + 1]);
			board[move[0] - 1][move[1] + 1] = null;
		}
		if(dx < 0 && dy > 0){
			opponent.removePawn(board[move[0] + 1][move[1] - 1]);
			board[move[0] + 1][move[1] - 1] = null;
		}
		if(dx < 0 && dy < 0){
			opponent.removePawn(board[move[0] + 1][move[1] + 1]);
			board[move[0] + 1][move[1] + 1] = null;
		}
	}
	
	private static int[] readStartPos(Player player, Pawn[][] board){
		int pozStart[] = new int[2];
		pozStart = askUserAboutPawn();
		
		if(board[pozStart[0]][pozStart[1]] == null){
			System.out.println("There is no pawn here, try again");
			pozStart = readStartPos(player, board);
		} else if(board[pozStart[0]][pozStart[1]].getPlayer() != player){
			System.out.println("This is not your pawn, try again");
			pozStart = readStartPos(player, board);
		}
		return pozStart;
	}
	
	private static int[] askUserAboutPawn(){
		
		Scanner sc = new Scanner(System.in);
		int pozStart[] = new int[2];
		
		System.out.print("Choose pawn, x: ");
		pozStart[0] = sc.nextInt() - 1;
		System.out.print("Choose pawn, y: ");
		pozStart[1] = sc.nextInt() - 1;
		return pozStart;
	}

	private static int[] askUserAboutMoves(){
		int[] move = new int[2];

		Scanner input = new Scanner(System.in);

		System.out.println("Where do you want to move x? ");
		move[0] = input.nextInt() - 1;
		//String str = input.nextLine();
		System.out.println("Where do you want to move y? ");
		move[1] = input.nextInt()-1;

		// input.close();

		return move;
	}
	
	  private static void readMoves(Player player, Player opponent, Pawn[][] board, int[] pozStart) {

		  ScreenCheckers scrCh = new ScreenCheckers();
		  int[] move = new int[2];

		  int dx = 0;
		  int dy = 0;

		  move = askUserAboutMoves();
		  
		  //dopisaæ funkcjê checkIfMovePossible i dodaæ do if
		  if(board[move[0]][move[1]] != null){
			  System.out.println("You can't move here, choose again");
			  move = askUserAboutMoves();  
		  }

		  dx = Math.abs(pozStart[0] - move[0]);
		  dy = Math.abs(pozStart[1] - move[1]);

		  if (dx  == 1 && dy == 1) {
			  simpleMove(player, board, pozStart, move);
		  }

		  else if (dx  == 2 && dy == 2){
			  jumpMove(player, opponent, board, pozStart, move);
			  
			  while(checkIfCapturePossible(player, board, move)){
				  int[] tmpMove = move;
				  scrCh.drawScreenCheckers(board);
				  System.out.println(player.getColour() + " can capture another pawn");
				  move = askUserAboutMoves();  
				  jumpMove(player, opponent, board, tmpMove, move);
			  }
		  }	else System.out.println("You can't move here!");
		  
	  }

	  
	  public static boolean checkIfCapturePossible(Player player, Pawn[][] board, int[] move){
		  
		  boolean check = true;
		  
		  Player currentPlayer = board[move[0]][move[1]].getPlayer();
//		  System.out.println(currentPlayer.getName());
//		  
//		  if(  board[move[0]-1][move[1]-1] != null && board[move[0]-1][move[1]-1].getPlayer() != currentPlayer && (move[0]-1 >= 0 && move[1]-1 >= 0)
//			|| board[move[0]+1][move[1]+1] != null && board[move[0]+1][move[1]+1].getPlayer() != currentPlayer && (move[0]+1 <= 7 && move[1]+1 <= 7)
//			|| board[move[0]-1][move[1]+1] != null && board[move[0]-1][move[1]+1].getPlayer() != currentPlayer && (move[0]-1 >= 0 && move[1]+1 <= 7)
//			|| board[move[0]+1][move[1]-1] != null && board[move[0]+1][move[1]-1].getPlayer() != currentPlayer && (move[0]+1 <= 7 && move[1]-1 >= 0)){
//			check = true;
//		  }
		  return check;
	  }

}


