package boardgame;

public class BoardException extends RuntimeException{

    private static final long serialVersionUID =1L;

    //Esse contrutor ele vai simplismente repassar essa msg para o construtor da super classe que é o RuntimeException
    //msg de error!
    public BoardException(String msg){
        super(msg);
    }

}
