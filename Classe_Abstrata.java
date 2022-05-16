package classeAbstrata;

public abstract class Animal {
	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void fazerBarulho();
	
	
}

package classeAbstrata;

public class Cachorro extends Animal {

	@Override
	public void fazerBarulho() {
		System.out.println("Au Au!");
	}
	

}

package classeAbstrata;

public class Gato  extends Animal {

	@Override
	public void fazerBarulho() {
		System.out.println("Miau!");
		
	}

}

package classeAbstrata;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.setNome("Barney");
		System.out.println("Nome: " + dog.getNome());
		dog.fazerBarulho();
		Gato cat = new Gato();
		cat.setNome("Mike");
		System.out.println("Nome: " + cat.getNome());
		cat.fazerBarulho();

	}

}

-----------------------------------

package Exemplo2;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Empregado() {
		
	}
	
	public Empregado(String n, String s, String c) {
		this.setNome(n);
		this.setSobrenome(s);
		this.setCpf(c);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//método abstrato
	public abstract double vencimento();
	
}

package Exemplo2;

public class Assalariado extends Empregado {

	private double salario;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double vencimento() {
		return this.getSalario();
	}

}

package Exemplo2;

public class Comissionado extends Empregado {
	
	private double totalVendas;
	private double taxaComissao;
	
	public double getTotalVendas() {
		return totalVendas;
	}


	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}


	public double getTaxaComissao() {
		return taxaComissao;
	}


	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}


	@Override
	public double vencimento() {
		return this.getTotalVendas() * taxaComissao;
	}
	

}

package Exemplo2;

public class Horista extends Empregado{
	
	private double precoHora;
	private double horasTrabalhadas;
	
	public double getPrecoHora() {
		return precoHora;
	}


	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}


	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	@Override
	public double vencimento() {
		return this.getPrecoHora() * getHorasTrabalhadas();
	}

}



