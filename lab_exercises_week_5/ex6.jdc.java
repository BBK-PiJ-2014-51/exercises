// 
// Create a method that calculates the solution to the problem of the eight Dames: “given a 
// chess board, and knowing that the Dame can reach any tile horizontally, vertically, or 
// diagonally, place 8 Dames on the board so that none of them can reach the others by 
// doing only one move”. You can return the solution as an array of 8x8 booleans where 
// eight tiles are true (those with the Dames on them) and the others are false.
// For extra complexity, make your method return all the possibilities in which the problem 
// can be solved (this may take a long time).

Chessboard board = new Chessboard();
board.clearBoard();
board.placeQueen('c',3);
board.printBoard(); 



class Chessboard{
	int boardSize = 8;
	boolean[][] board = new boolean[boardSize][boardSize];
	
	
	
	public void clearBoard(){
		for (int i = 0; i < boardSize; i++){
			for (int j = 0; j < boardSize; j++){
				board[i][j] = false;		
			}		
		}
	}
	
	public void printBoard(){
		for (int i = 0; i < boardSize; i++){
			for (int j = 0; j < boardSize; j++){
				String symbol = (board[i][j]) ? "Q" : "-";
				print("\t" + symbol);
			}
			println();
		}
	}
	
	public boolean placeQueen(char columnLetter, int row){
		int col = Character.toLowerCase(columnLetter) - 'a';
		if ((col >= 0 && col < boardSize)  && (row >=0 && row < boardSize)){
			board[col][row] = true;
			return true;
		} else{
			println("invalid move");
		}
		return false;		
	}

}