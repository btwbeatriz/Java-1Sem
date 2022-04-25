package construtores;

import java.util.Scanner;

public class Caixa {
	//atributos
	private double largura;
	private double altura;
	private double profundidade;
	
	//construtor
	public Caixa() {
		System.out.println("Construção da Caixa");
		this.largura = 10;
		this.altura = 10;
		this.profundidade = 10;
	}
	
	//construtor parametrizado
	public Caixa(double l, double a, double p){
		largura = l;
		altura = a;
		profundidade = p;
	}
	
	//métodos
	public double volumeCaixa() {
		System.out.println("Calculando o volume da caixa...");
		return largura * altura * profundidade;
	}
	
	public void entradaDados() {
		System.out.println("Entrada de dados");
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a largura: ");
		double l = input.nextDouble();
		System.out.println("Digite a altura: ");
		double a = input.nextDouble();
		System.out.println("Digite a profundidade: ");
		double p = input.nextDouble();
		//configurando os dados do objeto
		setLargura(l);
		setAltura(a);
		setProfundidade(p);
	}
	
	public double entradaDados2() {
		System.out.println("Entrada de dados 2");
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		return n;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
}

package construtores;

public class TesteCaixa {
public static void main(String[] args) {
	Caixa c1 = new Caixa();
	System.out.println("Volume c1: " + c1.volumeCaixa());
	
	System.out.println("==========");
	
	Caixa c2 = new Caixa(10, 20, 15);
	System.out.println("Volume c2: " + c2.volumeCaixa());
	
	System.out.println("==========");
	
	Caixa c3 = new Caixa(); {
		c3.entradaDados();
		System.out.println("Volume: " + c3.volumeCaixa());
		
		System.out.println("==========");
		double largura, altura, profundidade;
		System.out.println("Largura: ");
		largura = c1.entradaDados2();
		System.out.println("Altura: ");
		altura = c1.entradaDados2();
		System.out.println("Profundidade: ");
		profundidade = c1.entradaDados2();
		Caixa c4 = new Caixa(largura, altura, profundidade);
		System.out.println("Volume c4 : " + c4.volumeCaixa());
	}
  }
}

