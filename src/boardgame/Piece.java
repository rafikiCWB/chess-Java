package boardgame;

public class Piece {

    protected Position position;//posição
    private Board board;//tabuleiro

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard(){
        return board;
    }

}
