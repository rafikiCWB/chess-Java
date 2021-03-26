package boardgame;

public class Board {

    private int rows;// quantidade linhas
    private int columns;//quntidade colunas
    private Piece[][] pieces; //matrix de peças

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    //recebe linha e coluna retornando essa peça
    public Piece piece(int row, int columns) {
        return pieces[row][columns];
    }

    //Sobrecarda desse metodo a cima, recebendo a posição
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}
