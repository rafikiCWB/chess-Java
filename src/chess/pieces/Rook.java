package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possiblesMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        var p = new Position(0, 0);

        //Logica pra mover a torre para cima;
        p.setValues(position.getRow() - 1, position.getColumn());
        //Enquanto a posiçao p existir e não tiver uma peça lá;
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            // enquanto a posição estiver livre posso seguir em frente;
            mat[p.getRow()][p.getColumn()] = true;
            //aqui a peça continua andando enquanto tiver casas vazias
            p.setRow(p.getRow() - 1);
        }
        //se existir uma peça adiversaria a frente tomar o lugar dela;
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        // Lógica para mover a torre para esquerda;
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        //Lógica para mover a torre para direita;
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getColumn()][p.getRow()] = true;
            p.setColumn(p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        //lógica para mover para baixo;
        p.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        return mat;
    }
}
