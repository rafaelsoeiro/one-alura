package excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException{
    private String message;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.message = mensagem;
    }
    public String getMessage() {
        return this.message;
    }
}
