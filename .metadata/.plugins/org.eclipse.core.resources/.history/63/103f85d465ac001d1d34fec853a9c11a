package entities;
import java.util.Date;
import java.util.List;

public class Funcionario {

    private String nome;
    private int matricula;
    private Setor setor;
    private Date dataNascimento;
    private List<Dependentes> dependentes;


    public Funcionario() {
    }
    
    public Funcionario(String nome, int matricula, Setor setor, Date dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
        this.dataNascimento = dataNascimento;
    }

    public Funcionario(String nome, int matricula, Setor setor, Date dataNascimento, List<Dependentes> dependentes) {
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
        this.dataNascimento = dataNascimento;
        this.dependentes = dependentes;
    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<Dependentes> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependentes> dependentes) {
        this.dependentes = dependentes;
    }
    
    @Override
    public String toString() {
        return "Funcionario: " +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", setor=" + setor +
                ", data de nascimento=" + dataNascimento +
                ", dependentes=" + dependentes;
    }

}