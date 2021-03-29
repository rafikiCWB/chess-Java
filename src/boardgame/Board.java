package boardgame;

public class Board { //tabuleiro

    private int rows;// quantidade linhas
    private int columns;//quntidade colunas
    private Piece[][] pieces; //matrix de peças

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //recebe linha e coluna retornando essa peça
    public Piece piece(int row, int columns) {
        if (!positionExists(row, columns)) {
            throw new BoardException("Possition not on the board");
        }
        return pieces[row][columns];
    }

    //Sobrecarga desse metodo a cima, recebendo a posição
    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Possition not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on possition " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    //metodo para remover uma peça do board
    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        if (piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[(position.getRow())][position.getColumn()] = null;
        return aux;
    }

    // metodo aux do metodo PossitionExists ->
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }    //linha >= 0 && linha < altura do tabuleiro && coluna >=0 && colunas < colums;

    //Com base do metodo a cima // reaproveitando
    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }
    //há uma peça. Metodo que testa se ha position existe

    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Possition not on the board");
        }
        return piece(position) != null;
    }


}
