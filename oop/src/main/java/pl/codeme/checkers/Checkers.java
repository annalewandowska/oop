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
		
		//while(player1.hasPawns() && player2.hasPawns()){
		while(true){
			int pozStart[] = null;
			int moves[][] = null;

			scrCh.drawScreenCheckers(board);
			pozStart = readStartPos(currentPlayer, board);
			readMoves(currentPlayer, board, pozStart);
		
//			simpleMove(currentPlayer, board, pozStart, moves);
	//		jumpMove(currentPlayer, board, pozStart, moves);
			
//			System.out.println(pozStart[0]);
//			System.out.println(pozStart[1]);
			
			if(currentPlayer == player1){
				currentPlayer = player2;
			}else {
				currentPlayer = player1;
			}
		}
	}
	
	private static void simpleMove(Player player, Pawn[][] board, int[] pozStart, int[] move){
		int x,y;
		x = move[0];
		y = move[1];
		
		board[x][y] = board[pozStart[0]][pozStart[1]];
		board[pozStart[0]][pozStart[1]] = null;
	}
	
	private static void jumpMove(Player player, Pawn[][] board, int[] pozStart, int[] move){
	
		int dx = move[0] - pozStart[0];
		int dy = move[1] - pozStart[1];
		
		board[move[0]][move[1]] = board[pozStart[0]][pozStart[1]];
		board[pozStart[0]][pozStart[1]] = null;
		
		if(dx > 0 && dy > 0){
			player.removePawn(board[move[0] - 1][move[1] - 1]);
			board[move[0] - 1][move[1] - 1] = null;
		}
		if(dx > 0 && dy < 0){
			player.removePawn(board[move[0] - 1][move[1] + 1]);
			board[move[0] - 1][move[1] + 1] = null;
		}
		if(dx < 0 && dy > 0){
			player.removePawn(board[move[0] + 1][move[1] - 1]);
			board[move[0] + 1][move[1] - 1] = null;
		}
		if(dx < 0 && dy < 0){
			player.removePawn(board[move[0] + 1][move[1] + 1]);
			board[move[0] + 1][move[1] + 1] = null;
		}
	}
	
	private static int[] readStartPos(Player player, Pawn[][] board){
		int pozStart[] = new int[2];
		pozStart = askUserAboutPawn();
		
		if(board[pozStart[0]][pozStart[1]] == null){
				pozStart = askUserAboutPawn();
		} else if(board[pozStart[0]][pozStart[1]].getPlayer() != player){
			System.out.println("To nie Twój pionek");
			pozStart = readStartPos(player, board);
		}
		return pozStart;
	}
	
	private static int[] askUserAboutPawn(){
		
		Scanner sc = new Scanner(System.in);
		int pozStart[] = new int[2];
		
		System.out.print("Choose pawn x: ");
		pozStart[0] = sc.nextInt() - 1;
		System.out.print("Choose pawn y: ");
		pozStart[1] = sc.nextInt() - 1;
		return pozStart;
	}
	
	  private static void readMoves(Player player, Pawn[][] board, int[] pozStart) {

		  int[] move = new int[2];

		  int dx = 0;
		  int dy = 0;

		  move = askUserAboutMoves();

		  if(board[move[0]][move[1]] != null){
			  System.out.println("Nie mo¿esz siê tu ruszyæ, wybierz jeszcze raz");
			  move = askUserAboutMoves();  
		  }

		  dx = Math.abs(pozStart[0] - move[0]);
		  dy = Math.abs(pozStart[1] - move[1]);
//		  System.out.println("dx " + dx);
//		  System.out.println("dy " + dy);

		  if (dx  == 1 && dy == 1) {
			  simpleMove(player, board, pozStart, move);
		  }

		  else if (dx  == 2 && dy == 2){
			  jumpMove(player, board, pozStart, move);
			  
			  while( checkIfCapturePossible(player, board, move)){
				  int[] tmpMove = move;
				  move = askUserAboutMoves();  
				  jumpMove(player, board, tmpMove, move);
			  }
		  }	else System.out.println("B³¹d!");
		  
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
	  
	  public static boolean checkIfCapturePossible(Player player, Pawn[][] board, int[] move){
		  
		  boolean check = false;
		  
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


/*
//dopóki currentPlayer poda z³e pozycje{
	//zapytaj currentPlayer którym pionkiem chce ruszyæ
	//spytaj currentPlayer gdzie chce ruszyæ pionkiem
	 * listê kolejnych ruchów danym pionkiem
//}
 
 rusz pionek currentPlayer z pozycji 1 na poz 2
 
 sprawdŸ czy nie koniec gry
 
 ustaw currentPlayer na kolejnego gracza

 */