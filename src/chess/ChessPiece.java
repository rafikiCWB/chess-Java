package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

//peça de xadrez
public abstract class ChessPiece extends Piece {

    private Color color;

    //Foi preciso criar o construtor aqui na classe ChessPiece também, pq a Classe Piece tem o contrutor; e essa clase extends Piece.
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //Ciado apenas o get pois eu quero receber a cor da peça e não modifica-la.
    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
