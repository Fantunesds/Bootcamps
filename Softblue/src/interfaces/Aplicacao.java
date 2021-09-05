package interfaces;

public class Aplicacao {

	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();
		
		Rota rota = new Rota();
		
		rota.ir(f);
		
		
		Anelbrilhante a = new Anelbrilhante();
		
		Vendedor v = new Vendedor();
		
		v.mostrarPreco(a);
		v.mostrarPreco(f);
		
		

	}

}
