package padroescomportamentais.visitor.rh;

public class Diretor implements Funcionario {

    private int matricula;
    private String nome;
    private float lucroAlcancado;

    public Diretor(int matricula, String nome, float lucroAlcancado) {
        this.matricula = matricula;
        this.nome = nome;
        this.lucroAlcancado = lucroAlcancado;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getLucroAlcancado() {
        return lucroAlcancado;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirDiretor(this);
    }
}
