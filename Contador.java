package cp1;

public class Contador {
    private int cont;


    public void zerarCont(int num) {
	cont = num;
}

public void incrementarCont(int valor) {
	cont += valor;
}

public int retornarCont() {
	return cont;
}

public static void main(String[] args) {
	Contador c1 = new Contador();
	c1.zerarCont(0);
	c1.incrementarCont(1);
	System.out.println("Contador: " + c1.retornarCont());
  }
}