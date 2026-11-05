package padroescomportamentais.visitor.rh;

public class Desenvolvedor implements Funcionario {

    private int matricula;
    private String nome;
    private int projetosConcluidos;

    public Desenvolvedor(int matricula, String nome, int projetosConcluidos) {
        this.matricula = matricula;
        this.nome = nome;
        this.projetosConcluidos = projetosConcluidos;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getProjetosConcluidos() {
        return projetosConcluidos;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirDesenvolvedor(this);
    }
}
