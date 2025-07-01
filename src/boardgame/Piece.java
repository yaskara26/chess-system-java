package boardgame;

public abstract class Piece {
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
	
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMoves() {
		boolean[][] mat = possibleMoves();
		
		for (int i=0; i<mat.length; i++) {
			for (int j = 0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
