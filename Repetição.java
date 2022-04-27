package construtores;

public class ExemploRepeticao {
public static void main(String[] args) {
	
	String nome = "José";
	double salario = 1500;
	int cont = 0;
	
	System.out.println("Salário inicial: " + salario);
	
	while(salario < 5000) {
		salario = salario + (salario * 0.1);
		System.out.println("Novo salario: " + salario);
		cont++;
	}
	
	//printf - print com formatação(format)
	// %s - String
	// %c - caractere
	// %d - int
	// %f - %.2f - casas decimais
	// \n - quebra linha
	
	System.out.printf("%s, seu salário final é de: %.2f \n", nome, salario);
	System.out.printf("Tempo: %d meses \n", cont);
	System.out.println("Tempo: " + cont + " meses");
}
}
--------------------------------------------------------------------------------

public static void main(String[] args) {
	int i = 200;
	int f = 100;
	
	while(i > f) {
		System.out.println("i: " + i);
		if(i == 150)
			break;
		i--;  // i-=1
	}
}

public static void main(String[] args) {
	int i = 100;
	int f = 200;
	
	if(i < f) {
		System.out.printf("%d deve ser maior que %d \n", i, f);
	}else {
		while(i > f) {
			System.out.println("i: " + i);
			if(i == 150)
			break;
		i--;  // i-=1
	}
}
}
--------------------------------------------------------------------------------

package construtores;

import java.util.Scanner;

public class repeticao {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int op =0;
	boolean continuar = true;
	
	while(continuar) {
	System.out.println("1-Domingo");
	System.out.println("2-Segunda-feira");
	System.out.println("3-Terça-feira");
	System.out.println("4-Quarta-feira");
	System.out.println("5-Quinta-feira");
	System.out.println("6-Sexta-feira");
	System.out.println("7-Sábado");
	System.out.println("Opção: ");
	op = input.nextInt();
	if(op < 7 || op > 1) {
		continuar = false;
	}
	}
	
	switch(op){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			default:
				System.out.println("Dia da semana inválido");
	}
	
}
}
--------------------------------------------------------------------------------

package construtores;

import java.util.Scanner;

public class repeticao {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int op =0;
	boolean continuar = true;
	
	while(continuar) {
	System.out.println("1-Domingo");
	System.out.println("2-Segunda-feira");
	System.out.println("3-Terça-feira");
	System.out.println("4-Quarta-feira");
	System.out.println("5-Quinta-feira");
	System.out.println("6-Sexta-feira");
	System.out.println("7-Sábado");
	System.out.println("Opção: ");
	op = input.nextInt();
	if(op < 7 || op > 1) {
		continuar = false;
	}
	}
	-------------
	switch(op){
		case 1:
			System.out.println("Ingresso - R$100.00");
		case 2:
		case 3:
		case 4:
			System.out.println("Ingresso - R$50.00");
			break;
		case 5:
		case 6:
			System.out.println("Ingresso - R$80.00");
			break;
		case 7:
			System.out.println("Fechado");
			default:
				System.out.println("Dia da semana inválido");
	}
	
}
}
