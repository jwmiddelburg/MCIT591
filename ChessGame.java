
public class ChessGame {

	ChessPiece[][] board = new ChessPiece[8][8];
	
	void display() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(board[i][j] == null) {
					System.out.print("__");
				}
				else {
					System.out.print("" + board[i][j].color.charAt(0) + board[i][j].type.charAt(0));
				}
			}
			System.out.println("");
		}
	}
	
	
	
	public static void main(String[] args) {
		ChessGame game = new ChessGame();
		
		ChessPiece blackRook = new ChessPiece();
		blackRook.color = "black";
		blackRook.type = "rook";
		
		game.board[0][0] = blackRook;
		
		ChessPiece blackKnight = new ChessPiece();
		blackKnight.color = "black";
		blackKnight.type = "knight";
		
		game.board[0][1] = blackKnight;
		
		for (int i = 0; i < 8; i++) {
			ChessPiece whitePawn = new ChessPiece();
			whitePawn.color = "white";
			whitePawn.type = "pawn";
			game.board[6][i] = whitePawn;
			
		}
		
		game.display();
		
		
		
	}
}
