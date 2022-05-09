package heranca;

public class Animal {
	//atributos
	private String especie;
	private String cor;
	private String habitat;
	
	//Construtor
	public Animal(String especie, String cor, String habitat) {
		this.especie = especie;
		this.cor = cor;
		this.habitat = habitat;
	}
	
	public void fazerBarulho() {
		System.out.println("fazer barulho");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}

package heranca;
 
public class Cachorro extends Animal {
	private int nPatas;
	

	
	 public int getnPatas() {
		return nPatas;
	}


	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}


	public Cachorro(String especie, String cor, String habitat, int nPatas) { 
		super(especie, cor, habitat);
		this.setnPatas(nPatas);
	}
	 
	public void fazerBarulho() {
		System.out.println("Au au!");
	}
}

package heranca;

public class Gato extends Animal {

	public Gato(String especie, String cor, String habitat) {
		super(especie, cor, habitat);
	}
	
	public void fazerBarulho() {
		System.out.println("Miau!");
	}

}

package heranca;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Maltês", "Branco", "Doméstico", 4);
		Gato cat = new Gato("Vira-Lata", "Listrado", "Doméstico");
		
		System.out.println(dog);
		System.out.println(cat);
		
		System.out.println("Espécie: " + dog.getEspecie());
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Habitat: " + dog.getHabitat());
		dog.fazerBarulho();
		System.out.println("Patas: " + dog.getnPatas());
		System.out.println("Espécie: " + cat.getEspecie());
		System.out.println("Cor: " + cat.getCor());
		System.out.println("Habitat: " + cat.getHabitat());
		cat.fazerBarulho();
		
	}

}