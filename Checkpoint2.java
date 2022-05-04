public class ContaBancaria {
	
	//atributos
	private int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	//método construtor
	public ContaBancaria() {
		this.setSaldo(0);
		//this.saldo = 0;
		this.setStatus(false);
		//this.status = false;
	}
	
	//métodos operacionais
	public void abrirConta(String t) {
		this.setTipo(t); //"cc ou cp"
		this.setStatus(true); //ativando a conta
		if(t.equals("cc")) {
			this.setSaldo(50);
		}else if(t.equals("cp")) {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não encerrada");
			System.out.println("Saldo: " + this.getSaldo());
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta não encerrada");
			System.out.println("Saldo: " + this.getSaldo());
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float v) {
		if(this.isStatus()) {
			this.saldo += + v;
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Não foi possível realizar o depósito");
			System.out.println("Motivo " + (this.isStatus()? "Conta ativa!":"Conta inativa!"));
		}
	}
	
	public void sacar(float v) {
		if(this.isStatus()) {
			if(this.getSaldo() >= v) {
				//saldo = saldo - v;
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Saque não realizado - Conta inativa!");
		}
	}
	
	public void pagarMensalidade() {
		float v = 0; //variável local ao método
		//definindo o valor da mensalidade
		if(tipo.equals("cc")){
			v = 12;
		}else if(tipo.equals("cp")) {
			v = 20;
		}
		if(this.isStatus()) {
			this.saldo -= v;
			System.out.println("Obrigado " + this.getDono() + "Mensalidade paga com sucesso!");
		}
		else {
			System.out.println("Mansalidade não paga");
			System.out.println("Conta inativa!");
		}
	}
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Titular: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus()? "Ativa":"Inativa");
	}

	//getters e setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}

public class TesteContaBancaria {
	
	public static void main(String[] args) {
		ContaBancaria p1 = new ContaBancaria();
			p1.estadoAtual();
			p1.setDono("José");
			p1.abrirConta("cc");
			p1.setNumConta(1111);
			p1.estadoAtual();
			p1.depositar(500);
			System.out.println("Saldo: " + p1.getSaldo());
			p1.sacar(2000);
	}
}