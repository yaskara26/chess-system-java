package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
//		não precisaria por q a position é null por padrao o java já interpretaria assim por não botarmos nada
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	

	
}
