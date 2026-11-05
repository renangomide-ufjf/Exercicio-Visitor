package padroescomportamentais.visitor.rh;

public class RelatorioDesempenhoVisitor implements Visitor {

    public String exibir(Funcionario funcionario) {
        return funcionario.aceitar(this);
    }

    @Override
    public String exibirDesenvolvedor(Desenvolvedor desenvolvedor) {
        return "Desenvolvedor{" +
                "matricula=" + desenvolvedor.getMatricula() +
                ", nome='" + desenvolvedor.getNome() + '\'' +
                ", projetosConcluidos=" + desenvolvedor.getProjetosConcluidos() +
                '}';
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "matricula=" + gerente.getMatricula() +
                ", nome='" + gerente.getNome() + '\'' +
                ", departamento=" + gerente.getNomeDepartamento() +
                ", metasBatidas=" + gerente.getMetasBatidas() +
                '}';
    }

    @Override
    public String exibirDiretor(Diretor diretor) {
        return "Diretor{" +
                "matricula=" + diretor.getMatricula() +
                ", nome='" + diretor.getNome() + '\'' +
                ", lucroAlcancado=" + diretor.getLucroAlcancado() +
                '}';
    }
}
