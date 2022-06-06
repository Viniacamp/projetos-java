
public class Refrigerante extends Bebida { 

	public Refrigerante() {
		super("Refrigerante", false); //aqui, o super chama o construtor da superclasse, que neste caso é a classe Bebida
		
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Gelo no copo");
	}
	
}
