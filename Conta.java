package checkpoint;

public class Conta {
	
	String nome;
	int numeroConta;
	double saldo;
	
	
	//Setando os valores
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	// Metodo Depositar/Sacar
	public void depositar(int deposito) {
		this.saldo = saldo + deposito;
	}

	public void sacar(int saque) {
		this.saldo = saldo - saque;
	}

	// Acesso aos atributos (getters)
	public String getNome() {
		return this.nome;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setNome("Jorge");
		conta1.setNumeroConta(1523);
		conta1.setSaldo(1500);
		System.out.println(conta1.getSaldo());
		conta1.depositar(100);
		System.out.println(conta1.getSaldo());
		
	}

}
