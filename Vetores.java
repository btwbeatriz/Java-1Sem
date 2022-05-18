package aula14_vetores;

import java.util.Scanner;

public class Exe1_vetores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamanho = 10, cont = 0;
		int[] vetor = new int[tamanho];
		
		//preenchendo o vetor
		for (int i=0; i<tamanho; i++) {
			System.out.printf("Vetor [%d}: ", i);
			vetor[i] = input.nextInt();
		//imprimindo números positivos
			if(vetor[i] > 0) {
				cont++;
			}
		}
		System.out.println("Quantidade de números positivos: " + cont);
		
		//percorrendo o vetor
		for(int i=0; i<tamanho; i++) {
			//if vetor par imprimir
			if(vetor[i]%2 == 0)
				System.out.printf("Vetor[%d]: %d \n", i, vetor[i]);
		}
		
		input.close();
	}

}

//Vetores com Métodos

package aula14_vetores;

import java.util.Scanner;

public class VetoresComMetodos {
	
	public int tamanhoVetor() {
		System.out.println("*-- TAMANHO DO VETOR --*");
		Scanner input = new Scanner(System.in);
		System.out.println("Qual tamanho de vetor você deseja criar?: ");
		int t = input.nextInt();
		return t;
	}
	
	public int[] criaVetor(int t) {
		System.out.println("*-- CRIA O VETOR --*");
		int[] vetor = new int[t];
		return vetor;
	}
	
	public int[] populaVetor(int[] vetor) {
		System.out.println("*-- PREENCHE O VETOR --*");
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < vetor.length; i++) {
		System.out.printf("Vetor [%d]: ", i);
		vetor[i] = input.nextInt();
		}
		return vetor;
	}
		
	public void imprimirVetor(int[] vetor) {
		System.out.println("*-- IMPRIME O VETOR --*");
		for (int i=0; i < vetor.length; i++) {
			System.out.printf("Vetor [%d]: %d \n", i, vetor[i]);
		
		}
	}
	
	public int verificarOcorrencias(int[] vetor, int n) {
		System.out.println("*-- VERIFICANDO OCORRÊNCIAS --*");
		int cont = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == n) {
				cont++;
			}
		}
		return cont;
	}
}

// 

package aula14_vetores;

public class TesteVetoresComMetodos {
	public static void main(String[] args) {
		VetoresComMetodos vm = new VetoresComMetodos();
		int t = vm.tamanhoVetor();
		int[] vetor = vm.criaVetor(t);
		vetor = vm.populaVetor(vetor);
		vm.imprimirVetor(vetor);
		
		int n = 3;
		int cont = vm.verificarOcorrencias(vetor, n);
		System.out.printf("Ocorrências do número %d: %d", n, cont);
	}

}

