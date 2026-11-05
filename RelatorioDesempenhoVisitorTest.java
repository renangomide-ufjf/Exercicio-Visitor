package padroescomportamentais.visitor.rh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioDesempenhoVisitorTest {

    @Test
    void deveExibirDesenvolvedor() {
        Desenvolvedor desenvolvedor = new Desenvolvedor(1, "Lucas", 12);
        RelatorioDesempenhoVisitor visitor = new RelatorioDesempenhoVisitor();
        assertEquals("Desenvolvedor{matricula=1, nome='Lucas', projetosConcluidos=12}", visitor.exibir(desenvolvedor));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente(2, "Carla", new Departamento("Engenharia de Software"), 5);
        RelatorioDesempenhoVisitor visitor = new RelatorioDesempenhoVisitor();
        assertEquals("Gerente{matricula=2, nome='Carla', departamento=Engenharia de Software, metasBatidas=5}", visitor.exibir(gerente));
    }

    @Test
    void deveExibirDiretor() {
        Diretor diretor = new Diretor(3, "Roberto", 1500000.0f);
        RelatorioDesempenhoVisitor visitor = new RelatorioDesempenhoVisitor();
        assertEquals("Diretor{matricula=3, nome='Roberto', lucroAlcancado=1500000.0}", visitor.exibir(diretor));
    }
}
