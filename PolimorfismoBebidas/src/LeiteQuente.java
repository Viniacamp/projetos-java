
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true); 
	}

	@Override
	public void preparar() { 
		super.preparar(); //aqui, o comando super chama o método preparar da superclasse
		System.out.println("Servir leite quente");
	}

}

