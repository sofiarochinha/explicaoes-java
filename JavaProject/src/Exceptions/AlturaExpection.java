package Exceptions;

/**
 * https://www.javatpoint.com/types-of-exception-in-java
 */
public class AlturaExpection extends RuntimeException{

    String mensagem;

    public AlturaExpection(){
        this.mensagem = "A altura tem de ser positiva";
    }

    @Override
    public String toString() {
        return "AlturaExpection{" +
                "mensagem='" + mensagem + '\'' +
                '}';
    }
}
