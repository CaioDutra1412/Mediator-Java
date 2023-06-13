package padroescomportamentais.mediator;

public class Audit {

    private static Audit instancia = new Audit();

    private Audit() {}

    public static Audit getInstancia() {
        return instancia;
    }

    public String receberElogio(String mensagem) {
        return "Obrigado pelo comentário.\n"+
                "Vamos adicionar seu comentário aos demais.\n" +
                ">>" + Filme.getInstancia().receberElogio(mensagem);
    }

    public String receberCritica(String mensagem) {
        return "Obrigado pelo comentário.\n"+
                "Vamos adicionar seu comentário aos demais.\n" +
                ">>" + Filme.getInstancia().receberCritica(mensagem);
    }

}
