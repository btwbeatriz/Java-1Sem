package chekpoint3;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;
	
	public Contribuinte(String n, double r) {
		this.nome = n;
		this.rendaBruta = r;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double renda) {
		this.rendaBruta = renda;
	}
	
	@Override
	public String toString(){
		return "Contribuinte: \nNome: " + nome + "\nRenda Bruta: R$ " + rendaBruta + "\n"; 
	}
	
	//método abstrato
	public abstract double calcularImposto();

}

package chekpoint3;

public class PessoaFisica extends Contribuinte {
	private String cpf;
	
	public PessoaFisica(String n, double r, String cpf) {
		super(n, r);
		this.setCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImposto() {
		double renda = super.getRendaBruta();
		double imposto = 0;
		
		if(renda <= 1500) {
			imposto = 0;
		}else if(renda >= 1501 && renda <= 3000) {
			imposto = (renda*0.75) - 100;
		}else if(renda >= 3001) {
			imposto = (renda*0.15) - 225;
		}
		return imposto;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Pessoa Física \ncpf: " 
				+ this.getCpf() + "\nImposto a ser pago: R$ " 
				+ this.calcularImposto() + "\n";
	}
	
}

package chekpoint3;

public class PessoaJuridica extends Contribuinte {
	private String cnpj;
	
	public PessoaJuridica(String n, double r, String cnpj) {
		super(n, r);
		this.setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public double calcularImposto() {
		return super.getRendaBruta() * 0.1;
		
	}
	
	public String toString() {
		return super.toString() 
				+ "Pessoa Jurídica: \ncnpj: "
				+ this.getCnpj()
				+ "\nImposto a ser pago: R$ "
				+this.calcularImposto() + "\n";
	}
}

package chekpoint3;

public class TesteContribuinte {
public static void main(String[] args) {
	PessoaFisica p1 = new PessoaFisica("PF 1", 1000, "123.123.123-23");
	PessoaFisica p2 = new PessoaFisica("PF 2", 2000, "231.231.231-21");
	PessoaFisica p3 = new PessoaFisica("PF 3", 3000, "321.321.321-31");
	
	PessoaJuridica p4 = new PessoaJuridica("PJ 1", 8000, "44.123.890/001-44");
	PessoaJuridica p5 = new PessoaJuridica("PJ 2", 10000, "55.123.890/001-55");
	PessoaJuridica p6 = new PessoaJuridica("PJ 3", 12000, "66.123.890/001-66");
	
	Contribuinte[] contribuintes = new Contribuinte[6];
	contribuintes[0] = p1;
	contribuintes[1] = p2;
	contribuintes[2] = p3;
	contribuintes[3] = p4;
	contribuintes[4] = p5;
	contribuintes[5] = p6;
	
	for(int i=0; i<contribuintes.length; i++) {
		System.out.println(contribuintes[i].toString());
	}
	
	}
}

package chekpoint3;
//-> para fazer!

public class Contribuintes {
	public void addContribuintes(Contribuinte c) {
		//adicionar Contribuinte no array/vetor
	}
	
	public void apresentarContribuinte() {
		//apresentar os dados dos contribuintes
	}
}
