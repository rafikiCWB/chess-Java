package chess;

import boardgame.BoardException;
                                    //Antes era ChessException agora mudei para BoardException pq uma exceção de chess tambem é uma exceção de board.
public class ChessException extends BoardException {

    public ChessException(String msg){
        super(msg);

    }
}
