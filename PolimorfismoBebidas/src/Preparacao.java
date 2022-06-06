
public class Preparacao { 
	
	public void prepararBebida(Bebida bebida) { 
		
		System.out.println("Preparando " + bebida.getNome());
		bebida.preparar();
		
		if (bebida.isAquecer()) { //se a bebida precisar ser aquecida, a mensagem abaixo irá ser exibida
			System.out.println("Aquecendo " + bebida.getNome());
		}
		
		System.out.println("Servir " + bebida.getNome() + " no copo "); //getNome = puxa o nome da bebida criada
		System.out.println("Bebida pronta!");
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- ");
	
	}	
	
}
