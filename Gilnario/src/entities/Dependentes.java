package entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Dependentes {
	
	private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	
    private String nome;
    private Date dataNascimento;

    public Dependentes() {
    }

	public Dependentes(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}


	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
        return "Dependente: " +
                "nome='" + nome + '\'' +
                ", dataNascimento = " + fmt.format(dataNascimento);
    }

}
