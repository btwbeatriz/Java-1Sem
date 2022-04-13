public class Funcionario {
	//atributos
	private String nome;
	private String depto;
	private double salario;
	private String admissao;
	private String rg;
	
	//getters e setters
	
	public String getNome() {
		return nome;
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDepto() {
		return depto;
	}
	
	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	public String getAdmissao() {
		return admissao;
	}
	
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getRG() {
		return rg;
	}
	
	public void setRG(String rg) {
		this.rg = rg;
	}
	
	public double aumentarSalario(double perc) {
		double novoSalario = this.salario +(salario * (perc/100));
		return novoSalario;
	}
	
	public double calculoGanhoReal(double novoSalario) {
		double ganhoReal = novoSalario - salario;
		return ganhoReal;
	}
	
}

public class TesteFuncionário {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Beatriz");
		f1.setDepto("Compras");
		f1.setAdmissao("13/04/22");
		f1.setRG("1.123.321-8");
		f1.setSalario(6000.00);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Paulo");
		f2.setDepto("Vendas");
		f2.setSalario(6000.00);
		
		System.out.println("Func 1 " + f1.getNome());
		System.out.println("Depto: " + f1.getDepto());
		System.out.println("Salário: " + f1.getSalario());
		System.out.println("==============");
		System.out.println("Func 2 " + f2.getNome());
		System.out.println("Depto: " + f2.getDepto());
		System.out.println("==============");
		
		double novoSalario = f1.aumentarSalario(10);
		System.out.println("Novo Salário Beatriz: " + novoSalario);
		f1.setSalario(novoSalario);
		
		double novoSalario2 = f2.aumentarSalario(15);
		System.out.println("Novo Salário Paulo: " + novoSalario2);
		System.out.println("==============");
		double r = f2.calculoGanhoReal(novoSalario2);
		System.out.println("Ganhos/Paulo: " + r);
		
        //adicionar novos métodos / funcionalidades
	}
	

}
