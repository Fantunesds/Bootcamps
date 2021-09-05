package abstratasinterfaces;

public class Aplicacao {

	public static void main(String[] args) {
		
		Diamante d = new Diamante();
		d.pegar();
		
		Cogumelo c = new Cogumelo();
		c.pegar();
		
		Item m = new Moeda();
		m.pegar();

	}

}
