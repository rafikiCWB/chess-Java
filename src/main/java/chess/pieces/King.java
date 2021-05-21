package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position) {
        ChessPiece peca = (ChessPiece) getBoard().piece(position);
        return peca == null || peca.getColor() != getColor();
    }

    @Override
    public boolean[][] possiblesMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        var peca = new Position(0, 0);

        //above == acima  // Aqui estamos testando se a posição existe e se o rei pode mover para lá;
        peca.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }

        //move baixo
        peca.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }

        //move left
        peca.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }

        //move right
        peca.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }
        //move SO
        peca.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }
        //move NO
        peca.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }
        //move NE
        peca.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }
        //move SE
        peca.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(peca) && canMove(peca)) {
            mat[peca.getRow()][peca.getColumn()] = true;
        }
        return mat;
    }

}



