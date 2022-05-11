package aula12_heranca;

public class Veiculo {
	    //Construtor
	    public Veiculo(){
	        System.out.println("Veículo");
	    }
}

package aula12_heranca;
public class Automovel extends Veiculo{
    //Construtor
    public Automovel(){
        System.out.println("Automovel");
    }

    //Métodos
    public void chekList(){
        System.out.println("Automovel.cheksList");
    }

    public void adjust(){
        System.out.println("Automovel.adjust");
    }

    public void cleanUp(){
        System.out.println("Automovel.cleanUp");
    }
}

package aula12_heranca;

public class Bicicleta extends Veiculo{
    //Construtor
    public Bicicleta(){
        System.out.println("Bicicleta");
    }

    //Metodos
    public void chekList(){
        System.out.println("Bicicleta.chekList");
    }
    public void adjust(){
        System.out.println("Bicicleta.adjust");
    }
    public void cleanUp(){
        System.out.println("Bicicleta.cleanUp");
    }
}

package aula12_heranca;

public class TesteVeiculo{
    public static void main(String[] args){
        Automovel carro = new Automovel();
        carro.chekList();

        Bicicleta bike = new Bicicleta();
        bike.chekList();

        
    }
}

package aula12_heranca;

public class Carro {
	//Atributos
	private String cor;
	private double preco;
	private String modelo;
	
	//Construtor
	public Carro() {
		
	}
	
	//Construtor com 2 parâmetros
	public Carro(String modelo, double preco) {
		this.setCor("Preta");
		this.setModelo(modelo);
		this.setPreco(preco);
	}
	
	//Construtor com 3 parâmetros
	public Carro(String cor, String modelo, double preco) {
		this.setCor(cor);
		this.setModelo(modelo);
		this.setPreco(preco);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}

private String motor;
	
//Construtor padrão
    public Honda() {
		
	}
	
	public Honda(String motor, String modelo, double preco) {
		super(modelo, preco);
		this.setMotor(motor);
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
package aula12_heranca;

public class TesteCarro {
public static void main(String[] args) {
	Honda carro1 = new Honda("2.0 Flex", "Honda Civic", 60000);
	System.out.println(carro1);
	
	System.out.println("Modelo: " + carro1.getModelo());
	System.out.println("Cor: " + carro1.getCor());
	System.out.println("Motor: " + carro1.getMotor());
}
}
