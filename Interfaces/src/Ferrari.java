
//agora quando uma classe for herdar de uma interface, usa-se o comando implements
public class Ferrari implements Automovel, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("zuouoummm, Ferrari acelerou");
		
	}

	@Override
	public double getPreco() {
		return 1000000;
	}
	
}
