package chess;

import boardgame.Board;
import boardgame.Piece;
            //peça de xadrez
public class ChessPiece extends Piece {

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

}
