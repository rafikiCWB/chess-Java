package chess;

import boardgame.Board;

//Coração do meu jogo de xadrex, pois é onde ficará as regras do jogo;
public class ChessMatch {
    //declarado o tabuleiro
    private Board board;

    //Dimenção do tabuleiro de xadrez;
    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows();i++){
            for(int j =0; i<board.getColumns();i++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
}
