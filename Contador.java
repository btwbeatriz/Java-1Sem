package checkpoint;

public class Contador {
	
	int c;
		
	public void setCont(int c) {
		this.c = c;
	}
	
	public void Zerar() {
		this.c = 0;
	}
	
	public int incrementC() {
		this.c = c + 1; return c;
	}
	public int getItem() {
		return this.c;
	}
	
	public static void main(String[] args) {
		Contador c1 = new Contador();
		c1.setCont(0);;
		System.out.println(c1.getItem());
		c1.incrementC();
		System.out.println(c1.getItem());
		c1.Zerar();
		System.out.println(c1.getItem());
		c1.incrementC();
		System.out.println(c1.getItem());
		c1.incrementC();
		System.out.println(c1.getItem());
	}

}
