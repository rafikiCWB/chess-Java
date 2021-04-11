package boardgame;

public abstract class Piece {

    protected Position position;//posição
    private Board board;//tabuleiro

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possiblesMoves();

    public boolean possibleMovie(Position position) {
        return possiblesMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possiblesMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {// menor que mat.lenght porque estou presumindo que meu tabuleiro de xadres é quadrado
                if (mat[i][j]) { // Se a minha na linha i coluna j for verdadeira.. return true se não retorne false
                    return true;
                }
            }
        }
        return false;
    }
}
