package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EspectadorTest {

    @Test
    void deveElogiarFilme() {
        Espectador espectador = new Espectador();
        assertEquals("Obrigado pelo comentário.\nVamos adicionar seu comentário aos demais.\n" +
                ">>Comentário: Ótimo Filme",
                espectador.elogiar("Ótimo Filme"));
    }

    @Test
    void deveCriticarFilme() {
        Espectador espectador = new Espectador();
        assertEquals("Obrigado pelo comentário.\nVamos adicionar seu comentário aos demais.\n" +
                ">>Comentário: Filme muito ruim",
                espectador.criticar("Filme muito ruim"));
    }

}