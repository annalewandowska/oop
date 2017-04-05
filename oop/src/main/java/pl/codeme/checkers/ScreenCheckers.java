package pl.codeme.checkers;


public class ScreenCheckers {

	protected String[][] screenCh;
	protected int height = 8;
	protected int width = 8;
	
	public ScreenCheckers(){
//		this.height = height;
//		this.width = width;
//		
		screenCh = new String[width][height];
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				screenCh[j][i] = "";
			}
		}
	}
	
	public void drawScreenCheckers(Pawn[][] board){
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				
				if(board[i][j] == null){
					screenCh[i][j] = "_|";
				}
				else { 
					if(board[i][j].getPlayer().getColour() == PawnColour.WHITE){
					screenCh[i][j] = "W|";
					}else {
						screenCh[i][j] = "B|";
					}
				}
			}
		}
		System.out.print("| |1|2|3|4|5|6|7|8|");
		System.out.println();

		for(int i = 1; i < height+1; i++){
			System.out.print("|" + i + "|");
			for(int j = 0; j < width; j++){
				System.out.print(screenCh[j][i-1]);
			}	
			System.out.println();
		}

	}
	
	
	public void drawPoint(int x, int y, char chr){
		//screen[x][y].set(chr);
	}
}
