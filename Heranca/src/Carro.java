//em uma herança, a classe menor (subclasse) herda, por meio do comando extends, as características contidas na classe maior (superclasse), 
//que é nesse caso a classe Veiculo
public class Carro extends Veiculo {
	private boolean quatroPortas;

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem quatro portas: " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
//	if (quatroPortas == true) {
//		System.out.println("Sim");
//	}else {
//		System.out.println("Não");
//	}
	
	
}
