package padroescomportamentais.visitor.rh;

public interface Visitor {
    String exibirDesenvolvedor(Desenvolvedor desenvolvedor);
    String exibirGerente(Gerente gerente);
    String exibirDiretor(Diretor diretor);
}
