package checkpoint;

public class Lampada {
	
	Boolean Lampada;
	
	
	public void setLampada(Boolean lampada) {
		this.Lampada = true;
	}
	
	public void ligar() {
		this.Lampada = true;
	}
	
	public void desligar() {
		this.Lampada = false;
	}
	
	public Boolean getEstado() {
		return this.Lampada;
	}
	

	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		lamp.setLampada(null);
		System.out.println(lamp.getEstado());
		lamp.desligar();
		System.out.println(lamp.getEstado());
		lamp.ligar();
		System.out.println(lamp.getEstado());
	}

}
