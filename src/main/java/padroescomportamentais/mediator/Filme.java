package padroescomportamentais.mediator;

public class Filme implements Mensagens {

    private static Filme instancia = new Filme();

    private Filme() {}

    public static Filme getInstancia() {
        return instancia;
    }

    public String receberCritica(String mensagem) {
        return "Comentário: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "Comentário: " + mensagem;
    }

}
