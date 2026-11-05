package padroescomportamentais.visitor.rh;

public class Gerente implements Funcionario {

    private int matricula;
    private String nome;
    private Departamento departamento;
    private int metasBatidas;

    public Gerente(int matricula, String nome, Departamento departamento, int metasBatidas) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.metasBatidas = metasBatidas;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getNomeDepartamento() {
        return this.departamento.getNome();
    }

    public int getMetasBatidas() {
        return metasBatidas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
}
