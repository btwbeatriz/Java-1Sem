package aula12_heranca;

import java.util.Date;

public class Pessoa {
	//atributos
	private String nome;
	private String cpf;
	private Date data_nascimento;
	
	//Construtor
	public Pessoa(String nome, String cpf, Date date) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setData_nascimento(date);
	}
	
	public double tirarCopias(int qtde) {
		return 0.10 * qtde;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	

}

package aula12_heranca;

import java.util.Date;

public class Aluno extends Pessoa{
	
	private String matricula;

	public Aluno(String nome, String cpf, Date date) {
		super(nome, cpf, date);
	}
	
	public double tirarCopias(int qtde) {
		return 0.07 * qtde;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}

package aula12_heranca;

import java.util.Date;

public class Funcionario extends Pessoa{

	private double salario;
    private Date data_admissao;
    private String cargo;
    
	public Funcionario(String nome, String cpf, Date date) {
		super(nome, cpf, date);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}

package aula12_heranca;

import java.util.Date;

public class Professor extends Pessoa{

	private double salario;
	private String disciplina;
	
	public Professor(String nome, String cpf, Date date) {
		super(nome, cpf, date);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}

