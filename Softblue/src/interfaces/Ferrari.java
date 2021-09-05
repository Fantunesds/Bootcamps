package interfaces;

public class Ferrari implements Carro,ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("ferrari virou a Direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abre porta");
		
	}

	@Override
	public double getPreco() {
		return 1000000;
		
	}

}
