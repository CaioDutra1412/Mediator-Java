package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiar(String mensagem) {
        return Audit.getInstancia().receberElogio(mensagem);
    }

    public String criticar(String mensagem) {
        return Audit.getInstancia().receberCritica(mensagem);
    }

}
