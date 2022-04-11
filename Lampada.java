package cp1;

public class Lampada {
  private boolean status;
  
  public void ligar() {
	  status = true;
  }
  
  public void desligar() {
	  status = false;
  }
  
  public boolean obterStatus() {
	  return status;
  }
  public void mostraStatus(boolean status) {
	  if(status == true) {
		  System.out.println("Ligada!!");
	  } else {
		  System.out.println("Desligada!!");
	  }
   }

 public static void main(String[] args) {
	Lampada lamp = new Lampada();
	System.out.println("Status: " + lamp.obterStatus() );
	lamp.ligar();
	System.out.println("Status: " + lamp.obterStatus());
	lamp.mostraStatus(lamp.obterStatus());
	lamp.desligar();
	lamp.mostraStatus(lamp.obterStatus());
}
}
